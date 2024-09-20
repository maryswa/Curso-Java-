import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);

    Double num1;
    Double num2;
    String operacao;

    System.out.println("Digite o primeiro numero:");
    num1 = Scanner.nextDouble();

    System.out.println("Digite a operação(+, -, *, /):");
    operacao = Scanner.next();

    System.out.println("Digite o segundo numero:");
    num2 = Scanner.nextDouble();

    // -------------------------------
    System.out.println("Resultado:" + calculo(num1, operacao, num2));

    Scanner.close();

  }

  public static Double calculo(Double num1, String operacao, Double num2) {
    Double resposta = 0.0;
    if (operacao.equals("+")) {
      resposta = num1 + num2;
    }
    if (operacao.equals("-")) {
      resposta = num1 - num2;
    }
    if (operacao.equals("*")) {
      resposta = num1 * num2;
    }
    if (operacao.equals("/")) {
      resposta = num1 / num2;
    }
    return resposta;
  }
}