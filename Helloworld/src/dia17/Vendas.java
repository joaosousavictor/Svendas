package dia17;

// Classe principal para executar o programa
public class Vendas {

    public static void main(String[] args) {
        // Instanciando objetos
        Produto produto1 = new Eletronico("Smartphone", 1500.00, "Samsung");
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");

        // Exibindo detalhes do produto
        produto1.exibirDetalhes();

        // Exibindo detalhes do cliente
        System.out.println("Cliente: " + cliente1.getNome());
        System.out.println("CPF: " + cliente1.getCpf());
    }
}