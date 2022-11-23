public class main {
    public static void main(String[] args){
        Figurinha j1 = new Figurinha("Ronaldo", "atacante", "Brasil", "1997-08-18", 110.2f, 1.90f);
        j1.mostrarFigurinha();

        FigurinhaExtra j2 = new FigurinhaExtra("Ronaldo", "atacante", "Brasil", "1997-08-18", 110.2f, 1.90f, "Legends", "Ouro");
        j2.mostrarFigurinhaExtra();
    }
}
