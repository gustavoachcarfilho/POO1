public class UsaBanco {
    public static void main(String[] args){
        ContaComum cc;
        ContaEspecial[] vetce = new ContaEspecial[4];
        vetce[0] = new ContaEspecial(4500.0f, 12147, 1234, 2000);
        vetce[1] = new ContaEspecial(5500.0f, 12148, 2345, 3000);
        vetce[2] = new ContaEspecial(6500.0f, 12149, 3456, 4000);
        vetce[3] = new ContaEspecial(7500.0f, 12140, 4567, 5000);
        System.out.printf("Saldo do vetce[0] antes de debitar 1000 reais: %f\n", vetce[0].getSaldo(1234));
        vetce[0].debitaValor(1000);
        System.out.printf("Saldo do vetce[0] depois de debitar 1000 reais: %f\n", vetce[0].getSaldo(1234));

        for(ContaEspecial ces : vetce){
            if(ces.getLimite() == 0){
                ces.ParaContaComum();
            }
        }
    }
}
