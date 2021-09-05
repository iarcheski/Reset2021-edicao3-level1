public class Yoshi extends Personagem{

    private int quantidadeFrutas;
    private double velocidade;

    public Yoshi(String nome, int idade, double altura){
        super(nome, idade, altura);
        this.quantidadeFrutas = 0;
        this.velocidade = 10;
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
