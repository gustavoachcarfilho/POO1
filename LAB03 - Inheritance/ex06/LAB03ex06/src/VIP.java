public class VIP extends Ingresso{
    private float adicional;

    public float escreveValorAd(){
        return super.getValor() + this.adicional;
    }

    public VIP(float valor, float adicional){
        super(valor);
        this.adicional = adicional;
    }

    public float valorIngresso(){
        return super.getValor() + this.adicional;
    }
    public float getAdicional() {
        return adicional;
    }

    public void setAdicional(float adicional) {
        this.adicional = adicional;
    }
}
