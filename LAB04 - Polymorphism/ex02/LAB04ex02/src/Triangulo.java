public class Triangulo extends FormaBidimensional{
    private float base, altura;

    public Triangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public float getArea(){
        return (float) (base * altura/2.0);
    }

    public void descricao(){
        System.out.printf("Triangulo de base %.2f, altura %.2f e area %.2f\n", this.base, this.altura, this.getArea());
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
