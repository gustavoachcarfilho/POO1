import java.time.LocalDate;

public class FigurinhaExtra {
    String nome, posicao, pais, categoria, cor;
    LocalDate dataNasc;
    Float altura, peso;

    public FigurinhaExtra(String nomeJ, String posicaoJ, String paisJ, String dataNascJ, float pesoJ, float alturaJ, String categoriaJ, String corJ) {
        nome = nomeJ;
        posicao = posicaoJ;
        pais = paisJ;
        dataNasc = LocalDate.parse(dataNascJ);
        altura = alturaJ;
        peso = pesoJ;
        categoria = categoriaJ;
        cor = corJ;
    }

    public void mostrarFigurinhaExtra() {
        System.out.printf("Info do jogador: \n");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Posicao: %s\n", posicao);
        System.out.printf("Pais: %s\n", pais);
        System.out.printf("Data de nascimento: %s\n", dataNasc);
        System.out.printf("Peso: %.2f\n", peso);
        System.out.printf("Altura: %.2f\n", peso);
        System.out.printf("Categoria: %s\n", categoria);
        System.out.printf("Cor: %s\n", cor);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getPosicao(){
        return posicao;
    }

    public void setPosicao(String n){
        this.posicao = n;
    }

    public String getPais(){
        return pais;
    }

    public void setPais(String n){
        this.pais = n;
    }

    public LocalDate getData(){
        return dataNasc;
    }

    public void setData(LocalDate n){
        this.dataNasc = n;
    }

    public float getAltura(){
        return altura;
    }

    public void setNome(float n){
        this.altura = n;
    }

    public float getPeso(){
        return peso;
    }

    public void setPeso(float n){
        this.peso = n;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String n){
        this.categoria = n;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String n){
        this.cor = n;
    }

}