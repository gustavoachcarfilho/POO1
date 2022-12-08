public class Circulo extends FormaBidimensional{
    private float raio;

    public Circulo(float raio){
        this.raio = raio;
    }
    @Override
    public float getArea(){
        return (float) (Math.PI * (raio*raio));
    }

    public void descricao(){
        System.out.printf("Circulo de raio %.2f e area %.2f.\n", this.raio, this.getArea());
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
}
