public class DesafioTemperatura {
    public static void main(String[] args) {
        double temperaturaC = 30;
        double temperaturaF = (temperaturaC * 1.8) + 32;

        String mensagem = String.format("A temperatura de %.1f Celsius é equivalente a %.1f Fahrenheit.", temperaturaC, temperaturaF);
        System.out.println(mensagem);

        int temperaturaFInteira = (int) temperaturaF;
        System.out.println("A temperatura Fahrenheit inteira é: " + temperaturaFInteira);
    }
}
