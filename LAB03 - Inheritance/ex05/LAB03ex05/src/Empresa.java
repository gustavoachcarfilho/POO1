import java.time.LocalDate;

public class Empresa {
    public static void main(String[] args) {

        Chefe[] vetChefe = new Chefe[10];
        Vendedor[] vetVend = new Vendedor[10];
        Operario[] vetOp = new Operario[10];
        Horista[] vetHor = new Horista[10];

        Chefe chefe = new Chefe("Gustavo", LocalDate.parse("1998-05-06"), 2500f);
        Horista horista = new Horista("Gustavo", LocalDate.parse("1998-05-06"), 50f, 24);
        Vendedor vendedor = new Vendedor("Gustavo", LocalDate.parse("1998-05-06"), 2500f, 200f, 50f);
        Operario operario = new Operario("Gustavo", LocalDate.parse("1998-05-06"), 500f, 50);

        System.out.println(chefe.calculaSalario());
        System.out.println(vendedor.calculaSalario());
        System.out.println(horista.calculaSalario());
        System.out.println(operario.calculaSalario());
    }
}