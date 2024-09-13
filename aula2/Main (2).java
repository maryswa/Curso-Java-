// Definir a classe pessoa
class Pessoa {
  // Definir os atributos da classe
  String nome;
  int idade;

  // Definir o construtor da classe
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  // método para exibir os dados da pessoa
  public void exibirDados() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);

  }
}

public class Main {
  public static void main(String[] args) {
    // Criando um objeto pessoa
    Pessoa pessoa1 = new Pessoa("Maryssa", 18);
    Pessoa pessoa2 = new Pessoa("Thaisa", 17);
    Pessoa pessoa3 = new Pessoa("Miguel", 17);

    pessoa1.exibirDados();
    pessoa2.exibirDados();
    pessoa3.exibirDados();
  }
}
