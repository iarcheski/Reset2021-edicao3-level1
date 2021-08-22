import java.util.Scanner;

public class EntreDoisNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o número ao qual quer dar início: ");
        int valorDeInicio = teclado.nextInt();

        boolean numeroFinaleInicial = false;
        int valorFinal = 0;
        do {
            System.out.print("Informe o número ao qual quer finalizar: ");
            valorFinal = teclado.nextInt();
            if (valorFinal > valorDeInicio) {
                numeroFinaleInicial = true;
            } else {
                System.out.println("O número final necessita ser maior que o numero de início.");
            }
        } while (!numeroFinaleInicial);

        for (int contador = valorDeInicio; contador <= valorFinal; contador++) {
            System.out.println(contador);
        }
    }
}