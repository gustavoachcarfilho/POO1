import java.time.LocalDate;

public class Vendedor extends Funcionarios{
    private float comissao, vendas;

    public Vendedor(String nomeF, LocalDate dataNascimentoF, float salarioF, float comissaoF, float vendasF){
        super(nomeF, dataNascimentoF, salarioF);
        this.comissao = comissaoF;
        this.vendas =vendasF;
    }

    public float calculaSalario(){
        return this.salario + vendas * comissao;
    }


    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }
}
