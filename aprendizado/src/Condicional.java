public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1986;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";


        if (anoDeLancamento >= 2022) {
            System.out.println("O filme é um lançamento.");
        } else {
            System.out.println("Filme retro.");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado.");
        } else {
            System.out.println("Você não tem o filme ou plano.");
        }
    }
}
