//Escreva uma algoritmo que receba os valores dos dois catetos de um triângulo retângulo e
//retorne o valor da hipotenusa.

import java.util.Scanner;

public class pitagoras{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do Cateto: ");
        int cateto1 = input.nextInt();
        System.out.println("Digite o vallor do Cateto Oposto: ");
        int cateto2 = input.nextInt();
        int hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);
        double resultado = Math.sqrt(hipotenusa);
        System.out.println("Sua Hipotenusa vale: " + resultado );
        input.close();
    }
}