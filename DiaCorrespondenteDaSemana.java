import java.util.Scanner;

public class DiaCorrespondenteDaSemana {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com um dia da semana de 1 a 7:");

        int diaDaSemana = teclado.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println("O dia da semana é Domingo");
                break;
            case 2:
                System.out.println("O dia da semana é Segunda");
                break;
            case 3:
                System.out.println("O dia da semana é Terça");
                break;
            case 4:
                System.out.println("O dia da semana é Quarta");
                break;
            case 5:
                System.out.println("O dia da semana é Quinta");
                break;
            case 6:
                System.out.println("O dia da semana é Sexta");
                break;
            case 7:
                System.out.println("O dia da semana é Sábado");
                break;
            default:
                System.out.println("Não é um dia da semana válido!");
                break;
        }

    }
}