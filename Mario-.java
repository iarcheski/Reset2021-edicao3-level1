public class Mario {
    public static void main(String[] args) {
        MarioBros Mario = new MarioBros();
        Mario.nome = "Mario Bros";
        Mario.idade = 40;
        Mario.genero = "Masculino";
        String poderes = "Super Força, Super Veloz, Super Salto.";

        Mario.imprimeDados();
        Mario.imprimePoderes();

    }
}
