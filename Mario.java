public class Mario extends Personagem{
    private Yoshi yoshi;

    public Mario(String nome, int idade, double altura){
        super(nome, idade, altura);

    }
    public void montarNoYoshi(Yoshi yoshi){
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
