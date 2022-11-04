import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Scanner sF = new Scanner(System.in);

        int numJog;
        float peso, altura;
        String posicao, pais, nome, nascimento;

        System.out.printf("Digite a quantidade de jogadores: ");
        numJog = sc.nextInt();

        Figurinha[] jogadores = new Figurinha[numJog];

        for(int i = 0; i < numJog; i++){
            jogadores[i] = new Figurinha();
        }

        for (int i = 0; i < numJog; i++){
            System.out.printf("Digite os dados do jogador %d\n", i+1);
            System.out.printf("Nome: ");
            nome = sc.next();
            System.out.printf("Data de nascimento: ");
            nascimento = sc.next();
            System.out.printf("Pais: ");
            pais = sc.next();
            System.out.printf("Posicao: ");
            posicao = sc.next();
            System.out.printf("Altura: ");
            altura = sF.nextFloat();
            System.out.printf("Peso: ");
            peso = sF.nextFloat();

            jogadores[i].setNome(nome);
            jogadores[i].setNasc(LocalDate.parse(nascimento));
            jogadores[i].setPais(pais);
            jogadores[i].setPosicao(posicao);
            jogadores[i].setAltura(altura);
            jogadores[i].setPeso(peso);

            System.out.println("");
        }

        for(int i = 0; i < numJog; i++){
            jogadores[i].showInfo();
        }

        sc.close();
    }
}