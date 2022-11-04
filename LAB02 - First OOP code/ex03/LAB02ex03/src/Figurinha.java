import java.time.LocalDate;

public class Figurinha{
    private String nome;
    private LocalDate nascimento;
    private float altura;
    private float peso;
    private String posicao;
    private String pais;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public LocalDate getNasc(){
        return nascimento;
    }

    public void setNasc(LocalDate nascimento){
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

    public void showInfo(){
        System.out.printf("***** Informacoes do jogador *****\n");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Data de nascimento: %s\n", nascimento);
        System.out.printf("Altura (em metros): %.2f\n", altura);
        System.out.printf("Peso (em kg): %.2f\n", peso);
        System.out.printf("Posicao: %s\n", posicao);
        System.out.printf("Pais: %s\n", pais);
    }
}