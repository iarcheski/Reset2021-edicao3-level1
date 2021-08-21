import java.util.Scanner;

public class TotalSalario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe qual é o seu ganho por hora: ");
        double ganhoHora = teclado.nextDouble();

        System.out.println("Informe seu número de horas trabalhadas no mês: ");
        double totalHoraTrabalhada = teclado.nextDouble();

        double salario = ganhoHora * totalHoraTrabalhada;
        System.out.println("O total do seu salário no referido mês é de: " + salario);
    }
}
