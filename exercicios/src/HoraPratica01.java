public class HoraPratica01 {
    public static void main(String[] args) {
    double nota01 = 5.20;
    double nota02 = 7.50;
    double media = (nota01 + nota02) / 2;
        System.out.println("A média é: " + media);

    double n1 = 2.50;
    int n2 = 6;
    int calculo = (int) (n1 * n2);
        System.out.println("O resultado do calculo é: " + calculo);

    char letra = 'C';
    String palavra = "ruzeiro";
        System.out.println(letra+palavra);

    double precoProduto = 30.35;
    int quantidade = 2;
    double total = precoProduto * quantidade;
    String mensagemTotal = String.format("O total é: %.2f.", total);
        System.out.println(mensagemTotal);

    double valorDolares = 100;
    double cotacaoDolares = 4.94;
    double totalDolares = valorDolares * cotacaoDolares;
    String mensagemCotacao = String.format("%.2f dólares são %.2f reais. ", valorDolares, totalDolares);
        System.out.println(mensagemCotacao);

    double precoOriginal = 50.60;
    double percentualDesconto = 15;
    double valorDesconto = precoOriginal * (percentualDesconto / 100);
    double precoNovo = precoOriginal - valorDesconto;
    String mensagemDesconto = String.format("Com o desconto de %.0f porcento, o produto passa a valer R$ %.2f .", percentualDesconto, precoNovo);
        System.out.println(mensagemDesconto);



    }
}
