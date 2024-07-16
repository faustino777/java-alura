public class HoraPratica08Main {
    public static void main(String[] args) {
    HoraPratica08Idade maioridade = new HoraPratica08Idade();

    maioridade.setNome("Zezin Cabuloso");
    maioridade.setIdade(20);

        System.out.println(maioridade.getNome());
        System.out.println(maioridade.getIdade());
        maioridade.maiorDeIdade();
    }
}
