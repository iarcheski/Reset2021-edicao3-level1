public class Mario {
    public static void main(String[] args) {
        MarioBros Mario = new MarioBros();
        Mario.imprimeDados();
        Mario.imprimePoderes();
        System.out.println("---");

        Mario marioII = new Mario("Super Mario", 40, "Masculino", 1.25);
        marioII.imprimeDados();
        marioII.imprimePoderes();
        System.out.println("---");

        Mario marioIII = new Mario("Super Mario Bros", 40, "Masculino", 1.25);
        MarioIII.imprimeDados();
        MarioIII.setNome("Mario Bigodinho");
        MarioIII.setIdade(40);
        marioIII.imprimeDados();
        marioIII.imprimePoderes();
    }

}
