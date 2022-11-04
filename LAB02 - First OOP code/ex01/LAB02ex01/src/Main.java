import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Figurinha jogador1 = new Figurinha();
        Figurinha jogador2 = new Figurinha();
        Figurinha jogador3 = new Figurinha();

        jogador1.nome = "Ribamar";
        jogador1.nascimento = LocalDate.parse("1987-06-24");
        jogador1.altura = 1.79;
        jogador1.peso = 73.2;
        jogador1.posicao = "Atacante";
        jogador1.pais = "Brasil";

        jogador2.nome = "Ronaldo";
        jogador2.nascimento = LocalDate.parse("1977-05-08");
        jogador2.altura = 1.70;
        jogador2.peso = 82.3;
        jogador2.posicao = "Atacante";
        jogador2.pais = "Brasil";

        jogador3.nome = "Lewandowski";
        jogador3.nascimento = LocalDate.parse("1979-04-13");
        jogador3.altura = 1.87;
        jogador3.peso = 85.6;
        jogador3.posicao = "Atacante";
        jogador3.pais = "Polonia";

        System.out.printf("Nome: %s\nPeso: %.2f\nAltura: %.2f\nData de nascimento: %s\nPosicao: %s\nPais: %s\n",
                jogador1.nome, jogador1.peso, jogador1.altura,jogador1.nascimento, jogador1.posicao, jogador1.pais);
        System.out.printf("\nNome: %s\nPeso: %.2f\nAltura: %.2f\nData de nascimento: %s\nPosicao: %s\nPais: %s\n",
                jogador2.nome, jogador2.peso, jogador2.altura,jogador2.nascimento, jogador2.posicao, jogador2.pais);
        System.out.printf("\nNome: %s\nPeso: %.2f\nAltura: %.2f\nData de nascimento: %s\nPosicao: %s\nPais: %s\n",
                jogador3.nome, jogador3.peso, jogador3.altura,jogador3.nascimento, jogador3.posicao, jogador3.pais);
    }
}