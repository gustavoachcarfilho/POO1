public class Main {
    public static void main(String[] args) {
        C1 c1 = new C1();
        C1 c11 = new C1(10, 11,12);

        C2 c2 = new C2();
        C2 c22 = new C2(20, 21,22);

        C3 c3 = new C3();
        C3 c33 = new C3(c22);

        c11.mostrar_atributos_super();
        System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("\n");
        c22.mostrar_atributos_super();
        System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("\n");
        c33.mostrar_atributos_super();
    }
}