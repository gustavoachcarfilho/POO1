import java.util.Date;

public class Figurinha{
    private String nome;
    private Date nascimento;
    private float altura;
    private float peso;
    private String posicao;
    private String pais;

    public String getNome(){
        return nome;
    }

    public String setNome(){
        this.nome = nome;
    }

    public Date getNasc(){
        return nascimento;
    }

    public Date setNasc(){
        this.nascimento = nascimento;
    }

    public float getAltura(){
        return altura;
    }

    public float setAltura(){
        this.altura = altura;
    }

    public float getPeso(){
        return peso;
    }

    public float setPeso(){
        this.peso = peso;
    }

    public String getPosicao(){
        return posicao;
    }

    public String setPosicao(){
        this.posicao = posicao;
    }

    public String getPais(){
        return pais;
    }

    public String setPais(){
        this.pais = pais;
    }

}