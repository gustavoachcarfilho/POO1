public class Selecao {
    String nomeSelecao, nomeTecnico;
    Figurinha[] jogadores = new Figurinha[11];


    public Selecao(String nTecnico, String nSelecao){

        for(int i = 0; i < 11; i++){
            jogadores[i] = new Figurinha(nSelecao);
        }
        nomeSelecao = nSelecao;
        nomeTecnico = nTecnico;
    }

    public void showSelecao(){
        System.out.printf("Info da Selecao\n");
        System.out.printf("%s\n", nomeSelecao);
        for(int i = 0; i < 11; i++){
            System.out.printf("Jogador %d: %s\n", i+1, jogadores[i].getNome());
        }
        System.out.printf("Tecnico: %s\n", nomeTecnico);
    }

    public String getNomeSelecao(){
        return nomeSelecao;
    }

    public void setNomeSelecao(String s){
        this.nomeSelecao = s;
    }

    public String getNomeTecnico(){
        return nomeTecnico;
    }

    public void setNomeTecnico(String s){
        this.nomeTecnico = s;
    }

    public Figurinha[] getJogadores(){
        return jogadores;
    }

}
