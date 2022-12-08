public class Quadrado extends FormaBidimensional{
    private float lado;

    public Quadrado(float lado){
        this.lado = lado;
    }
    @Override
    public float getArea(){
        return lado*lado;
    }

    public void descricao(){
        System.out.printf("Quadrado de lado %.2f e area %.2f.\n", this.lado, this.getArea());
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
}
