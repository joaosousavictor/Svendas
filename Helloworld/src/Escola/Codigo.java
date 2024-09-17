package Escola;

public class Codigo {
    private String[] nomes;
    private int[] idades;
    
    // Construtor que aceita tanto nomes quanto idades
    public Codigo(String[] nomes, int[] idades) {
        this.nomes = nomes;
        this.idades = idades;   
    }

    // Método para exibir nomes e idades juntos
    public void exibirNomesEIdades() {
        // Verifica se o comprimento dos arrays é igual
        if (nomes.length != idades.length) {
            System.out.println("O número de nomes e idades não coincide.");
            return;
        }
        
        // Exibe cada nome junto com a idade correspondente
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i] + " " + idades[i]);
        }
    }
}
