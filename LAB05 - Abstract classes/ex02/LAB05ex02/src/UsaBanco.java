public class UsaBanco {
    public static void main(String[] args){
        ContaComum cc;
        ContaCorrente[] vetce = new ContaEspecial[4];
        vetce[0] = new ContaEspecial(4500.0f, 12147, 1234, 2000);
        vetce[1] = new ContaEspecial(5500.0f, 12148, 2345, 3000);
        vetce[2] = new ContaEspecial(6500.0f, 12149, 3456, 4000);
        vetce[3] = new ContaEspecial(7500.0f, 12140, 4567, 5000);

        for(ContaEspecial ces : vetce){
            if(ces.getLimite() == 0){
                ces.conversaoParaContaComum();
            }
        }
    }
}
