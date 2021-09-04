public class MarioMain4 {

    public static void main(String[] args) {

        Mario4 mario3 = new Mario4();
        mario3.perderEstamina();
        mario3.caracteristicas();
        System.out.println(">>>>>>><<<<<<<");
        //teste para diminuir estamina: OK

        Mario4 mario4 = new Mario4();
        mario4.ganharEstamina();
        mario4.ganharEstamina();
        mario4.ganharEstamina();
        mario4.ganharEstamina();
        mario4.ganharEstamina();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.caracteristicas();
        System.out.println(">>>>>>><<<<<<<");
        //teste para a estamina ficar em 100 caso passe do valor: OK

        Mario4 mario5 = new Mario4();
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
        //teste para a estamina ficar em 0 quando negativa: OK


        Mario4 mario6 = new Mario4();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.ganharEstamina();
        mario6.ganharEstamina();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.caracteristicas();
        System.out.println(">>>>>>><<<<<<<");
        //teste de coletar moedas: OK

        Mario4 mario7 = new Mario4();
        mario7.perderEstamina();
        mario7.perderEstamina();
        mario7.perderEstamina();
        mario7.perderEstamina();
        mario7.perderEstamina();
        mario7.perderEstamina();
        mario7.perderEstamina();
        mario7.perderEstamina();
        mario7.perderEstamina();
        mario7.perderEstamina();
        mario7.revigorar();
        mario7.caracteristicas();
        System.out.println(">>>>>>><<<<<<<");
        //teste para revigorar quando ocorrer a perda total de estamina: OK

        Mario4 mario8 = new Mario4();
        mario8.coletarMoedas();
        mario8.coletarMoedas();
        mario8.coletarMoedas();
        mario8.coletarMoedas();
        mario8.coletarMoedas();
        mario8.coletarMoedas();
        mario8.coletarMoedas();
        mario8.coletarMoedas();
        mario8.coletarMoedas();
        mario8.coletarMoedas();
        mario8.coletarMoedas();
        mario8.coletarMoedas();
        mario8.coletarMoedas();
        mario8.coletarMoedas();
        mario8.coletarMoedas();
        mario8.coletarMoedas();
        mario8.coletarMoedas();
        mario8.coletarMoedas();
        mario8.coletarMoedas();
        mario8.coletarMoedas();
        mario8.caracteristicas();
        System.out.println(">>>>>>><<<<<<<");
        //teste para aumentar a quantidade de vidas a cada 10 moedas coletadas: OK

        Mario4 mario9 = new Mario4();
        mario9.coletarMoedas();
        mario9.coletarMoedas();
        mario9.coletarMoedas();
        mario9.coletarMoedas();
        mario9.coletarMoedas();
        mario9.coletarMoedas();
        mario9.coletarMoedas();
        mario9.coletarMoedas();
        mario9.coletarMoedas();
        mario9.coletarMoedas();
        mario9.morrer();
        mario9.caracteristicas();
        System.out.println(">>>>>>><<<<<<<");
        //teste para ver se o mario perde uma vida quando morre: OK



    }
}
