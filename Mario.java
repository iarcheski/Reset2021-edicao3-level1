public class Mario {
        private String nome;
        private double altura;
        private int idade;
        private int estamina;

        public Mario() {
            this.nome = "Mario Bros";
            this.altura = 1.50;
            this.idade = 40;
            this.estamina = 100;
        }

        public Mario(String nome, int idade, double altura) {
            this.nome = nome;
            this.altura = altura;
            this.idade = idade;
            this.estamina = 100;
        }

        public void imprimePoderes() {
            System.out.println("Super força, Super salto, super velocidade e outros.");
        }

        public void imprimeCaracteristicas() {
            System.out.println("Mario{" +
                    "nome='" + nome + '\'' +
                    ", altura=" + altura +
                    ", idade=" + idade +
                    ", estamina=" + estamina +
                    '}');
        }

        public void perderEstamina() {
            this.estamina = this.estamina - 10;
            if (this.estamina < 0) {
                this.estamina = 0;
            }
        }

        public void ganharEstamina() {
            this.estamina = this.estamina + 5;
            if (this.estamina > 100) {
                this.estamina = 100;
            }
        }

        public void crescer() {
            this.altura = this.altura * 2;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public int getEstamina() {
            return estamina;
        }

        public void setEstamina(int estamina) {
            this.estamina = estamina;
        }
}
