package maua.prova.modelos;

import maua.prova.enums.FormadePagamento;
import maua.prova.enums.EstadodoPedido;

import java.util.Random;

public class Pedido {
    private String id, descricao;
    private float valor;
    private EstadodoPedido estadodoPedido;
    private FormadePagamento formadepagamento;


    public Pedido (String descricao, float valor, EstadodoPedido estadodoPedido, FormadePagamento formadepagamento;) {
        this.descricao = descricao;
        this.valor = valor;
        this.estadodoPedido = estadodoPedido.REALIZADO;
        this.formadepagamento = formadepagamento;
        this.id = geradorId();
    }


    public mostrarPedido(){
        System.out.println(
                "\n" +
                        "=*=*=*=*=*=*=*=*=*=*Pedido*=*=*=*=*=*=*=*=*=*=\n" +
                        "Id do pedido: " + this.id + "\n" +
                        "Descrição: " + this.descricao + "\n" +
                        "Valor: R$ " + this.valor + "\n" +
                        "Forma de Pagamento: " + this.formadepagamento + "\n" +
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
