public class App {

        public static void main(String[] args) {
            System.out.println("Teste para ver se o mario perde estamina");
            Mario mario = new Mario();
            mario.imprimeCaracteristicas();
            mario.perderEstamina();
            mario.imprimeCaracteristicas();
            System.out.println("---");

            System.out.println("Teste para ver se o mario ganha estamina");
            Mario mario2 = new Mario();
            mario2.imprimeCaracteristicas();
            mario2.perderEstamina(); // desconta 10
            mario2.perderEstamina(); // desconta 10
            mario2.ganharEstamina(); // ganhar 5
            mario2.imprimeCaracteristicas();
            System.out.println("---");

            System.out.println("Teste para ver se o mario mantém a estamina em 100 após o acréscimo acima deste valor");
            Mario mario3 = new Mario();
            mario3.imprimeCaracteristicas();
            mario3.ganharEstamina(); // ganhar 5
            mario3.ganharEstamina(); // ganhar 5
            mario3.imprimeCaracteristicas();
            System.out.println("---");

            System.out.println("Teste para ver se o mario mantém a estamina em 0 após o desconto até um valor menor que zero");
            Mario mario4 = new Mario();
            mario4.imprimeCaracteristicas();
            mario4.perderEstamina(); // desconta 10
            mario4.perderEstamina(); // desconta 10
            mario4.perderEstamina(); // desconta 10
            mario4.perderEstamina(); // desconta 10
            mario4.perderEstamina(); // desconta 10
            mario4.perderEstamina(); // desconta 10
            mario4.perderEstamina(); // desconta 10
            mario4.perderEstamina(); // desconta 10
            mario4.perderEstamina(); // desconta 10
            mario4.perderEstamina(); // desconta 10
            mario4.imprimeCaracteristicas();
            mario4.perderEstamina(); // desconta 10
            mario4.perderEstamina(); // desconta 10
            mario4.imprimeCaracteristicas();
            System.out.println("---");

            System.out.println("Teste para ver se o mario cresce");
            Mario mario5 = new Mario();
            mario5.imprimeCaracteristicas();
            mario5.crescer();
            mario5.imprimeCaracteristicas();
            System.out.println("---");
        }
    }

