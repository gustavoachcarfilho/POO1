import java.time.LocalDate;

public class Figurinha {
    String nome, posicao, pais;
    LocalDate dataNasc;
    Float altura, peso;

    public Figurinha (String nomeJ, String posicaoJ, String paisJ, String dataNascJ, float pesoJ, float alturaJ){
        nome = nomeJ;
        posicao = posicaoJ;
        pais = paisJ;
        dataNasc = LocalDate.parse(dataNascJ);
        altura = alturaJ;
        peso = pesoJ;
    }

    public void mostrarFigurinha(){
        System.out.printf("Info do jogador: \n");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Posicao: %s\n", posicao);
        System.out.printf("Pais: %s\n", pais);
        System.out.printf("Data de nascimento: %s\n", dataNasc);
        System.out.printf("Peso: %.2f\n", peso);
        System.out.printf("Altura: %.2f\n", altura);
    }
}
