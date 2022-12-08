public class C1 {
    protected int prot1;
    private int priv1;
    public int pub1;

    public C1 (){
        System.out.println("Construtor de C1 sem parametro chamado");
}

    public C1 (int prot, int priv, int pub) {
        prot1 = prot;
        priv1 = priv;
        pub1 = pub;
        System.out.println("Construtor de C1 com parametro chamado");
    }

    public void mostrar_atributos(){
        System.out.println("Atributos de C1:");
        System.out.printf("Protected1: %d\n", prot1);
        System.out.printf("Private1: %d\n", priv1);
        System.out.printf("Public1: %d\n", pub1);
    }

    public void mostrar_atributos_super(){
        System.out.println("Atributos de C1:");
        System.out.printf("Protected1: %d\n", prot1);
        System.out.printf("Private1: %d\n", priv1);
        System.out.printf("Public1: %d\n", pub1);
    }

    public int getProt1() {
        return prot1;
    }

    public int getPriv1() {
        return priv1;
    }

    public int getPub1() {
        return pub1;
    }

    public void setProt1(int prot1) {
        this.prot1 = prot1;
    }

    public void setPriv1(int priv1) {
        this.priv1 = priv1;
    }

    public void setPub1(int pub1) {
        this.pub1 = pub1;
    }
}
