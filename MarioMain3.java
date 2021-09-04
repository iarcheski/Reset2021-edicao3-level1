public class MarioMain3 {

    public static void main(String[] args) {

        Mario3 mario3 = new Mario3();
        mario3.perderEstamina();
        mario3.caracteristicas();
        System.out.println(">>>>>>><<<<<<<");
        //teste de estamina: 90
        //-10

        Mario3 mario4 = new Mario3();
        mario4.ganharEstamina();
        mario4.ganharEstamina();
        mario4.ganharEstamina();
        mario4.ganharEstamina();
        mario4.ganharEstamina();
        mario4.caracteristicas();
        System.out.println(">>>>>>><<<<<<<");
        //teste de estamina: 100
        //+25

        Mario3 mario5 = new Mario3();
        mario5.perderEstamina();
        mario5.perderEstamina();
        mario5.perderEstamina();
        mario5.perderEstamina();
        mario5.perderEstamina();
        mario5.perderEstamina();
        mario5.perderEstamina();
        mario5.perderEstamina();
        mario5.perderEstamina();
        mario5.perderEstamina();
        mario5.perderEstamina();
        mario5.caracteristicas();
        System.out.println(">>>>>>><<<<<<<");
        //teste de estamina: 0
        //-110
        
    }
}
