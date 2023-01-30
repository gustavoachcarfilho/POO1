public class Funcionario {
    private int cpf;
    private String nome;
    private double salario, tetoSalarial;

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public int getCpf(){
        return this.cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setTetoSalarial(double tetoSalarial){
        this.tetoSalarial = tetoSalarial;
    }

    public double getTetoSalarial(){
        return this.tetoSalarial;
    }

    public Funcionario(int cpf, String nome, double salario){
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
        this.tetoSalarial = 40000f;
    }

    public double aumentaSalario(int porcentagem) throws IllegalStateException{
        double novoSalario;
        novoSalario = this.salario + (porcentagem / 100.0 * salario); //salario = salario + porcentagem/100 * salario;
        if (novoSalario < 0){
            System.out.println(novoSalario);
            throw new IllegalStateException ("Salario ficou negativo!");
        }
        if (novoSalario > tetoSalarial) {
            System.out.println(novoSalario);
            throw new IllegalStateException ("Salario ultrapassou o teto salarial!");
        }
        System.out.println(novoSalario);
        return novoSalario;
    }
}
