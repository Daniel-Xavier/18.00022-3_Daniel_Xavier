package maua.prova.modelos;

import maua.prova.interfaces.Seguuranca;


public class Usuario implements Seguuranca {

    String nome, email, senha;

    /**
     * Classe que representa o Usuario
     * @param nome
     * @param email
     * @param senha
     */

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    /**
     * aplicacao da Intercace Seguuranca que compara a senha para usuario
     * @param senha (senha digitada pelo usuario, usada para comparacao)
     * @return (true caso a senha seja correta ou false caso a senha nao seja a correta)
     */

    @Override
    public boolean verifica(String senha) {
        if (senha.equals(senha)){
            System.out.println("Acesso ao admin LIBERADO ");
            return true;
        }
        else {
            System.out.println("Acesso ao modo admin NEGADO! ");
            return false;
        }
    }
}
