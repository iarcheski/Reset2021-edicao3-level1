public class Luigi_ extends Personagem__ {

    public Luigi_(String nome, int idade, double altura){
        super(nome, idade, altura);

    }

    @Override
    public void crescer() {
        this.altura = this.altura * 1.75;
    }

    public void voar(){
        System.out.println("Luigi está voando");
    }

}
