public class Cubo extends FormaTridimensional{
    private float lado;

    public Cubo(float lado){
        this.lado = lado;
    }
    @Override
    public float getArea(){
        return (float) (6.0 * lado * lado);
    }
    @Override
    public float getVolume(){
        return (float) (lado * lado * lado);
    }

    public void descricao(){
        System.out.printf("Cubo com lado %.2f, area de %.2f e volume de %.2f.\n", this.lado, this.getArea(), this.getVolume());
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
}
