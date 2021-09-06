public class Mario_ extends Personagem__ {
    private Yoshi_ yoshi;

    public Mario_(String nome, int idade, double altura){
        super(nome, idade, altura);

    }

    @Override
    public void crescer() {
        this.altura = this.altura * 1.5;
    }
    public void montarNoYoshi(Yoshi_ yoshi){
        this.yoshi = yoshi;
    }
    public void marioMontadoNoYoshi(){
        if (this.yoshi != null) {
            System.out.println("Mario está montado no Yoshi");
        } else {
            System.out.println("Mario não está montado no Yoshi");
        }
    }

}
