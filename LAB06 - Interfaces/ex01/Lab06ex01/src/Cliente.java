public class Cliente implements Classificavel{
    String nome;

    public boolean eMenorQue (Classificavel obj){
        Cliente c = (Cliente) obj;
        if(this.nome.length() < c.nome.length()){
            return true;
        }
        else {
            return false;
        }
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
