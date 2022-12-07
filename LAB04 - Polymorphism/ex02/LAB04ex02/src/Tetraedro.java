public class Tetraedro extends FormaTridimensional{
    private float aresta;

    public Tetraedro(float aresta){
        this.aresta = aresta;
    }
    @Override
    public float getArea(){
        return (float) ((aresta * aresta) * Math.sqrt(3.0));
    }
    @Override
    public float getVolume(){
        return (float) ((aresta * aresta * aresta) * Math.sqrt(2) / 12);
    }

    public void descricao(){
        System.out.printf("Tetraedro de aresta %.2f, area %.2f e volume %.2f.\n", this.aresta, this.getArea(), this.getVolume());
    }

    public float getAresta() {
        return aresta;
    }

    public void setAresta(float aresta) {
        this.aresta = aresta;
    }
}
