public class Main {
    public static void main(String[] args) {
        Produto [] vp = new Produto[3];
        Cliente [] vc = new Cliente[3];
        Servico [] vs = new Servico[3];

        /*
        Classificavel[] vetor = new Classificavel[3];
        vetor[0] = new Produto(1234);
        */

        vp[0] = new Produto(1111);
        vp[1] = new Produto(3333);
        vp[2] = new Produto(2222);

        vc[0] = new Cliente("Amanda");
        vc[1] = new Cliente("Bernardo");
        vc[2] = new Cliente("Caio");

        vs[0] = new Servico(400.0);
        vs[1] = new Servico(900.0);
        vs[2] = new Servico(600.0);

        Classificador.ordena(vp);
        Classificador.ordena(vc);
        Classificador.ordena(vs);

        for(int i = 0; i < 3; i++){
            System.out.printf("%d\n", vp[i].getCodigo());
        }

        for(int i = 0; i < 3; i++){
            System.out.printf("%s\n", vc[i].getNome());
        }

        for(int i = 0; i < 3; i++){
            System.out.printf("%f\n", vs[i].getPreco());
        }

    }
}