import java.time.LocalDate;

public class Operario extends Funcionarios{
    private float producao;
    private int qtdProd;

    public Operario(String nomeF, LocalDate dataNascimentoF, float producaoF, int qtdProdF){
        super(nomeF, dataNascimentoF, 0.0f);
        this.producao = producaoF;
        this.qtdProd = qtdProdF;
    }

    public float calculaSalario(){
        return this.producao * this.qtdProd;
    }

    public float getProducao() {
        return producao;
    }

    public void setProducao(float producao) {
        this.producao = producao;
    }

    public int getQtdProd() {
        return qtdProd;
    }

    public void setQtdProd(int qtdProd) {
        this.qtdProd = qtdProd;
    }
}
