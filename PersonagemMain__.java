public class PersonagemMain__ {

    public static void main(String[] args) {

        Mario_ mario = new Mario_("Mario", 40, 1.60);
        Luigi_ luigi = new Luigi_("Luigi", 40, 1.80);
        Yoshi_ yoshi = new Yoshi_("Yoshi", 60, 1.75);

        mario.caracteristicas();
        mario.crescer();
        mario.caracteristicas();
        System.out.println("********************");

        luigi.caracteristicas();
        luigi.crescer();
        luigi.caracteristicas();
        System.out.println("********************");

        yoshi.caracteristicas();
        yoshi.crescer();
        yoshi.caracteristicas();
        System.out.println("********************");


        System.out.println("Altura padrão dos saltos dos personagens: ");
        mario.saltar();
        luigi.saltar();
        yoshi.saltar();
        System.out.println("********************");

    }
}
