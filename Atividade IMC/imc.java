import java.util.Scanner;

class Atividade {
    public static void main(String[] args){
        Scanner lerTeclado = new Scanner(System.in);
        String nome;
        char genero, generoMaior;
        double altura, peso;

        System.out.println("Digite seu nome: ");
        nome = lerTeclado.next();

        System.out.println("\nDigite sua altura (Ex.: 1,84): ");
        altura = lerTeclado.nextDouble();

        System.out.println("\nDigite seu peso (Ex.: 96,5): ");
        peso = lerTeclado.nextDouble();
    
        System.out.println("\nInforme seu gênero: \n [M] Masculino \n [F] Feminino \n [N] Se deseja não informar :" );
        genero = lerTeclado.next().charAt(0);
        generoMaior = Character.toUpperCase(genero);

        //Calcular IMC
        double imc = peso / (altura*altura);
        System.out.println("Nome: "+nome);
        System.out.println("Gênero: "+genero);
        System.out.println("Peso: "+peso);
        System.out.println("Altura: "+altura);
        System.out.println("IMC: "+Math.floor(imc));
    
        //Classificação IMC - Masculino / Feminino

        if (generoMaior == 'M'){
            if(imc > 40){
                System.out.println("Classificação: Obesidade Mórbida");
            }else if(imc >= 30 && imc <= 39.9){
                System.out.println("Classificação: Obesidade Moderada");
            }else if(imc >=25 && imc <=29.9){
                System.out.println("Classificação: Obesidade Leve");
            }else if(imc >= 20 && imc <= 24.9){
                System.out.println("Classificação: Normal");
            }else{
                System.out.println("Classificação: Abaixo do Normal");
            }
        }else if (generoMaior == 'F' | generoMaior == 'N');{
            if(imc > 39){
                System.out.println("Classificação: Obesidade Mórbida");
            }else if(imc >= 29 && imc <= 38.9){
                System.out.println("Classificação: Obesidade Moderada");
            }else if(imc >=24 && imc <=28.9){
                System.out.println("Classificação: Obesidade Leve");
            }else if(imc >= 19 && imc <= 23.9){
                System.out.println("Classificação: Normal");
            }else{
                System.out.println("Classificação: Abaixo do Normal");
            }
        }
        lerTeclado.close();
    }  
}