public class PersonagemMain {

    public static void main(String[] args) {

        Personagem mario = new Personagem("Mario", 40, 1.60);
        System.out.println(">>>>>|<<<<<");
        System.out.println("Altura do salto do Mario");
        mario.saltar();
        mario.caracteristicas();
        System.out.println(">>>>>|<<<<<");

        Personagem luigi = new Personagem("Luigi", 40, 1.80);

        System.out.println("Altura do salto do Luigi");
        luigi.saltar();
        luigi.caracteristicas();
        System.out.println(">>>>>|<<<<<");

    }
}
