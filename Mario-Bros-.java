public class MarioBros {
    private String nome;
    private int idade;
    private String genero;
    private String poderes;
    private int estimativa;
    private double altura;

    public MarioBros(){
        this.nome = "Mario Bros";
        this.idade = 40;
        this.genero = "Masculino";
        this.poderes = "Super Força, Super Veloz, Super Salto.";
        this.estimativa = 100;
        this.altura = 1.50
    }
    public MarioBros(String nome, int idade, String genero, String poderes )
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.poderes = poderes;
        this.estimativa = estimativa;
        this.altura = altura;

    public void imprimeDados(){
        System.out.print("Mario {");
        System.out.print("Nome: " + nome + ", ");
        System.out.print("idade: " + idade + ", ");
        System.out.println("gênero: " + genero + ", ");
        System.out.println("estimativa: " + estimativa + ", ");
        System.out.println("altura: " + altura + "}");

    }
    public void imprimePoderes(){
        System.out.println("Super poderes: Super Força, Super Veloz, Super Salto.\";");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPoderes() {
        return poderes;
    }

    public void setPoderes(String poderes) {
        this.poderes = poderes;
    }

    public int getEstimativa() {
        return estimativa;
    }

    public void setEstimativa(int estimativa) {
        this.estimativa = estimativa;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
