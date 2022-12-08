public class C2 extends C1 {
    protected int prot2;
    private int priv2;
    public int pub2;

    public C2(){
        System.out.println("Construtor de C2 sem parametros foi chamado");
    }

    public C2 (int prot, int priv, int pub){
        prot2 = prot;
        priv2 = priv;
        pub2 = pub;
        System.out.println("Construtor de C2 com parametros foi chamado");
    }

    public void mostrar_atributos(){
        System.out.println("Atributos de C2");
        System.out.printf("Protected1: %d\n", prot1);
        System.out.printf("Private1: %d\n", getPriv1());
        System.out.printf("Public1: %d\n", pub1);
        System.out.printf("Protected2: %d\n", prot2);
        System.out.printf("Private2: %d\n", priv2);
        System.out.printf("Public2: %d\n", pub2);
    }

    public void mostrar_atributos_super(){
        System.out.println("Atributos de C2:");
        System.out.printf("Protected1: %d\n", prot2);
        System.out.printf("Private2: %d\n", priv2);
        System.out.printf("Public2: %d\n", pub2);
        super.mostrar_atributos();
    }
    public int getProt2() {
        return prot2;
    }

    public int getPriv2() {
        return priv2;
    }

    public int getPub2() {
        return pub2;
    }

    public void setProt2(int prot2) {
        this.prot2 = prot2;
    }

    public void setPriv2(int priv2) {
        this.priv2 = priv2;
    }

    public void setPub2(int pub2) {
        this.pub2 = pub2;
    }
}
