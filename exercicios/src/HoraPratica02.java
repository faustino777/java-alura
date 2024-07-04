import java.util.Scanner;

public class HoraPratica02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numeroPN = entrada.nextDouble();

        if (numeroPN > 0) {
            System.out.println("Número positivo.");
        } else {
            System.out.println("Número negativo");
        }

        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numeroI = entrada2.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int numeroI2 = entrada3.nextInt();

        if ( numeroI == numeroI2) {
            System.out.println("Os números são iguais.");
        } else if ( numeroI > numeroI2 ) {
            System.out.println("O primeiro número é maior que o segundo.");
        } else {
            System.out.println("O primeiro número é menor que o segundo.");
        }

        


    }
}
