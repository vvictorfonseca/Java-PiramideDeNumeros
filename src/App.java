import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      // ENUNCIADO
      //Crie uma pirâmide de números, onde você deve imprimir em cada linha separada a quantidade de números que está sendo iterado no momento!


      Scanner input = new Scanner(System.in);
      System.out.println("Digite um número para reproduziu a Pirâmide");
      int number = input.nextInt();

      String piramide = "\n\n";

      for(int i = 1; i <= number; i++) {
        for(int j = 1; j <= i; j++) {
          piramide += i;
        }
          piramide += "\n";
      }
      
      System.out.println(piramide);
    }
}
