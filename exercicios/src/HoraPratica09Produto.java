public class HoraPratica09Produto {
    private String name;
    private double preco;

    public String getName() {
        return name;
    }

    public double getPreco() {
        return preco;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void desconto() {
        double valorDesconto = this.preco * 20/100;
        System.out.println("O valor do produto com desconto é: " + "R$" + (preco - valorDesconto));
    }
}
