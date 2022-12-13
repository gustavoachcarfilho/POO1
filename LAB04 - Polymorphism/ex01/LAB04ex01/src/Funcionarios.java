import java.time.LocalDate;
public class Funcionarios {
    protected String nome;
    protected LocalDate dataNascimento;
    protected float salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Funcionarios(String nomeF, LocalDate dataNascimentoF, float salarioF){
        this.nome = nomeF;
        this.dataNascimento = dataNascimentoF;
        this.salario = salarioF;
    }
}
