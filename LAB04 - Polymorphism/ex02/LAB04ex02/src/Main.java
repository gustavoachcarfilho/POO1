public class Main {
    public static void main(String[] args) {
        Forma formas[] = new Forma[6];
        formas[0] = new Circulo(2.0F);
        formas[1] = new Quadrado(4.0F);
        formas[2] = new Triangulo(2.0F, (float) 3.2);
        formas[3] = new Esfera(5.0F);
        formas[4] = new Cubo(4.5F);
        formas[5] = new Tetraedro(3.0F);

        System.out.println("<< Áreas (e volumes se for o caso) >>");

        for(int i=0; i<formas.length; i++) {
            System.out.printf("formas[%d] - area: %f", i, formas[i].getArea());

            if(formas[i] instanceof FormaTridimensional)
                System.out.printf(" volume: %f", ((FormaTridimensional) formas[i]).getVolume());

            System.out.println("\n");
        }


        System.out.println("<< Descrição textual >>");
        for (Forma f : formas){
            f.descricao();
        }
    }
}