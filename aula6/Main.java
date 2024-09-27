import java.util.Arrays;
import java.util.Collections;


public class Main {
  public static void main(String[] args) {
    //1-Criação de um array
    int[] numbers = {4,5,2,3,1,9};
    System.out.println("Meu array de numeros: " + Arrays.toString(numbers));
    //2-Acessando um elemento pelo index[
    System.out.println("O elemento da posição 2 é: " + numbers[2]);
    //3-Modificando um valor especifico do array
    numbers[3] = 0;
    System.out.println("O novo valor da posição 3 é: " + Arrays.toString(numbers));
    //4-Criando um array de strings
    String[] frutas = {"Pera", "Maçã", "Manga", "Uva","Mamão","Morango","Melancia"};
    //Exibindo a lista de frutas
    for(int i = 0; i < frutas.length; i++){
      System.out.println("Fruta " + (i+1) + ": " + frutas[i]);
    }
    System.out.println("-------------------------");
    //5-Instanciando um array de strings
    String[] carros = new String[4];
    //Adicionando valores aos arreys
    carros[0] = "BMW";
    carros[1] = "Ferrari";
    carros[2] = "Audi";
    carros[3] = "Mercedes";

    for(int i = 0; i < carros.length; i++){
      System.out.println("Carro " + (i+1) + ": " + carros[i]);
    }
    
System.out.println("-----------------------------------");
    //6-Ordenando arrey em ordem crescente
    Arrays.sort(numbers);
    System.out.println("Array ordenado: " + Arrays.toString(numbers));

    Integer[] numeros = {4,5,2,3,1,9};
    Arrays.sort(numeros,Collections.reverseOrder());
    System.out.println("Array em ordem decrescente: " + Arrays.toString(numeros));

    //7-Buscando um elemento no array pelo metodo binarySearch

    int index = Arrays.binarySearch(numbers, 9);
    if(index >= 0){
      System.out.println("Valor encontrado na posição: " + index);
    }else{
      System.out.println("Valor não encontrado");
    }

    //8-Preencher um array com um determinado  valor
    int[] lista = new int[5];
    Arrays.fill(lista, 0);
    System.out.println("Lista preenchida : " + Arrays.toString(lista));
  }
}