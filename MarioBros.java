public class MarioBros {
    String nome = "Mario";
    int idade = 40;
    String genero = "Masculino";
    String poderes = "Super Força, Super Veloz, Super Salto.";

    public void imprimeDados(){
        System.out.print("Mario {");
        System.out.print("Nome: " + nome + ", ");
        System.out.print("idade: " + idade + ", ");
        System.out.println("gênero: " + genero + "}");

    }
    public void imprimePoderes(){
        System.out.println("Super poderes: " + poderes);
    }
}
