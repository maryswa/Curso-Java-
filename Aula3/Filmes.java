public class Filmes{
  private String titulo;
  private int anoLancamento;
  private int duracao;

  //Constructor
  public Filmes(String titulo, int anoLancamento, int duracao){
    this.titulo = titulo;
    this.anoLancamento = anoLancamento;
    this.duracao = duracao;
  }

  //Metodos
  public String exibirInfo(){
    return "Titulo: " + titulo + ", Ano de Lançamento: " + anoLancamento + ", Duração: " + duracao;
  }
}