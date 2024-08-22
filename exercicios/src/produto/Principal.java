package produto;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Sabão", 5.50, 2);

        Produto produto2 = new Produto("Arroz", 6.30, 4);

        ProdutoPerecivel produto3 = new ProdutoPerecivel("Lenguiça", 7.50, 1, "12/2");

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        System.out.println("A lista contém " + listaProdutos.size() + " objetos.");

        for (int i = 0; i < listaProdutos.size(); i++) {
            System.out.println("Item " + i + ": " + listaProdutos.get(i).toString());
        }

        System.out.println(produto3.getDataValidade());

    }
}
