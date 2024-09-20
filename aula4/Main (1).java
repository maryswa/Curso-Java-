import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite alguma coisa:");
    String dadoDigitado = entrada.nextLine();

    try {
      int numero = Integer.parseInt(dadoDigitado);
      System.out.println("Você digitou um inteiro: " + numero);
    } catch (NumberFormatException e) {
      System.out.println("Você digitou uma String:");
    }
    entrada.close();
  }
}