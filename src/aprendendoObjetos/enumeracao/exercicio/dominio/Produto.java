package aprendendoObjetos.enumeracao.exercicio.dominio;

public class Produto {
    private String nome;
    private double preco;
    CategoriaProduto categoria;

    public Produto(String nome, double preco, CategoriaProduto categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }

    public double calcularPrecoDesconto() {
        return this.preco - this.categoria.calcularDesconto(preco);
    }

    @Override
    public String toString() {
        return "Produto: " + this.nome +
                ", Preço: R$" + this.preco +
                ", Categoria: " + this.categoria +
                ", Preço com Desconto: R$" + calcularPrecoDesconto();
    }
}
