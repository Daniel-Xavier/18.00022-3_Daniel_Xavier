package maua.prova.interfaces;
/**
 * Interface utilizada para verivicar se a senha esta correta
 */
public interface Seguuranca {
    /**
     * Metodo para ser implementado na classe Usuario para comparar a senha com a senha admin
     * @param senha (Senha digitada pelo usuario)
     * @return (true caso seja a mesma e false caso seja diferente da senha admin)
     */
    boolean verifica(String senha);
}
