public class Main {
    public static void main(String[] args){
        Figurinha j1 = new Figurinha("Ronaldo", "atacante", "Brasil", "1997-08-18", 110.2f, 1.90f);
        j1.mostrarFigurinha();
        System.out.printf("\n\n");
        FigurinhaExtra j2 = new FigurinhaExtra( j1, "Legends", "Ouro");
        j2.mostrarFigurinhaExtra();
    }
}