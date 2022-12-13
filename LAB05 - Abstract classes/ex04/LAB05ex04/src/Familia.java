import java.time.LocalDate;

public class Familia extends Contato{
    private String parentesco;

    public Familia(String apelido, String nome, String email, LocalDate aniversario, String parentesco){
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }

    public void ImprimirContato(){
        super.ImprimirBasico();
        System.out.printf("Parentesco: %s\n", parentesco);
    }

    public Familia inserirContato(Contato[] c, String apelido, String nome, String email, LocalDate aniversario, String parentesco){
        int last = c.length;
        c[last] = new Familia(apelido, nome, email, aniversario, parentesco);
        return (Familia) c[last];
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }


}
