import java.util.Scanner;

public class AlunoAprovadoReprovado {


        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Digite a nota 1:");
            double nota1 = teclado.nextDouble();

            System.out.println("Digite a nota 2:");
            double nota2 = teclado.nextDouble();

            System.out.println("Digite a nota 3: ");
            double nota3 = teclado.nextDouble();

            System.out.println("Digite a nota 4: ");
            double nota4 = teclado.nextDouble();

            double media = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println("Sua média é: " + media);


            if (media >= 7) {
            System.out.println("Aluno APROVADO");

            } if (media < 7) {
            System.out.println("Aluno REPROVADO");

            } if (media == 10) {
            System.out.println("Aluno aprovado com louvores");
        }
    }
}