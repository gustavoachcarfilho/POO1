public class ContaComum extends ContaCorrente{
    private float limite;

    public ContaComum (float saldo, int numConta, int senha){
        super(saldo, numConta, senha);
        limite = 0;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
}
