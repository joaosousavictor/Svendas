package fundamentos;

import javax.swing.JOptionPane;

public class ClassesDemo {

    public static void main(String[] args) {
        // Prompt the user for the name
        String nome = JOptionPane.showInputDialog("Digite o nome:");

        // Prompt the user for the age
        String idadeStr = JOptionPane.showInputDialog("Digite a idade:");

        // Convert the age from String to int
        int idade = Integer.parseInt(idadeStr);

        // Create a Pessoa object with the input data
        Pessoa pessoa = new Pessoa(nome, idade);

        // Show the information using JOptionPane
        JOptionPane.showMessageDialog(null, "Nome: " + pessoa.nome + "\nIdade: " + pessoa.idade, 
                                      "Informações da Pessoa", JOptionPane.INFORMATION_MESSAGE);
    }
}