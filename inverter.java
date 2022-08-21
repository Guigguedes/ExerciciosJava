//Imagine que um cliente solicitou que você criasse uma função no sistema bem específica.
//Ele precisa que o sistema receba um número inteiro com 4 algarismos (1234, 3456, 5367, ...) 
//e que retorne na tela esse mesmo número informado porém ao contrário.
//
//Exemplos:
//- O usuário digitou 1234, então o sistema deve retornar 4321
//- O usuário digitou 2634, então o sistema deve retornar 4362
//
//Porém para realizar isto você só pode usar as operações aritméticas (+, -, *, /, %).

import java.util.Scanner;

public class inverter {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número a ser invertido: ");
        int numero = input.nextInt();
        int numeroInvertido = 0;

        while (numero > 0) {
            numeroInvertido = numeroInvertido *10;
            numeroInvertido = numeroInvertido + (numero % 10);
            numero = numero / 10;
		}
		System.out.println("Seu número invertido fica: " + numeroInvertido);
        input.close();
    }
}