  //Daniel xavier
  //Ra: 18.00022-3
  

public class Usuarios {

    private String nome, senha, email, conta;

    public Usuarios(String nome, String senha, String email){

        this.nome = nome;
        this.senha = senha;
        this.email = email;

    }

    public String getNome(){
        return nome;
    }

    public String getSenha(){
        return senha;
    }

    public String getemail(){
        return email;
    }
    
    public Contas getConta(){
        return conta;
    }

}