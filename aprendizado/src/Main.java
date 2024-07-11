public class Main {
    public static void main(String[] args) {
        System.out.println("Este é o Screen Match");
        System.out.println("Filme: The Godfather");

        int anoDeLancamento = 1972;
        System.out.println("Ano do lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.2) / 3;
        System.out.println("A media de avaliação, deste filme, é: " + media);
        // Média calculada por 3 notas

        String sinopse = "Uma família mafiosa luta para estabelecer sua supremacia nos Estados Unidos depois da Segunda Guerra Mundial. Uma tentativa de assassinato deixa o chefão Vito Corleone incapacitado e força os filhos Michael e Sonny a assumir os negócios.";
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println("A classificação, deste filme, é: " + classificacao);
    }
}