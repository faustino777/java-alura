package produto2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();

        produto1.setNome("Açucar");
        produto2.setNome("Arroz");
        produto3.setNome("Feijão");

        produto1.setPreco(4.50);
        produto2.setPreco(38.00);
        produto3.setPreco(7.40);


        ArrayList<Produto> listaItens = new ArrayList<>();
        listaItens.add(produto1);
        listaItens.add(produto2);
        listaItens.add(produto3);

        double somaPrecos = 0;
        for (Produto produto: listaItens) {
            somaPrecos += produto.getPreco();

        }

        double mediaPreco = somaPrecos / listaItens.size();
        System.out.println(mediaPreco);



    }
}
