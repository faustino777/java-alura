public class HoraPratica10Aluno {
    private String nome;
    private int nota1 = 10;
    private int nota2 = 10;
    private int nota3 = 10;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public void detalhes(){
        System.out.println("O nome do aluno é: " + nome);
        double media = (double) 3 / (nota1 + nota2 + nota3);
        System.out.println("A média do aluno é: " + media);
    }
}
