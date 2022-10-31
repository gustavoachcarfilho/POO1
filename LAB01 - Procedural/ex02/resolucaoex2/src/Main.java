public class resolucao_ex02 {
    public static int altera_preco(float preco, float porcentagem){
        float temp;

        if(porcentagem >= -100){
            temp = 1 + porcentagem/100;
            preco = preco * temp;
            return 0;
        } else{
            return -1;
        }
    }

    public static <String> void main(String[] args){
        String nome[4];
        float preco[4];
        int qtd_estoque[4];

        Scanner eS = new Scanner(System.in);
        Scanner eF = new Scanner(System.in);
        Scanner eI = new Scanner(System.in);

        for(int i = 0; i < 4; i++){
            System.out.println("Informe o nome, o preco e a qtd. em estoque do produto: ");
            nome[i] = eS.next();
            preco[i] = eF.nextFloat();
            qtd_estoque[i] = eI.nextInt();
        }

        System.out.printf("\nAumentando o preco em 10%% do produto 1 e 3");
        float preco1 = altera_preco(preco[0],-110);
        System.out.printf("%f\n",preco1);
        float preco2 = altera_preco(preco[2],10);
        System.out.printf("%f", preco2);
    }
}
