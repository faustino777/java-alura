package Pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa1.setNome("Ximbinho");
        pessoa1.setIdade(18);

        pessoa2.setNome("Zezin");
        pessoa2.setIdade(22);

        pessoa3.setNome("Bigode");
        pessoa1.setIdade(45);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        listaDePessoas.size();
        System.out.println("Nome da primeira pessoa: " + listaDePessoas.getFirst().getNome());
        System.out.println(listaDePessoas);
    }
}
