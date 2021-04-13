  //Daniel xavier
  //Ra: 18.00022-3
  //
  public class Contas {
    private static int totalContas = 0;
    private int idConta;
    private double saldo;
    private String QRCode = "";

    public Contas(double saldo) {
        totalContas += 1;
        this.idConta = totalContas;
        this.saldo = saldo;
    }

    public int getIdConta() {
        return idConta;
    }

    public double getSaldo() {
        return saldo;
    }
   
    public String getQRCode() {
        return QRCode;
    }

    public String getInformacoes() {
        String saida = String.format("Conta: {idConta: %s,saldo: %s}", this.idConta, this.saldo);        
        return saida;
    }
    
    public void gerarQRCode(String nome, double valor) {
        this.QRCode = Transacoes.getQRCode(this.idConta, nome, valor);
    }

    public static void recebimento(Contas conta, double valor){
        conta.saldo += valor;
    }
    public static void pagamento(Contas conta, double valor){
        conta.saldo -= valor;
    }
}