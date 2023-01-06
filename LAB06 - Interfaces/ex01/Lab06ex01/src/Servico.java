public class Servico implements Classificavel {
    double preco;

    public boolean eMenorQue(Classificavel obj){
        Servico s = (Servico) obj;
        if(this.preco < s.preco){
            return true;
        }
        else{
            return false;
        }
    }

    public Servico(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
