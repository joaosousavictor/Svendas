package dia17;

// Classe abstrata para representar um produto
public abstract class Produto {
    // Encapsulamento: Atributos são privados e acessados através de métodos públicos
    private String nome;
    private double preco;

    // Construtor: Inicializa os atributos da classe
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Métodos acessores (getters) e modificadores (setters) para o encapsulamento
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

    // Método abstrato: Deve ser implementado pelas subclasses
    // Abstração: Fornece um esqueleto de método sem implementação
    public abstract void exibirDetalhes();
}