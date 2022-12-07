public class Ingresso {
    private float valor;

    public void escreveValor(){
        System.out.printf("Valor: %.2f\n", valor);
    }

    public Ingresso(float valor){
        this.valor = valor;
    }

    public float getValor(){
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
