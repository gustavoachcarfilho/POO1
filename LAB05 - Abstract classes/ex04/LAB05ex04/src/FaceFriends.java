import java.time.LocalDate;
import java.util.Scanner;

public class FaceFriends{

    static int ultimaPos = 0;
    public static void main(String[] args) {
        Contato[] vetContatos = new Contato[5];
        int opcao;
        String tipoContato;
        String apelido;
        String nome;
        String email;
        String parentesco;
        int grau;
        String tipo;
        String aniversario;


        /*
        vetContatos[0] = new Familia("Buzina", "Gustavo", "gustavofilho@greal.com.br", LocalDate.parse("1997-08-18"), "Irmao");
        vetContatos[1] = new Amigos("Ribeiro", "Matheus", "mribeiro@gmail.com", LocalDate.parse("1999-06-23"), 2);
        vetContatos[2] = new Amigos("Rocha", "Gabriel", "g_rocha@gmail.com", LocalDate.parse("1997-05-29"), 1);
        vetContatos[3] = new Familia("Gueguel", "Miguel", "miguelfiales@gmail.com", LocalDate.parse("2010-02-03"), "Irmao");
        vetContatos[4] = new Trabalho("Rodrigues", "Diego", "diegorodrigues@greal.com.br", LocalDate.parse("1989-06-07"), "Analista de seguranca");
        */

        Scanner sc = new Scanner(System.in);

        //Menu
        System.out.println("-------- MENU --------");
        System.out.printf("Opcao 1 -> Inserir um contato\n");
        System.out.printf("Opcao 2 -> Imprimir todos os contatos\n");
        System.out.printf("Opcao 3 -> Imprimir somente os familiares\n");
        System.out.printf("Opcao 4 -> Imprimir somente os amigos\n");
        System.out.printf("Opcao 5 -> Imprimir os melhores amigos\n");
        System.out.printf("Opcao 6 -> Imprimir somente os colegas de trabalho\n");
        System.out.printf("Opcao 7 -> Imprimir somente os melhores amigos, os irmaos e os colegas de trabalho\n");
        System.out.printf("Opcao 8 -> Imprimir os dados de um contato especifico\n");
        System.out.printf("Digite o numero da opcao escolhida: ");
        opcao = sc.nextInt();

        if(opcao == 1){
            System.out.printf("Escreva qual o tipo do contato (familia/amigos/trabalho):\n");
            tipoContato = sc.next();
            System.out.printf("Digite o apelido:\n");
            apelido = sc.next();
            System.out.printf("Digite o nome:\n");
            nome = sc.next();
            System.out.printf("Digite o email:\n");
            email = sc.next();
            System.out.printf("Digite a data de aniversario:\n");
            aniversario = sc.next();

            if(tipoContato.equals("familia")){
                System.out.printf("Digite o parentesco:\n");
                parentesco = sc.next();
                vetContatos[ultimaPos] = new Familia(apelido, nome, email, LocalDate.parse(aniversario), parentesco);
                ultimaPos++;
            }
            else if(tipoContato.equals("amigos")){
                System.out.printf("Digite o grau de amizade (1, 2 ou 3):\n");
                grau = sc.nextInt();
                vetContatos[ultimaPos] = new Amigos(apelido, nome, email, LocalDate.parse(aniversario), grau);
                ultimaPos++;
            }
            else if(tipoContato.equals("trabalho")){
                System.out.printf("Digite o tipo:\n");
                tipo = sc.next();
                vetContatos[ultimaPos] = new Trabalho(apelido, nome, email, LocalDate.parse(aniversario), tipo);
                ultimaPos++;
            }
        }
        /*
        else if(opcao == 2){
            System.out.printf("Lista de todos os contatos\n");
            for(int i = 0; i < ultimaPos; i++){
                System.out.printf("Nome: %s\n", vetContatos[i].nome);
                System.out.printf("Apelido: %s\n", vetContatos[i].apelido);
                System.out.printf("Email: %s\n", vetContatos[i].email);
                System.out.printf("Aniversario: %s\n", vetContatos[i].aniversario.toString());
                if(vetContatos[i] instanceof Familia){
                    System.out.printf("Parentesco: %s\n", ((Familia) vetContatos[i]).getParentesco());
                }
                else if(vetContatos[i] instanceof Amigos){
                    System.out.printf("Grau: %d\n", ((Amigos) vetContatos[i]).getGrau());
                }
                else if(vetContatos[i] instanceof Trabalho){
                    System.out.printf("Tipo: %s\n", ((Trabalho) vetContatos[i]).getTipo());
                }
            }
        }
        else if(opcao == 3){

        }
        else if(opcao == 4){

        }
        else if(opcao == 5){

        }
        else if(opcao == 6){

        }
        else if(opcao == 7){

        }
    */


<<<<<<< HEAD
        for(int i = 0; i < ultimaPos; i++){
            System.out.printf("%s\n", vetContatos[i].nome);
=======
    }
    public void imprimirTodosContatos(Contato[] vetContatos){
        for(int i = 0; i < ultimaPos; i++){
            if(vetContatos[i] instanceof Familia){
                System.out.printf("Nome: %s\n", vetContatos[i].getNome());
                System.out.printf("Nome: %s\n", vetContatos[i].getApelido());
                System.out.printf("Nome: %s\n", vetContatos[i].getEmail());
            }
>>>>>>> 7a6651b7ec1348efe3231de89da79aff2addb82b
        }
    }
}