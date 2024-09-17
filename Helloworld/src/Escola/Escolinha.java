package Escola;

public class Escolinha {

    public static void main(String[] args) {
        // Criando um array com quatro nomes
        String[] nomes = {"Alice", "Bob", "Carol", "Dave"};
        // Criando um array com quatro idades
        int[] idades = {10, 20, 30, 40};

        // Criando uma instância de Codigo com nomes e idades
        Codigo codigo = new Codigo(nomes, idades);

        // Exibindo os nomes e idades juntos
        codigo.exibirNomesEIdades();
    }
}
