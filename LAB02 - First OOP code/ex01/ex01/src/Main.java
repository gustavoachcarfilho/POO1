public class Main(String[] args){
    Figurinha jogador1 = new Figurinha();
    Figurinha jogador2 = new Figurinha();
    Figurinha jogador3 = new Figurinha();

    jogador1.nome = "Ribamar";
    jogador1.nascimento = Date.valueOf("1981/01/03");
    jogador1.altura = 1.79;
    jogador1.peso = 73.2;
    jogador1.posicao = "Atacante";
    jogador1.pais = "Brasil";

    jogador2.nome = "Ronaldo";
    jogador2.nascimento = Date.valueOf("1977/05/08");
    jogador2.altura = 1.70;
    jogador2.peso = 82.3;
    jogador2.posicao = "Atacante";
    jogador2.pais = "Brasil";

    jogador3.nome = "Lewandowski";
    jogador3.nascimento = Date.valueOf("1979/04/13");
    jogador3.altura = 1.87;
    jogador3.peso = 85.6;
    jogador3.posicao = "Atacante";
    jogador3.pais = "Polonia";
}