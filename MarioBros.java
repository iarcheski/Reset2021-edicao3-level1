public class MarioBros {
    String nome;
    int idade;
    String genero;
    String poderes;

    public void imprimeDados(){
        System.out.print("Mario {");
        System.out.print("Nome: " + nome + ", ");
        System.out.print("idade: " + idade + ", ");
        System.out.println("gênero: " + genero + "}");

    }
    public void imprimePoderes(){
        System.out.println("Super poderes: Super Força, Super Veloz, Super Salto.\";");
    }
}
