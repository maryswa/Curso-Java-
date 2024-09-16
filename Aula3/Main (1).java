
public class Main {
  public static void main(String[] args) {
    Filmes filme1 = new Filmes("O senhor dos Aneis", 1972, 178);
    Filmes filme2 = new Filmes("1917", 2023, 138);
    Filmes filme3 = new Filmes("IT: A coisa", 2017, 135);
    Filmes filme4 = new Filmes("Deadpool", 2016, 98);

    
    System.out.println(filme1.exibirInfo());
    System.out.println(filme2.exibirInfo());
    System.out.println(filme3.exibirInfo());
    System.out.println(filme4.exibirInfo());

  }

}