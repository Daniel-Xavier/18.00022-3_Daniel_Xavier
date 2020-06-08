  //Daniel xavier
  //Ra: 18.00022-3
  //
  public class Conta {

    private Usuario usuario;
    private int idConta;
    private double saldo;
    
    public Conta (Usuario usuario, double saldo){
        this.usuario = usuario;
        this.saldo = saldo;
    }
    
    public Usuario getUsuario(){
            return usuario;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public static void receber(Contas conta, double valor){
        conta.saldo += valor;
    }
    public static void pagar(Contas conta, double valor){
        conta.saldo -= valor;
    }


  }