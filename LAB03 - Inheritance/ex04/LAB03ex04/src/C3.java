public class C3 extends C2{
    protected int prot3;
    private int priv3;
    public int pub3;

    public C3(){
        super();
        System.out.println("Construtor de C3 sem parametro chamado");
    }

    public C3(int prot, int priv, int pub){
        prot3 = prot;
        priv3 = priv;
        pub3 = pub;
        System.out.println("Construtor de C3 com parametro chamado");
    }

    public void mostrar_atributos_super(){
        System.out.println("Atributos de C3:");
        System.out.printf("Protected3: %d\n", prot3);
        System.out.printf("Private3: %d\n", priv3);
        System.out.printf("Public3: %d\n", pub3);
        super.mostrar_atributos();
    }

    public void mostrar_atributos(){
        System.out.println("Atributos de C3");
        System.out.printf("Protected1: %d\n", prot1);
        System.out.printf("Private1: %d\n", getPriv1());
        System.out.printf("Public1: %d\n", pub1);
        System.out.printf("Protected2: %d\n", prot2);
        System.out.printf("Private2: %d\n", getPriv2());
        System.out.printf("Public2: %d\n", pub2);
        System.out.printf("Protected3: %d\n", prot3);
        System.out.printf("Private3: %d\n", priv3);
        System.out.printf("Public3: %d\n", pub3);
    }

    public C3 (C2 c2){
        super(c2.getProt2(), c2.getPriv2(), c2.getPub2());
    }

    public int getProt3() {
        return prot3;
    }

    public int getPriv3() {
        return priv3;
    }

    public int getPub3() {
        return pub3;
    }

    public void setProt3(int prot3) {
        this.prot3 = prot3;
    }

    public void setPriv3(int priv3) {
        this.priv3 = priv3;
    }

    public void setPub3(int pub3) {
        this.pub3 = pub3;
    }
}
