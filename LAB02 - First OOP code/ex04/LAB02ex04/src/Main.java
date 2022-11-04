import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        Figurinha[] jogadores1 = new Figurinha[11];
        Figurinha[] jogadores2 = new Figurinha[11];

        for(int i = 0; i < 11; i++){
            jogadores1[i] = new Figurinha("Lucio", LocalDate.parse("1977-06-18"), (float) 1.86, (float)86.7, "Zagueiro", "Brasil");
        }

        for(int i = 0; i < 11; i++){
            jogadores2[i] = new Figurinha("Dida", LocalDate.parse("1987-03-05"), (float) 1.98, (float)93.0, "Goleiro", "Brasil");
        }

        Selecao selecao1 = new Selecao("Muricy", "Brasil", jogadores1);
        Selecao selecao2 = new Selecao("Zidane", "Franca", jogadores2);

        selecao1.showSelecao();
        selecao2.showSelecao();

    }

}
