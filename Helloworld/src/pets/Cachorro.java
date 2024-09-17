package pets;

import javax.swing.JOptionPane;

public class Cachorro {
    
    String nome;
    int idade;
    
    public Cachorro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void mostrarInformacoes() {
        String mensagem = "Nome do cachorro é: " + nome + "\nIdade do cachorro é: " + idade;
        
        // Display information in a dialog box
        JOptionPane.showMessageDialog(null, mensagem, "Informações do Cachorro", JOptionPane.INFORMATION_MESSAGE);
    }
}