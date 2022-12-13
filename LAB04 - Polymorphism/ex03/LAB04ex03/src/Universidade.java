import java.time.LocalDate;

public class Universidade {
    String nomeUn;
    LocalDate dataFund;

    public String getNomeUn() {
        return nomeUn;
    }

    public void setNomeUn(String nomeUn) {
        this.nomeUn = nomeUn;
    }

    public LocalDate getDataFund() {
        return dataFund;
    }

    public void setDataFund(LocalDate dataFund) {
        this.dataFund = dataFund;
    }

    public void qtdEstudantes(Estudante[] e){
        int doutorado = 0, mestrado = 0, pos = 0, grad = 0;
        for(Estudante es : e){
            if(es instanceof EstudanteDoutorado){
                doutorado++;
            } else if (es instanceof EstudanteGraduacao) {
                grad++;
            } else if (es instanceof EstudanteMestrado) {
                mestrado++;
            } else if (es instanceof EstudantePosGrad) {
                pos++;
            }
        }
        System.out.printf("Quantidade de estudantes de graduacao: %d\n", grad);
        System.out.printf("Quantidade de estudantes de pos-graduacao: %d\n", pos);
        System.out.printf("Quantidade de estudantes de mestrado: %d\n", mestrado);
        System.out.printf("Quantidade de estudantes de doutorado: %d\n", doutorado);
    }

    public void mostraInfo(Estudante[] e){
        for(Estudante es : e){
            if(es instanceof EstudanteDoutorado){
                System.out.println("Estudantes de Doutorado");
                System.out.printf("Nome: %s\n Endereco: %s\n Formacao: %s\n Linha de pesquisa: %s\n Titulo da tese: %s\n", es.getNome(), es.getEndereco(), ((EstudanteDoutorado) es).getFormacao(), ((EstudanteDoutorado) es).getLinhadDePesquisa(), ((EstudanteDoutorado) es).getTituloTese());
            } else if (es instanceof EstudanteGraduacao) {
                System.out.printf("\nEstudantes de Graduacao\n");
                System.out.printf("Nome: %s\n Endereco: %s\n Titulo do TCC: %s\n", es.getNome(), es.getEndereco(), ((EstudanteGraduacao) es).getTituloTCC());
            } else if (es instanceof EstudanteMestrado) {
                System.out.printf("\nEstudantes de Mestrado\n");
                System.out.printf("Nome: %s\n Endereco: %s\n Formacao: %s\n Linha de pesquisa: %s\n Tipo: %s\n Titulo da dissertacao: %s\n", es.getNome(), es.getEndereco(), ((EstudanteMestrado) es).getFormacao(), ((EstudanteMestrado) es).getLinhadDePesquisa(), ((EstudanteMestrado) es).getTipo(), ((EstudanteMestrado) es).getTituloDissertacao());
            } else if (es instanceof EstudantePosGrad) {
                System.out.printf("\nEstudantes de Pos-Graduacao\n");
                System.out.printf("Nome: %s\n Endereco: %s\n Formacao: %s\n Linha de pesquisa: %s\n", es.getNome(), es.getEndereco(), ((EstudantePosGrad) es).getFormacao(), ((EstudantePosGrad) es).getLinhadDePesquisa());
            }
        }
    }
}
