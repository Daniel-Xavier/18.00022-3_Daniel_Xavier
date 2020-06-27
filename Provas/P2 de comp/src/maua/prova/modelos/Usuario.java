package maua.prova.modelos;

import maua.prova.interfaces.Seguuranca;


public class Usuario implements Seguuranca {

    String nome, email, senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

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
