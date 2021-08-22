import java.util.Scanner;

public class ValoresCorrespondentesIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] idade = new int[10];

        for (int contador = 0; contador < idade.length; contador++){
            System.out.println("Digite a idade da pessoa que está na posição " +contador +":");
            idade[contador] = teclado.nextInt();
        }

        int quantosMaiorIdade = 0;

        for (int idades : idade){
            if (idades >= 18){
                quantosMaiorIdade++;
            }
        }
        System.out.println("idades geradas:");
        for (int idades : idade){
            System.out.println(idade);
        }
        System.out.println("---");
        System.out.println("A quantidade de pessoas maior de idade são: " + quantosMaiorIdade);
    }
}
