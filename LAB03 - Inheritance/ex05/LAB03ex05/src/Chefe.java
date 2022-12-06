import java.time.LocalDate;

public class Chefe extends Funcionarios{

    public Chefe(String nomeF, LocalDate dataNascimentoF, float salarioF) {
        super(nomeF, dataNascimentoF, salarioF);
    }

    public float calculaSalario(){
        return this.salario;
    }
}
