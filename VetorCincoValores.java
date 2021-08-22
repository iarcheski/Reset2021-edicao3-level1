import java.util.Scanner;

public class VetorCincoValores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] vetorUm = new int[5];
        for(int contador = 0; contador < vetorUm.length; contador++) {
            System.out.println("Digite o valor do vetor " + contador + ":");
            vetorUm[contador] = teclado.nextInt();
        }

        int[] vetorDois = new int[vetorUm.length];
        for (int contador = 0; contador < vetorUm.length; contador++){
            vetorDois[contador] = vetorUm[contador] * 2;

        }
        System.out.println("Vetor um: ");
        for (int item : vetorUm) {
            System.out.println(item);
        }
        System.out.println("Vetor dois: ");
        for (int item : vetorDois) {
            System.out.println(item);
        }
    }
}