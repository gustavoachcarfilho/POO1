public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario(123456, "Gu", 30000f);
        System.out.println(f.aumentaSalario(-200));
    }
}