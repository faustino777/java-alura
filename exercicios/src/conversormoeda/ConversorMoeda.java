package conversormoeda;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 5.66;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: " + valorReal);


    }
}
