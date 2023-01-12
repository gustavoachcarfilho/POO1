public class Produto implements Classificavel {
    private int codigo;

    public boolean eMenorQue (Classificavel obj){
        Produto p = (Produto) obj;
        if(this.codigo < p.codigo){
            return true;
        }
        else {
            return false;
        }
    }

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
