import java.util.Scanner;

public class ex02 {
    public static float altera_preco(float[] preco, float porcentagem, int indice){
        float temp;

        if(porcentagem >= -100){
            temp = 1 + porcentagem/100;
            preco[indice] = preco[indice] * temp;
            return 0;
        } else{
            return -1;
        }
    }

    public static void main(String [] args){
        String[] nome = new String[4];
        float[] preco1 = new float[4];
        int[] qtd_estoque = new int[4];


        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 4; i++) {
                System.out.println("Informe o nome, o preco e a qtd. em estoque do produto: ");
                nome[i] = sc.next();
                preco1[i] = sc.nextFloat();
                qtd_estoque[i] = sc.nextInt();
            }

            System.out.printf("\n");
            System.out.println("Aumentando o preco em 10%% do produto 1 e 3");
            altera_preco(preco1, 10, 0);
            altera_preco(preco1, 10, 2);

            System.out.printf("\n");
            System.out.println("Reduzindo o preco em 5%% do produto 2");
            if (altera_preco(preco1, -5, 1) == -1) {
                System.out.println("Erro: preco nao alterado. Porcentagem invalida");
            } else {
                System.out.println("Preco alterado com sucesso");
            }

            System.out.printf("\n");
            System.out.println("Alterando o preco do prod. 3");
            if (altera_preco(preco1, -110, 2) == -1) {
                System.out.println("Erro: preco nao alterado. Porcentagem invalida");
            } else {
                System.out.println("Preco alterado com sucesso");
            }

            System.out.printf("\n");
            System.out.println("Produtos Cadastrados:");
            for (int i = 0; i < 4; i++) {
                System.out.printf("\nProduto: %s\nPreco: %.2f\nEstoque: %d", nome[i], preco1[i], qtd_estoque[i]);
            }
        }
    }

}