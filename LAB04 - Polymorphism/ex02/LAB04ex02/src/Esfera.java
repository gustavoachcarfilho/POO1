public class Esfera extends FormaTridimensional{
    private float raio;

    public Esfera(float raio){
        this.raio = raio;
    }
    @Override
    public float getArea(){
        return (float) (4.0 * Math.PI * (raio * raio));
    }
    @Override
    public float getVolume(){
        return (float) ((4.0/3.0) * Math.PI * (raio * raio * raio));
    }

    public void descricao(){
        System.out.printf("Esfera de raio %.2f, area %.2f e volume de %.2f.\n", this.raio, this.getArea(), this.getVolume());
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
}
