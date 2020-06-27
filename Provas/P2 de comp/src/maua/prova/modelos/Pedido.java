package maua.prova.modelos;

import java.util.Random;
import maua.prova.enums.*;

    public class Pedido {

        Enum estado, fpagamento;
        String Id, descricao, valor;

        public Enum getEstado() {
            return estado;
        }

        public void setEstado(Enum estado) {
            this.estado = estado;
        }

        public Enum getFpagamento() {
            return fpagamento;
        }

        public void setFpagamento(Enum fpagamento) {
            this.fpagamento = fpagamento;
        }

        public String getId() {
            return Id;
        }

        public void setId(String id) {
            Id = id;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        /**
         * Construtor do pedido.
         * @param descricao (O pedido do usuario)
         * @param formapagamento (Opcao que o usario escolheu para pagar o pedido)
         * @param valor (preco do pedido em reais)
         */

        public Pedido(String descricao, String valor, int formapagamento) {
            switch (formapagamento) {
                case 1:
                    fpagamento = formadePagamento.CREDITO;
                case 2:
                    fpagamento = formadePagamento.DEBITO;
                case 3:
                    fpagamento = formadePagamento.DINHEIRO;
                case 4:
                    fpagamento = formadePagamento.VALE_ALIMENTACAO;
                    break;
                case 5:
                    fpagamento = formadePagamento.VALE_REFEICAOO;
                    break;
            }
            this.estado = estadodoPedido.REALIZADO;
            this.Id = geradorId();
            this.descricao = descricao;
            this.valor = valor;
        }


        public void mostrarPedido(){
            System.out.println(
                    "\n" +
                            "=*=*=*=*=*=*=*=*=*=*Pedido*=*=*=*=*=*=*=*=*=*=\n" +
                            "Id do pedido: " + this.Id + "\n" +
                            "Descrição: " + this.descricao + "\n" +
                            "Valor: R$ " + this.valor + "\n" +
                            "Forma de Pagamento: " + this.getFpagamento() + "\n" +
                            "Estado do pedido: " + this.getEstado() + "\n" +
                            "=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
        }


        /**
         * Gerador de um numero aleatorio que serve como ID do pedido.
         * @return (um numero inteiro ramdomico)
         */
        private String geradorId() {
            Random random = new Random();
            String idGerado = "";
            for (int i = 0; i < 3; i++) {
                idGerado += random.nextInt(10);
            }return idGerado;
        }


    }
