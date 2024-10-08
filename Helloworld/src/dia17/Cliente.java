package dia17;

public class Cliente {
	private String nome;
    private String cpf;

    // Construtor: Inicializa os atributos da classe
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Métodos acessores (getters) e modificadores (setters) para o encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}