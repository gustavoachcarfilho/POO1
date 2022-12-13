import java.time.LocalDate;

public class Amigos extends Contato{
    private int grau; // 1 = melhor amigo, 2 = amigo, 3 = conhecido

    public Amigos(String apelido, String nome, String email, LocalDate aniversario, int grau){
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }

    public void ImprimirContato(){
        super.ImprimirBasico();
        if(grau == 1){
            System.out.printf("Grau de amizade: Melhores amigos(as)\n");
        }
        else if(grau == 2){
            System.out.printf("Grau de amizade: Amigos(as)\n");
        }
        else if (grau == 3){
            System.out.printf("Grau de amizade: Conhecidos(as)\n");
        }
    }

    public Amigos inserirContato(Contato[] c){
        int last = c.length;
        c[last] = new Amigos(apelido, nome, email, aniversario, grau);
        return (Amigos) c[last];
    }
}
