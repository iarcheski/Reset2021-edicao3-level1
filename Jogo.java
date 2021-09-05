import java.util.Random;

public class Jogo {

    private Personagem_ jogador1;
    private Personagem_ jogador2;

    public Jogo(Personagem_ jogador1, Personagem_ jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public void jogar(){
        Random numeroAleatorio = new Random();

        int coletaJogador1 = numeroAleatorio.nextInt(30);
        for (int contador = 0; contador < coletaJogador1; contador++){
            jogador1.coletarMoedas();
        }

        int coletaJogador2 = numeroAleatorio.nextInt(30);
        for (int contador = 0; contador < coletaJogador2; contador++){
            jogador2.coletarMoedas();
        }

        System.out.println("As moedas foram coletadas " + coletaJogador1 + " vezes pelo jogador 1");
        System.out.println("Resutado final do jogador 1 é de: ");
        jogador1.caracteristicas();

        System.out.println("As moedas foram coletadas " + coletaJogador2 + " vezes pelo jogador 2");
        System.out.println("Resutado final do jogador 2 é de: ");
        jogador2.caracteristicas();


    }

}