package pets;

import javax.swing.JOptionPane;

public class Animal {

    public static void main(String[] args) {
        try {
            // Prompt the user for the name
            String nome = JOptionPane.showInputDialog("Digite o nome:");
            
            // Prompt the user for the age with optional text
            String idadeStr = JOptionPane.showInputDialog("Digite a idade (pode incluir texto):");
            
            // Extract numeric part from the age input and keep the original string
            String[] result = parseAgeAndText(idadeStr);
            int idade = Integer.parseInt(result[0]); // Convert numeric part to int
            String idadeTexto = result[1].trim();   // Text part of the age
            
            // Create a Cachorro object with the input data
            Cachorro cachorro = new Cachorro(nome, idade);
            
            // Show the information using a JOptionPane
            String info = "Nome: " + nome + "\nIdade: " + idade + " " + idadeTexto;
            JOptionPane.showMessageDialog(null, info, "Informações do Cachorro", JOptionPane.INFORMATION_MESSAGE);
            
            // Show detailed information using the Cachorro's method
            cachorro.mostrarInformacoes();
        } catch (NumberFormatException e) {
            // Handle the case where age is not a valid integer
            JOptionPane.showMessageDialog(null, "Por favor, insira uma idade válida com números e/ou letras.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            // Catch any other unexpected exceptions
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado. Por favor, tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
   

    // Method to extract the numeric part and keep the original string for text
    private static String[] parseAgeAndText(String str) {
        // Extract all digits from the input
        String numericPart = str.replaceAll("[^0-9]", ""); // Remove all non-digit characters
        
        // If numericPart is empty, set it to -1
        if (numericPart.isEmpty()) {
            numericPart = "-1";
        }

        // Remove the numeric part from the original string to get the remaining text
        String remainingText = str.replaceAll("[0-9]", "").trim();
        
        // Return the numeric part and the remaining text
        return new String[]{numericPart, remainingText};
    }
}