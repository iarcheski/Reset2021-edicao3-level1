public class MarioMain1 {
    public static void main(String[] args) {
        Mario1 mario1 = new Mario1();

        mario1.nome = "Mario Bros";
        mario1.idade = 36;
        //mario1.genero = "Masculino";
        mario1.superPoderes = "Super Força, vêlocidade e salto";

        mario1.caracteristicas();
        mario1.superPoderes();
    }
}
