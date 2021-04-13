import java.util.ArrayList;
import  java.util.Scanner;
  //Daniel xavier
  //Ra: 18.00022-3

  public class App {
    
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            ArrayList<Usuarios> listaUsers = new ArrayList<>();
            String nome;
            String senha;
            String email;
            System.out.println("Informe o nome do usuário 1: ");
            nome = sc.nextLine();
            System.out.println("Informe a senha do usuário 1: ");
            senha = sc.nextLine();
            System.out.println("Informe o email do usuário 1: ");
            email = sc.nextLine();
            Usuarios user1 = new Usuarios(nome, senha, email);
            listaUsers.add(user1);
    
            System.out.println("Informe o nome do usuário 2: ");
            nome = sc.nextLine();
            System.out.println("Informe a senha do usuário 2: ");
            senha = sc.nextLine();
            System.out.println("Informe o email do usuário 2: ");
            email = sc.nextLine();
            Usuarios user2 = new Usuarios(nome, senha, email);        
            listaUsers.add(user2);
    
            System.out.println("Informe o nome do usuário 3: ");
            nome = sc.nextLine();
            System.out.println("Informe a senha do usuário 3: ");
            senha = sc.nextLine();
            System.out.println("Informe o email do usuário 3: ");
            email = sc.nextLine();
            Usuarios user3 = new Usuarios(nome, senha, email);        
            listaUsers.add(user3);
    
    
            user1.AbrirConta(1000);
            user2.AbrirConta(250);
            user3.AbrirConta(3000);
    
            exibirInformacoes(listaUsers);
    
            user1.gerarRecebimento(250);
            user2.pagarUsuario(user1);
            user3.pagarUsuario(user1);
            user2.pagarUsuario(user1);
            user2.gerarRecebimento(1000);
            user3.pagarUsuario(user2);
            exibirInformacoes(listaUsers);
    
    
            sc.close();
        }
    
        public static void exibirInformacoes(ArrayList<Usuarios> users) {
            for (Usuarios usuarios : users) {
                usuarios.getInformacoes();
            }
        }
    }