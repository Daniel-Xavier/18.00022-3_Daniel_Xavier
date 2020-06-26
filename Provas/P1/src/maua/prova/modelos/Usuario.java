package maua.prova.modelos;

import maua.prova.interfaces.Seguuranca;

public class Usuario implements Seguuranca {

    String nome, email, senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = "123456";
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {

        return email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    @Override
    public boolean verifica (String admin) {
        if (this.senha.equals(admin)){
            System.out.println("Acesso ao admin LIBERADO ");
            return true;
        }
        else {
            System.out.println("Acesso ao modo admin NEGADO! ");
            return false;
        }
    }
}