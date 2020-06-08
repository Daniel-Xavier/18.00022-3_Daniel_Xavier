import java.util.ArrayList;
import  java.util.Scanner;
  //Daniel xavier
  //Ra: 18.00022-3
  
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuarios> listaUsuario = new ArrayList<>();
        String nome, senha, email;
        
        System.out.println("Informe o nome, senha, email do usuário 1: ");
        nome = scanner.nextLine();
        senha = scanner.nextLine();
        email = scanner.nextLine();
        Usuarios usuario1 = new Usuarios(nome, senha, email);
        listaUsuario.add(usuarios1);

        System.out.println("Informe o nome ,senha, email do usuário 2: ");
        nome = scanner.nextLine();
        senha = scanner.nextLine();
        email = scanner.nextLine();
        Usuarios usuario2 = new Usuarios(nome, senha, email);        
        listaUsuario.add(usuario2);

        System.out.println("Informe o nome, senha, email do usuário 3: ");
        nome = scanner.nextLine();
        senha = scanner.nextLine();
        email = scanner.nextLine();
        Usuarios usuario3 = new Usuarios(nome, senha, email);
        listaUsuario.add(usuario3);
    }

}


