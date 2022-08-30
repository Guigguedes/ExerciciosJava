import java.util.Scanner;

public class mediaNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, media, notaExame, media2;
        
        System.out.println("Digite a primeira nota: ");
        nota1 = input.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        nota2 = input.nextDouble();
        
        media = (nota1 + nota2) / 2;
        System.out.println("A média das notas é: " + media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 5) {
            System.out.println("Exame!");
            System.out.println("Digite a nota do exame: ");
            notaExame = input.nextDouble();
            media2 = (media + notaExame) / 2;
            System.out.println("Sua média com o exame é: " + media2);
            if (media2 >= 5) {
                System.out.println("Aprovado!");
            } else {
                System.out.println("Reprovado!");
            }
        } else {
            System.out.println("Reprovado!");
        }
        input.close();
    }
}