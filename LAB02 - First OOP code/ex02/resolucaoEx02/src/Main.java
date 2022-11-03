import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float peso, altura;
        String nome, posicao, pais, nascimento;

        Figurinha[] jogadores = new Figurinha[3];

        for(int i = 0;i < 3;i++){
            jogadores[i] = new Figurinha();
        }

        for(int i = 0; i < 3; i++){
            System.out.printf("Digite as informacoes do jogador %d:\n", i+1);
            System.out.printf("Nome: ");
            nome = sc.next();
            System.out.printf("Data de nascimento: ");
            nascimento = sc.next();
            System.out.printf("Posicao: ");
            posicao = sc.next();
            System.out.printf("Pais: ");
            pais = sc.next();
            System.out.printf("Peso: ");
            peso = sc.nextFloat();
            System.out.printf("Altura: ");
            altura = sc.nextFloat();
        }

        for(int i = 0; i < 3; i++){
            jogadores[i].showInfo();
        }
    }
}