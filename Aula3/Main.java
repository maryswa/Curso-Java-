
public class Main {
  public static void main(String[] args) {

//instanciamento de um objeto 
Pessoa pessoa1 = new Pessoa("Miguel", 17);
Pessoa pessoa2 = new Pessoa("Thaisa", 18); 
Pessoa pessoa3 = new Pessoa("Sofia", 17);    
    

System.out.println(pessoa3.getNome());  
System.out.println(pessoa3.getIdade()); 
System.out.println(pessoa3.exibirInfo());    
  }

}