import java.time.LocalDate;

public class Trabalho extends Contato{
    private String tipo;

    public Trabalho(String apelido, String nome, String email, LocalDate aniversario, String tipo){
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }

    public void ImprimirContato(){
        super.ImprimirBasico();
        System.out.printf("Tipo do contato no trabalho: %s\n", tipo);
    }

    public Trabalho inserirContato(Contato[] c){
        int last = c.length;
        c[last] = new Trabalho(apelido, nome, email, aniversario, tipo);
        return (Trabalho) c[last];
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }
}
