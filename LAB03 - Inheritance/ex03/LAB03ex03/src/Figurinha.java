import java.time.LocalDate;

public class Figurinha {
    private String nome, posicao, pais;
    private LocalDate dataNasc;
    private Float altura, peso;

    public Figurinha(String nomeJ, String posicaoJ, String paisJ, String dataNascJ, float pesoJ, float alturaJ){
        nome = nomeJ;
        posicao = posicaoJ;
        pais = paisJ;
        dataNasc = LocalDate.parse(dataNascJ);
        altura = alturaJ;
        peso = pesoJ;
    }

    public void mostrarFigurinha(){
        System.out.println("Info do jogador: ");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Posicao: %s\n", posicao);
        System.out.printf("Pais: %s\n", pais);
        System.out.printf("Data de nascimento: %s\n", dataNasc);
        System.out.printf("Peso: %.2f\n", peso);
        System.out.printf("Altura: %.2f\n", altura);
    }

    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getPais() {
        return pais;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public Float getAltura() {
        return altura;
    }

    public Float getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }
}
