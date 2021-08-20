import java.util.Scanner;

public class SomaDoisNumeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int primeiroNumero = teclado.nextInt();
        System.out.println("Digite o segundo número:");
        int segundoNumero = teclado.nextInt();
        int soma = primeiroNumero + segundoNumero;
        System.out.println("A soma entre o primeiro número e o segundo número é: " + soma);


    }
}
