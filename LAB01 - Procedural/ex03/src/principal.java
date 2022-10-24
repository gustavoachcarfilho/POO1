import java.util.Scanner;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);

    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[6];
        System.out.printf("Listando um vetor\n");

        for(int i = 0; i < 6; i++){
            System.out.printf("Entre com o numero %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos, em ordem inversa, sao:");
        for(int i = 5; i >= 0; i--){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex04() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        int ac = 0;
        while(ac < 6){
            System.out.printf("Entre com o numero %d: \n",ac+1);
            vet[ac] = sc.nextInt();
            if(vet[ac] % 2 != 0){
                System.out.println("Erro: Valor invalido");
            } else {
                ac++;
            }
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex05(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< 5 valores >>");
        int maior = 0, menor = 0;
        float  soma = 0, media;

        for(int i = 0; i < 5; i++){
            System.out.printf("Entre com o numero %d: \n",i+1);
            vet[i] = sc.nextInt();
            if(i == 0){
                maior = vet[i];
                menor = vet[i];
            }

            if(i > 0 && vet[i] > maior){
                maior = vet[i];
            }
            if(i > 0 && vet[i] < menor){
                menor = vet[i];
            }
            soma += vet[i];
        }

        media = soma / 5;

        System.out.print("Os valores digitados sao: ");
        for(int i = 0; i < 5; i++){
            System.out.printf("%d ", vet[i]);
        }
        System.out.printf("\nO maior valor eh: %d\n", maior);
        System.out.printf("O menor valor eh: %d\n", menor);
        System.out.printf("A media eh: %.1f", media);
    }

    public static void ex06(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< 5 valores >>");
        int maior = 0, menor = 0, iMa = 0, iMe = 0;
        float  soma = 0, media;

        for(int i = 0; i < 5; i++){
            System.out.printf("Entre com o numero %d: \n",i+1);
            vet[i] = sc.nextInt();
            if(i == 0){
                maior = vet[i];
                menor = vet[i];
            }

            if(i > 0 && vet[i] > maior){
                maior = vet[i];
                iMa = i;
            }
            if(i > 0 && vet[i] < menor){
                menor = vet[i];
                iMe = i;
            }
            soma += vet[i];
        }

        media = soma / 5;

        System.out.print("Os valores digitados sao: ");
        for(int i = 0; i < 5; i++){
            System.out.printf("%d ", vet[i]);
        }
        System.out.printf("\nO maior valor eh: %d, localizado na posicao %d do vetor\n", maior, iMa);
        System.out.printf("O menor valor eh: %d, localizado na posicao %d do vetor\n", menor, iMe);
        System.out.printf("A media eh: %.1f", media);
    }

    public static void ex07(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int maior = 0, iMa = 0;

        System.out.println("<< Normalizando as notas >>");
        for(int i = 0; i < 5; i++){
            System.out.printf("Entre com a nota do aluno %d: ", i+1);
            vet[i] = sc.nextInt();

            if(vet[i] > maior){
                maior = vet[i];
                iMa = i;
            }
            vet[i] = vet[i] * 2;
        }
        vet[iMa] = 100;

        System.out.println("Notas normalizadas");

        for(int i = 0; i < 5; i++){
            System.out.printf("A nota do aluno %d eh %d\n", i+1, vet[i]);
        }
    }

    public static void ex08(){
        Scanner sc = new Scanner(System.in);
        double[] vet = new double[5];
        double soma = 0, media = 0, d1 = 0,d2 = 0, d3 = 0, d4 = 0, d5 = 0;
        double desvio = 0, desvioFinal = 0;

        System.out.println("<< Media e desvio-padrao >>");

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o valor %d: \n", i+1);
            vet[i] = sc.nextDouble();
            soma += vet[i];
        }

        media = soma/5;
        d1 = Math.pow((vet[0] - media), 2);
        d2 = Math.pow((vet[1] - media), 2);
        d3 = Math.pow((vet[2] - media), 2);
        d4 = Math.pow((vet[3] - media), 2);
        d5 = Math.pow((vet[4] - media), 2);

        desvio = (d1+d2+d3+d4+d5)/4;
        desvioFinal = Math.sqrt(desvio);

        System.out.printf("A media eh %.1f e o desvio-padrao eh %f", media, desvioFinal);
    }

    public static void ex09(){
        Scanner sI = new Scanner(System.in);
        Scanner sF = new Scanner(System.in);

        int nA = 0;

        System.out.printf("Entre com o numero de alunos: \n");
        nA = sI.nextInt();
        if(nA > 100){
            System.out.println("Erro! O numero maximo de alunos permitido eh 100\n");
        }else{
            float[] vet = new float[nA];
            float soma = 0;

            for(int i = 0; i < nA; i++){
                System.out.printf("Digite a nota do aluno %d: \n", i+1);
                vet[i] = sF.nextFloat();
                soma += vet[i];
            }

            System.out.println("Relatorio de notas");

            for(int i = 0; i < nA; i++){
                System.out.printf("A nota do aluno %d eh: %.1f\n", i, vet[i]);
            }

            System.out.printf("A media da turma eh: %.1f\n", soma/nA);
        }
    }

    public static void ex10(){
        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[3];
        int[] vetB = new int[3];
        int[] vetC = new int[3];

        System.out.println("<< Subtracao de vetores >>");

        for(int i = 0; i < 3; i++){
            System.out.printf("Digite o valor %d de A: ",i+1);
            vetA[i] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++){
            System.out.printf("Digite o valor %d de B: ",i+1);
            vetB[i] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++){
            vetC[i] = vetA[i] - vetB[i];
        }

        System.out.printf("O vetor C, definido como C = A - B eh (%d, %d, %d)\n", vetC[0], vetC[1], vetC[2]);
    }

    public static void ex11(){
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[5];
        int[] vetP = new int[5];
        int[] vetI = new int[5];
        int cP = 0, cI = 0;

        System.out.println("<< Pares e Impares >>");

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o valor %d:\n", i+1);
            vet[i] = sc.nextInt();

            if(vet[i] % 2 == 0){
                vetP[cP] = vet[i];
                cP++;
            } else{
                vetI[cI] = vet[i];
                cI++;
            }
        }

        System.out.printf("Impares: ");
        for(int i = 0; i < cI; i++){
            System.out.printf("%d ",vetI[i]);
        }
        System.out.printf("\n");
        System.out.printf("Pares: ");
        for(int i = 0; i < cP; i++){
            System.out.printf("%d ",vetP[i]);
        }
    }

    public static void ex12(){
        Scanner sc = new Scanner(System.in);

        float azul = 0, verde = 0, amarelo = 0, vermelho = 0;
        float pAz = 0, pVerde = 0, pAm = 0, pVerm = 0, soma = 0;
        float maiorP = 0;

        System.out.println("<< Probabilidades >>");
        System.out.println("Digite a quantidade de bolinhas");

        System.out.printf("Verde: ");
        verde = sc.nextFloat();

        System.out.printf("Azul: ");
        azul = sc.nextFloat();

        System.out.printf("Amarela: ");
        amarelo = sc.nextFloat();

        System.out.printf("Vermelha: ");
        vermelho = sc.nextFloat();

        soma = verde + azul + amarelo + vermelho;

        pAz = azul * 100 / soma;
        pVerde = verde * 100 / soma;
        pAm = amarelo * 100 / soma;
        pVerm = vermelho * 100 / soma;

        System.out.println("Probabilidades");




        if(pVerde > pAz && pVerde > pAm && pVerde > pAm){
            System.out.printf("Verde: %.1f%% << Maior probabilidade\n", pVerde);
        } else{
            System.out.printf("Verde: %.1f%%\n", pVerde);
        }

        if(pAz > pVerde && pAz > pAm && pAz > pVerm){
            System.out.printf("Azul: %.1f%% << Maior probabilidade\n", pAz);
        } else{
            System.out.printf("Azul: %.1f%%\n", pAz);
        }

        if(pAm > pVerde && pAm > pAz && pAm > pVerm){
            System.out.printf("Amarela: %.1f%% << Maior probabilidade\n", pAm);
        } else{
            System.out.printf("Amarela: %.1f%%\n", pAm);
        }

        if(pVerm > pVerde && pVerm > pAz && pVerm > pAm){
            System.out.printf("Vermelha: %.1f%% << Maior probabilidade\n", pVerm);
        } else{
            System.out.printf("Vermelha: %.1f%%\n", pVerm);
        }
    }

    public static void ex13(){
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[5];

        System.out.println("<< Zerando negativos >>");

        for(int i = 0; i < 5; i++){
            System.out.printf("Entre com o numero %d: ", i+1);
            vet[i] = sc.nextInt();

            if(vet[i] < 0){
                vet[i] = 0;
            }
        }

        System.out.printf("Zerando os negativos, obtem-se: %d %d %d %d %d\n", vet[0], vet[1], vet[2], vet[3], vet[4]);
    }

    public static void ex14(){
        Scanner sI = new Scanner(System.in);
        Scanner sF = new Scanner(System.in);
        Scanner sC = new Scanner(System.in);

        int numAl = 0;

        System.out.println("Quantos alunos serao cadastrados: ");
        numAl = sI.nextInt();

        int[] matricula = new int[numAl];
        String[] classe = new String[numAl];
        float[] cra = new float[numAl];

        for(int i = 0; i < numAl; i++){
            System.out.println("Entre com o numero do aluno: ");
            matricula[i] = sI.nextInt();

            System.out.println("Entre com a classe social do aluno: ");
            classe[i] = sC.nextLine();

            System.out.println("Entre com o CRA do aluno: ");
            cra[i] = sF.nextFloat();

            System.out.printf("\n");
        }

        System.out.printf("=== Alunos cadastrados ===\n");

        for(int i = 0; i < numAl; i++){
            System.out.printf("Numero: %d Classe Social: %s CRA: %.2f\n", matricula[i], classe[i], cra[i]);
        }

    }


    public static void main(String[] args) {
        //ex01();
        //ex02();
        //ex03();
        //ex04();
        //ex05();
        //ex06();
        //ex07();
        //ex08();
        //ex09();
        //ex10();
        //ex11();
        //ex12();
        //ex13();
        ex14();
    }


}
