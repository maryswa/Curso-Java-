import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
   //Criando uma distancia do Scanner
    Scanner scanner  = new Scanner(System.in);

    //solicitando o tamanho do array
    System.out.printf("Quantos numeros você deseja inserir?");
    int tamanho = scanner.nextInt();

    //Criando um array
    int[] numeros = new int[tamanho];

    //Inserindo os numeros no array
    for(int i = 0; i < tamanho; i++){
      System.out.printf("Digite o numero " + (i + 1)+":");
      numeros[i] = scanner.nextInt();
    }

    //Ordenando o array
    Arrays.sort(numeros);

    //Exibindo todos os numeros
    for(int i = 0; i < tamanho; i++){
      System.out.println(numeros[i]);
    }
    //Fechando o Scanner
  scanner.close();
  }

  }