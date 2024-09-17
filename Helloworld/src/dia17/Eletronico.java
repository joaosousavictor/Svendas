package dia17;

//Classe concreta que herda de 'Produto'
public class Eletronico extends Produto {
 private String marca;

 // Construtor: Inicializa atributos da classe 'Eletronico' e da superclasse 'Produto'
 public Eletronico(String nome, double preco, String marca) {
     super(nome, preco);
     this.marca = marca;
 }

 // Getter e Setter para o atributo 'marca'
 public String getMarca() {
     return marca;
 }

 public void setMarca(String marca) {
     this.marca = marca;
 }

 // Implementação do método abstrato da classe 'Produto'
 // Polimorfismo: O método exibe detalhes específicos para 'Eletronico'
 @Override
 public void exibirDetalhes() {
     System.out.println("Nome: " + getNome());
     System.out.println("Preço: " + getPreco());
     System.out.println("Marca: " + marca);
 }
}
	