import java.time.LocalDate;

public class Principal {
    public static void main(String[] args){
        Figurinhas jogador1 = new Figurinhas();
        Figurinhas jogador2 = new Figurinhas();
        Figurinhas jogador3 = new Figurinhas();

        jogador1.setNome("Ribamar");
        jogador1.setNasc(LocalDate.parse("1987-06-24"));
        jogador1.setAltura((float) 1.79);
        jogador1.setPeso((float) 73.2);
        jogador1.setPosicao("Atacante");
        jogador1.setPais("Brasil");

        jogador2.setNome("Ronaldo");
        jogador2.setNasc(LocalDate.parse("1977-05-08"));
        jogador2.setAltura((float) 1.70);
        jogador2.setPeso((float) 82.3);
        jogador2.setPosicao("Atacante");
        jogador2.setPais("Brasil");

        jogador3.setNome("Lewandowski");
        jogador3.setNasc(LocalDate.parse("1979-04-13"));
        jogador3.setAltura((float) 1.87);
        jogador3.setPeso((float) 85.6);
        jogador3.setPosicao("Atacante");
        jogador3.setPais("Polonia");


        jogador1.showInfo();
        jogador2.showInfo();
        jogador3.showInfo();
    }
}