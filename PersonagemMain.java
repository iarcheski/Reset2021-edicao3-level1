public class PersonagemMain {

    public static void main(String[] args) {

        //Personagem personagem = new Personagem("Mario Bros", 40, 1.60);
        //Não tem como instanciar

        Mario mario = new Mario("Mario", 40, 1.60);
        Luigi luigi = new Luigi("Luigi", 40, 1.80);
        Yoshi yoshi = new Yoshi("Yoshi", 60, 1.75);

        mario.marioMontadoNoYoshi(); //Mario não está montado no Yoshi
        System.out.println("********************");

        mario.montarNoYoshi(yoshi);
        mario.marioMontadoNoYoshi(); //Mario está montado no Yoshi
        System.out.println("********************");

        luigi.voar(); //tudo certo com o Luigi, ele está voando
        System.out.println("********************");


        System.out.println("Velocidade em: " + yoshi.getVelocidade());
        System.out.println("********************");

        yoshi.comerFruta(); //a velocidade saiu de 10 para 20
        System.out.println("Velocidade em: " + yoshi.getVelocidade()); //a velocidade saiu de 10 para 20
        System.out.println("********************");

        yoshi.comerFruta();
        yoshi.comerFruta();
        System.out.println("Velocidade em: " + yoshi.getVelocidade()); //a velocidade duplicou ao comer duas vezes, totalizando 80
        System.out.println("********************");



    }
}
