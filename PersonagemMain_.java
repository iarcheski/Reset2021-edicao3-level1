public class PersonagemMain_ {

    public static void main(String[] args) {

        Personagem_ mario = new Personagem_("Mario", 40, 1.60);

        Personagem_ luigi = new Personagem_("Luigi", 40, 1.80);

        Jogo jogo = new Jogo(mario, luigi);
        jogo.jogar();
    }
}
