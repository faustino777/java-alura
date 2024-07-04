import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinhacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nAleatorio = new Random().nextInt(100);
        int nTentativas = 0;

        while (nTentativas < 5) {
            System.out.println("Tente adivinhar qual o número, inserindo um número entre 0 e 100: ");
            int nInserido = entrada.nextInt();

             if (nInserido == nAleatorio) {
                 System.out.println("Você adivinhou o número!");
                 break;
             } else if ( nInserido < nAleatorio) {
                 System.out.println("Você digitou um número menor que o número gerado.");
                 nTentativas++;
             } else {
                 System.out.println("Você digitou um número maior que o número gerado.");
                 nTentativas++;
             }

            if (nTentativas == 5) {
                System.out.println("Você errou as suas 5 tentativas.");

            }



        }
    }
}
