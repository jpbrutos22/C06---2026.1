import java.util.Scanner;

public class Main {

  static void main() {

    Scanner entrada = new Scanner(System.in);
    System.out.print("Entre com o valor da NP1: ");
    int NP1 = entrada.nextInt();
    System.out.print("Entre com o valor da NP2: ");
    int NP2 = entrada.nextInt();

    float NPA = (float) (NP1 + NP2) / 2;

    if (NPA >= 60) {
      System.out.println("Parabéns, você passou!");
    }
    else {
      System.out.print("Você não passou e ficou de NP3, diga sua nota da NP3: ");
      float NP3 = entrada.nextInt();
      float resultado = (NPA + NP3) / 2;

      if (resultado >= 50) {
        System.out.println("Parabéns, você passou por pouco! ^_^");
      }
      else {
        System.out.println("Você não passou. :(");
      }
    }
    entrada.close();

  }

}
