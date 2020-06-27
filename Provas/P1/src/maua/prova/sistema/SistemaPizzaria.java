package maua.prova.sistema;

import maua.prova.modelos.*;
import maua.prova.enums.*;
import maua.prova.interfaces.Seguuranca;


import java.util.ArrayList;
import java.io.Console;
import java.util.Scanner;

public class SistemaPizzaria implements Seguuranca{
    ArrayList<Pedido> pedidos;
    ArrayList<Usuario> usuarios;

    public void run() {
        usuarios = new ArrayList<Usuario>();
        pedidos = new ArrayList<Pedido>();
        usuarios.add(new Usuario("Daniel", "DAniel@maua.br", "123456"));

        if(verifica()){
            int opcao = 1;
            Scanner imput = new Scanner(System.in);
            while (opcao != 0){
                System.out.println("-=-=-=-=-=-=-=-=-=Pizzaria o Rato que Ri!-=-=-=-=-=-=-=-=-=-\n" +
                    "1 - Nova Venda\n" +
                    "2 - Verificar Pedidos\n" +
                    "3 - Alterar Pedidos\n" +
                    "0 - Sair");
                opcao = imput.nextInt();
                switch (opcao) {
                    case 1:
                        if(verifica()){
                            System.out.println("Nova Venda\n" +
                                "Descricao do Pedido: \n");
                            String descricao = imput.nextLine();
                            System.out.println("Valor do Pedido: \n");
                            Float valor = imput.nextFloat();
                            System.out.println("Formas de Pagamento\n" +
                                    "0 - DINHEIRO\n" +
                                    "1 - DEBITO\n" +
                                    "2 - CREDITO\n" +
                                    "3 - VALE ALIMENTACAO\n" +
                                    "4 - VALE REFEICAO");
                            int op = Integer.parseInt(imput.nextLine());
                            pedidos.add(new Pedido(descricao, valor, formadePagamento.values()[op]));
                            System.out.println("Seu Pedido foi feito");
                        }
                    case 2:
                        for (Pedido item : pedidos) {
                            item.mostrarPedido();
                        }

                    case 3:
                        if (verifica()){
                            for (Pedido item : pedidos) {
                                item.mostrarPedido();
                            }
                            System.out.println("ID do Pedido");
                            String alterandopedido = imput.nextLine();
                            System.out.println("0 - REALIZADO\n" +
                                    "0 - REALIZADO\n" +
                                    "1 - PREPARACAO\n" +
                                    "2 - SAIU PARA ENTREGA\n" +
                                    "3 - ENTREGUE\n" +
                                    "4 - DEVOLVIDO\n");
                            int novoEstado = Integer.parseInt(imput.nextLine());
                            for(Pedido item : pedidos) {
                                if(item.getId().equals(alterandopedido)){
                                    item.setEstadoPedido(estadodoPedido.values()[novoEstado]);
                                }
                            }
                        }
                }
            }
        }
    }


    @Override
    public boolean verifica(){
        boolean verificando = false;
        Scanner imput = new Scanner(System.in);
        Console console = System.console();
        while(!verificando){
            System.out.println("Digite Login e Senha para usar o sistema com admin");
            System.out.print("Login: ");
            String login = imput.nextLine();
            String senha = new String(console.readPassword("Senha: "));
            for (Usuario usuario : usuarios) {
                if(login.equals(usuario.getNome()) && usuario.verifica(senha)){
                    verificando = true;
                    return true;
                } else {
                    verificando = false;
                    System.out.println("Acesso ao modo admin NEGADO!");
                }
            }
        }
        return false;
    }

}


