<img src="foto2.PNG" alt="Imagem">
<h1># Cadastro de Produtos e Clientes

Este projeto é um sistema simples de cadastro de produtos e clientes, focando em produtos eletrônicos. O projeto demonstra conceitos de **herança**, **polimorfismo** e **abstração** em Java.

## Funcionalidades

- Cadastro de clientes com nome e CPF.
- Cadastro de produtos eletrônicos com nome, preço e marca.
- Exibição de detalhes dos produtos cadastrados.

## Estrutura de Classes

### Classe `Produto`
Classe abstrata que define a estrutura básica de um produto, com os atributos:
- `nome`: Nome do produto.
- `preco`: Preço do produto.

A classe `Produto` possui um método abstrato `exibirDetalhes()`, que é implementado nas subclasses.

### Classe `Eletronico`
Subclasse de `Produto` que representa produtos eletrônicos. Além dos atributos herdados de `Produto`, a classe `Eletronico` possui:
- `marca`: Marca do produto eletrônico.

A classe `Eletronico` implementa o método `exibirDetalhes()`, que exibe as informações do produto eletrônico.

### Classe `Cliente`
Classe que representa um cliente com os seguintes atributos:
- `nome`: Nome do cliente.
- `cpf`: CPF do cliente.

## Exemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente("João Silva", "123.456.789-00");

        // Criando um produto eletrônico
        Eletronico smartphone = new Eletronico("Smartphone", 1500.0, "Samsung");

        // Exibindo detalhes do cliente
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());

        // Exibindo detalhes do produto
        smartphone.exibirDetalhes();
    }
}
</h1>  

<h2>Saída Esperada:
makefile
Copiar código
Cliente: João Silva
CPF: 123.456.789-00
Nome: Smartphone
Preço: 1500.0
Marca: Samsung
Tecnologias Utilizadas
Linguagem: Java
IDE: Eclipse
Como Executar o Projeto
Clone o repositório:
bash
Copiar código
git clone <URL do repositório>
Importe o projeto na sua IDE (por exemplo, Eclipse).
Compile e execute a classe Main para testar o funcionamento.
Observações
Este projeto é um exemplo simples para praticar os conceitos de programação orientada a objetos. Para mais informações ou sugestões, entre em contato.
</h2>




<h2>Contribuidores
João Silva - Desenvolvimento inicial
Licença
Este projeto está licenciado sob a MIT License.</h2>









