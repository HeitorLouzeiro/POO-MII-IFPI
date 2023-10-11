public interface Conta {
    double getSaldo();
    void depositar(double valor);
    void sacar(double valor);
    void atualiza(double taxa);
}