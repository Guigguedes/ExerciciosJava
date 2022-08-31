import java.util.Scanner;
import java.io.IOException;

public class help {
    public static void main(String[] args) throws IOException, InterruptedException{
        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.println("Help Java \n(1) Instrução IF Simples \n(2) Instrução IF com blocos de comandos \n(3) Instrução IF aninhado \n(4) Instrução SWITCH \nEscolha uma opção:");
        opcao = input.nextInt();
        switch(opcao){
            case 1:
                if (System.getProperty("os.name").contains("Windows"))
                    new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
                System.out.println("ESTRUTURA IF SIMPLES:\n \nif (condicao)  instrucao; \nelse  instrucao;");
                break;
            case 2:
                if (System.getProperty("os.name").contains("Windows"))
                    new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
                System.out.println("ESTRUTURA IF COM BLOCOS DE COMANDOS:\n \nif (condicao) { \n instrucao1; \n instrucao2; \n} \nelse { \n instrucao1; \n instrucao2; \n}");
                break;
            case 3:
                if (System.getProperty("os.name").contains("Windows"))
                    new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
                System.out.println("ESTRUTURA IF ANINHADO:\n \nif (condicao1) { \n instrucao1; \n instrucao2; \n} \nelse if (condicao2) { \n instrucao1; \n instrucao2; \n} \nelse { \n instrucao1; \n instrucao2; \n}");
                break;
            case 4:
                if (System.getProperty("os.name").contains("Windows"))
                    new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
                System.out.println("ESTRUTURA SWITCH:\n \nswitch (expressao) { \n case valor1: \n instrucao1; \n instrucao2; \n break; \n case valor2: \n instrucao1; \n instrucao2; \n break; \n default: \n instrucao1; \n instrucao2; \n break; \n}");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        input.close();
    }   
}
