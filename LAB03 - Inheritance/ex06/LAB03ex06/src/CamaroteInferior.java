public class CamaroteInferior extends VIP{

    private String localizacao;

    public CamaroteInferior(float valor, float adicional, String localizacao){
        super(valor, adicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao(){
        return this.localizacao;
    }

    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }
}
