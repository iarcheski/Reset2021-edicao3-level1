public abstract class Personagem__ {

    private String nome;
    private int idade;
    private String superPoderes;
    private int estamina;
    protected double altura;
    private int moedasColetadas;
    private int vidas;


    public Personagem__(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.estamina = 100;
        this.superPoderes = "Super força, super velocidade e super salto";
        this.moedasColetadas = 0;
        this.vidas = 1;
    }

    public void revigorar() {
        this.estamina = 100;
    }

    public void morrer() {
        this.estamina = 0;
        this.vidas = vidas - 1;

        if (this.vidas < 0){
            vidas = 0;
        } else {
            revigorar();
        }

    }
    public void coletarMoedas(){
        this.moedasColetadas++;

        if (this.moedasColetadas % 10 == 0) {
            this.vidas++;
        }

    }
    public void caracteristicas() {
        System.out.print("Nome: " + nome + ",");
        System.out.print(" Idade: " + idade + ",");
        System.out.print(" Altura: " + altura + ",");
        System.out.print(" Estamina: " + estamina + ",");
        System.out.print(" Moedas coletadas: " + moedasColetadas + ",");
        System.out.println(" Vidas: " + vidas + ", ");

    }

    public void superPoderes() {
        System.out.println("Super Poderes: " + superPoderes);

    }
    public void saltar(){
        System.out.println(this.nome + " está saltando em uma altura de " + this.altura * 0.5);

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
    public abstract void crescer();

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
