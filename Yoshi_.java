public class Yoshi_ extends Personagem__ {

    private int quantidadeFrutas;
    private double velocidade;

    public Yoshi_(String nome, int idade, double altura){
        super(nome, idade, altura);
        this.quantidadeFrutas = 0;
        this.velocidade = 10;
    }

    @Override
    public void crescer() {
        this.altura = this.altura * 1.1;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void comerFruta(){
        quantidadeFrutas++;
        if (this.quantidadeFrutas % 2 == 0);
            this.velocidade = velocidade * 2;
    }
}
