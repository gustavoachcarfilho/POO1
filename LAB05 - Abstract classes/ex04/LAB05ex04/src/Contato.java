import java.time.LocalDate;

public abstract class Contato {
    protected String apelido, nome, email;
    protected LocalDate aniversario;

    public void ImprimirBasico(){
        System.out.printf("Dados do contato:\n");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Apelido: %s\n", apelido);
        System.out.printf("Email: %s\n", email);
        System.out.printf("Aniversario: %s\n", aniversario.toString());
    }

    public abstract void ImprimirContato();

    public Contato(String apelido, String nome, String email, LocalDate aniversario){
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getAniversario() {
        return aniversario;
    }

    public void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }
}
