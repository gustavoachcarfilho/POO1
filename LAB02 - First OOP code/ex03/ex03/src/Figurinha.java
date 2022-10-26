import java.util.Date;

public class Figurinha{
    public String nome;
    public Date nascimento;
    public float altura;
    public float peso;
    public String posicao;
    public String pais;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
         this.nome = nome;
    }

    public Date getNasc(){
        return nascimento;
    }

    public void setNasc(Date nascimento){
        this.nascimento = nascimento;
    }

    public float getAltura(){
        return altura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getPeso(){
        return peso;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }

    public String getPosicao(){
        return posicao;
    }

    public void setPosicao(String posicao){
        this.posicao = posicao;
    }

    public String getPais(){
        return pais;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

}