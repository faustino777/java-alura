import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaNota = 0;
        double nota = 0;


        for (int i = 0; i < 3; i++) {
            System.out.println("Qual nota você da, para o filme:");
            nota = leitura.nextDouble();
            mediaNota += nota;
        }
        String mensagem = String.format("Média de avaliações: %.2f", mediaNota / 3);
        System.out.println(mensagem);

    }
}
