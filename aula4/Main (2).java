import java.util.Scanner;




public class Main {
  public static void main(String[] args) {
   int meuInt = 10;
   double meuDouble = meuInt;

   System.out.println("Valor do meuInt: " + meuInt);

   System.out.println("Vaor do meuDouble após o casting: " + meuDouble);

     // casting explicito
    double outroDouble = 9.78;
    int outroInt = (int) outroDouble;

    System.out.println("Valor do outroDouble: " + outroDouble);

    System.out.println("Valor do outroInt: " + outroInt);
    
  }
}