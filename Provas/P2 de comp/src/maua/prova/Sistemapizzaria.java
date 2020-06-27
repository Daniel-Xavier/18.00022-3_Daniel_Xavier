package maua.prova;

import maua.prova.enums.estadodoPedido;
import maua.prova.modelos.Pedido;
import maua.prova.modelos.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistemapizzaria {


    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        ArrayList<Pedido> pedidos = new ArrayList();
        Usuario usr = new Usuario("Daniel", "Daniel@maua.br", "123456");
        int opcao, opc;
        System.out.println("Usuario: Daniel");
        System.out.println("email: Daniel@maua.br");
        System.out.println("senha:");
        String senha = imput.nextLine();


        do{
            System.out.println("-=-=-=-=-=-=-=-=-=Pizzaria o Rato que Ri!-=-=-=-=-=-=-=-=-=-\n" +
                    "1 - Nova Venda\n" +
                    "2 - Verificar Pedidos\n" +
                    "3 - Alterar Pedidos\n" +
                    "0 - Sair");
            opcao = Integer.parseInt(imput.nextLine());
            switch (opcao) {
                case 1:
                    if(usr.verifica(senha)){
                        System.out.println("Nova Venda\n" +
                                "Descricao do Pedido: \n");
                        String descricao = imput.nextLine();
                        System.out.println("Valor do Pedido: \n");
                        String valor = imput.nextLine();
                        System.out.println("Formas de Pagamento\n" +
                                "0 - DINHEIRO\n" +
                                "1 - DEBITO\n" +
                                "2 - CREDITO\n" +
                                "3 - VALE ALIMENTACAO\n" +
                                "4 - VALE REFEICAO");
                        opc = Integer.parseInt(imput.nextLine());
                        Pedido p = new Pedido(descricao, valor, opc);
                        pedidos.add(p);
                        System.out.println("\nPedido numero: " + p.getId());
                        System.out.println("Estado do pedido: " + p.getEstado());
                        System.out.println("Descricao do pedido: " + descricao);
                        System.out.println("Forma de Pagamento: " + p.getFpagamento());
                        System.out.println("Valor: R$ " + valor);
                        System.out.println("Seu Pedido foi feito");
                    } else{
                        System.out.println("acesso negado");
                    }break;

                case 2:
                    for (Pedido item : pedidos) {
                        item.mostrarPedido();
                    }break;

                case 3:
                    if (usr.verifica(senha)){
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
                                item.setEstado(estadodoPedido.values()[novoEstado]);
                            }
                        }
                    }break;
                case 0:
                    System.out.println("Exit");
                    break;
            }
        }while (opcao != 0);
    }
}
