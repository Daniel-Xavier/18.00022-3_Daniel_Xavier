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



    }
