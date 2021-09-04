public class Mario3 {

    private String nome;
    private int idade;
    // private String genero;
    private String superPoderes;
    private int estamina;
    private double altura;

    public Mario3() {
        this.nome = "Mario Bros";
        this.idade = 40;
        this.estamina = 100;
        this.altura = 1.50;
        this.superPoderes = "Super força, super velocidade e super salto";
    }
    public Mario3(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.estamina = 100;
        this.superPoderes = "Super força, super velocidade e super salto";
    }

    public void caracteristicas() {
        System.out.println("Nome: " + nome);
        System.out.println("idade: " + idade);
        // System.out.println("genero: " + genero);
        System.out.println("altura: " + altura);
        System.out.println("estamina: " + estamina);

    }
    public void superPoderes() {
        System.out.println("Super Poderes: " + superPoderes);

    }

    public void perderEstamina() {
        this.estamina = estamina - 10;
        if (this.estamina < 0){
            this.estamina = 0;
        }
    }

    public void ganharEstamina() {
        this.estamina = estamina + 5;
        if (this.estamina > 100){
            this.estamina = 100;
        }
    }
    public void crescer(){
        this.altura = this.altura * 2;
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

    /* public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }*/

    public String getSuperPoderes() {
        return superPoderes;
    }
    public void setSuperPoderes(String superPoderes) {
        this.superPoderes = superPoderes;
    }
    public int getEstamina() {
        return estamina;
    }
    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
