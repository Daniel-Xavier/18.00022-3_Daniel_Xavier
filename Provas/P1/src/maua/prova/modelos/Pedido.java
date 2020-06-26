package maua.prova.modelos;

import maua.prova.enums.*;

import java.util.Random;

public class Pedido {
    private String id, descricao;
    private float valor;
    private EstadodoPedido estadodoPedido;
    private FormadePagamento formadePagamento;


    public Pedido(String descricao, float valor,FormadePagamento formadePagamento, EstadodoPedido estadodoPedido) {
        this.descricao = descricao;
        this.valor = valor;
        this.estadodoPedido = estadodoPedido;
        this.formadePagamento = formadePagamento;
        this.id = geradorId();
    }


    public void mostrarPedido(){
        System.out.println(
                "\n" +
                        "=*=*=*=*=*=*=*=*=*=*Pedido*=*=*=*=*=*=*=*=*=*=\n" +
                        "Id do pedido: " + this.id + "\n" +
                        "Descrição: " + this.descricao + "\n" +
                        "Valor: R$ " + this.valor + "\n" +
                        "Forma de Pagamento: " + this.formadePagamento + "\n" +
                        "Estado do pedido: " + this.estadodoPedido + "\n" +
                        "=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*="
        );
    }


    // gerador de id dos pedidos
    private String geradorId() {
        Random random = new Random();
        String idGerado = "";
        for (int i = 0; i < 3; i++)
            idGerado += random.nextInt(10);
        return idGerado;
    }

    public String getId() {
        return id;
    }

    public void setEstadodoPedido(EstadodoPedido estadodoPedido) {
        this.estadodoPedido = estadodoPedido;
    }


}
