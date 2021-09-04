public class MarioMain {
    public static void main(String[] args) {
        Mario mario = new Mario();

        mario.nome = "Mario Bros";
        mario.idade = 36;
        //mario.genero = "Masculino";
        mario.superPoderes = "Super Força, vêlocidade e salto";

        mario.caracteristicas();
        mario.superPoderes();
    }
}
