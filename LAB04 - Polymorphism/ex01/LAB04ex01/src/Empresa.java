import java.time.LocalDate;

public class Empresa {
    public static void main(String[] args) {

        Funcionarios[] vetFunc = new Funcionarios[4];
        
        vetFunc[0] = new Chefe("Gustavo", LocalDate.parse("1998-05-06"), 2500f);
        vetFunc[1] = new Horista("Gustavo", LocalDate.parse("1998-05-06"), 50f, 24);
        vetFunc[2] = new Vendedor("Gustavo", LocalDate.parse("1998-05-06"), 2500f, 200f, 50f);
        vetFunc[3] = new Operario("Gustavo", LocalDate.parse("1998-05-06"), 500f, 50);

        FolhaDePagamento x = new FolhaDePagamento();
        x.geraFolhaDePagamento(vetFunc);
    }
}