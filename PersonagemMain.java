public class PersonagemMain {

    public static void main(String[] args) {

        Personagem jogador1 = new Personagem("Mario", 40, 1.60);


        Personagem jogador2 = new Personagem("Luigi", 40, 1.80);


        Jogo jogo = new Jogo(jogador1, jogador2);
        jogo.jogar();

    }
}
