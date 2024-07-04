import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaNota = 0;
        double nota = 0;
        int totalNotas = 0;


        while (nota != -1) {
            System.out.println("Qual nota você da, para o filme (-1 para encerrar): ");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaNota += nota;
                totalNotas++;
            }

        }
        String mensagem = String.format("Média de avaliações: %.2f", mediaNota / totalNotas);
        System.out.println(mensagem);
    }
}
