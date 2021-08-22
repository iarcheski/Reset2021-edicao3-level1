import java.util.Scanner;

public class NotaZeroDez {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma nota entre 0 e 10:");

        boolean notaValida = false;

        do {
            double notaDigitada = teclado.nextDouble();
            if (notaDigitada <= 10 && notaDigitada >= 0) {
                notaValida = true;
                System.out.println("Sua nota é: " +notaDigitada);

            } else {
                System.out.println("A nota informada não é valida, digite outra nota entre 0 e 10:");
            }
        }while (!notaValida);

    }
}