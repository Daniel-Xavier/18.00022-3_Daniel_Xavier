package maua.prova.modelos;

import java.util.Random;
import maua.prova.enums.*;

public class Pedido {
    private String id, descricao;
    private float valor;
    private Enum<estadodoPedido> estadoPedido;
    private Enum<formadePagamento> formaPagamento;


    public Pedido(String descricao, float valor, Enum<formadePagamento> formaPagamento) {
        this.descricao = descricao;
        this.valor = valor;
        this.estadoPedido = estadodoPedido.REALIZADO;
        this.formaPagamento = formaPagamento;
        this.id = geradorId();
    }


    public void mostrarPedido(){
        System.out.println(
                "\n" +
                        "=*=*=*=*=*=*=*=*=*=*Pedido*=*=*=*=*=*=*=*=*=*=\n" +
                        "Id do pedido: " + this.id + "\n" +
                        "Descrição: " + this.descricao + "\n" +
                        "Valor: R$ " + this.valor + "\n" +
                        "Forma de Pagamento: " + this.formaPagamento + "\n" +
                        "Estado do pedido: " + this.estadoPedido + "\n" +
                        "=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*="
        );
    }


    // gerador de id dos pedidos
    private String geradorId() {
        Random random = new Random();
        String idGerado = "";
        for (int i = 0; i < 3; i++) {
            idGerado += random.nextInt(10);
        }return idGerado;
    }

    public String getId() {
        return id;
    }


    public void setEstadoPedido(Enum<estadodoPedido> estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
}
