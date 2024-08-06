package tabuadamultiplicacao;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int num) {
        System.out.println("Tabuada de multiplicação do número " + num + " :");
        for (int n = 1; n <= 10 ; n++) {
            int resultado = num * n;
            System.out.println(num + " X " + n + " = " + resultado);
        }
    }
}
