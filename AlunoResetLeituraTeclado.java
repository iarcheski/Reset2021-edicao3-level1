import java.util.Scanner;

public class AlunoResetLeituraTeclado {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Sou aluna do Level 1 do CWI Reset! Me chamo " + nomeCompleto);
    }
}