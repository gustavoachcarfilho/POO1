import java.time.LocalDate;

public class FolhaDePagamento{


    public FolhaDePagamento() {
    }



    public void geraFolhaDePagamento(Funcionarios[] func){
        float chefeT = 0, vendedorT = 0, operarioT = 0, horistaT = 0, total;
        for(Funcionarios f : func){
            if(f instanceof Vendedor){
                vendedorT += ((Vendedor) f).calculaSalario();
                System.out.printf("Salario do vendedor %s = R$%.2f\n", f.getNome(), ((Vendedor) f).calculaSalario());
            }
            else if(f instanceof Operario){
                operarioT += ((Operario) f).calculaSalario();
                System.out.printf("Salario do operario %s = R$%.2f\n", f.getNome(), ((Operario) f).calculaSalario());
            }
            else if(f instanceof Chefe){
                chefeT += ((Chefe) f).calculaSalario();
                System.out.printf("Salario do chefe %s = R$%.2f\n", f.getNome(), ((Chefe) f).calculaSalario());
            }
            else if(f instanceof Horista){
                horistaT += ((Horista) f).calculaSalario();
                System.out.printf("Salario do horista %s = R$%.2f\n", f.getNome(), ((Horista) f).calculaSalario());
            }
        }
        total = horistaT + operarioT + vendedorT + chefeT;
        System.out.println("-----------------------------------------");
        System.out.printf("Total dos salarios dos chefes: R$%.2f\n", chefeT);
        System.out.printf("Total dos salarios dos vendedores: R$%.2f\n", vendedorT);
        System.out.printf("Total dos salarios dos operarios: R$%.2f\n", operarioT);
        System.out.printf("Total dos salarios dos horistas: R$%.2f\n", horistaT);
        System.out.println("-----------------------------------------");
        System.out.printf("Total dos pagamentos dos salarios: R$%.2f\n", total);
    }
}
