import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número ao qual quer descobrir a tabuada:");
        int numero = teclado.nextInt();

        System.out.println("A tabuada do: " + numero);

        for (int contador = 1; contador <= 10; contador++){
            System.out.println(numero + " x " + contador + " = " + numero*contador);
        }

    }
}