import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Quantos numeros vc deseja inserir?");
    int tamanho = scanner.nextInt();

    //Criando um array para armazenar os numeros 
    int[] numeros = new int[tamanho];

    //prenchendo todo o arrey
    for(int i = 0; i < tamanho; i++){
      System.out.println("Digite o numero" + (i+1) + ": ");
      numeros[i] = scanner.nextInt();
    }
      //exibindo todos os valores dos arreys
      System.out.println("Você inseriu os numeros:");
      for(int i  = 0; i < tamanho; i++){
        System.out.println(numeros[i]);
      }
      scanner.close();
    }
  }