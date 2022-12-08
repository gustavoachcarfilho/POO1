public class CamaroteSuperior extends VIP{
    private float adicionalCamSup;
    private String localizacao;

    public CamaroteSuperior(float valor, float adicional, String localizacao, float adicionalCamSup){
        super(valor, adicional);
        this.localizacao = localizacao;
        this.adicionalCamSup = adicionalCamSup;
    }

    private float getValorCamSup(){
        return super.valorIngresso() + this.adicionalCamSup;
    }

    public float getAdicionalCamSup() {
        return adicionalCamSup;
    }

    public void setAdicionalCamSup(float adicionalCamSup) {
        this.adicionalCamSup = adicionalCamSup;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
