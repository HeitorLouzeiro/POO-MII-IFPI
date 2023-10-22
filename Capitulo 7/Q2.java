/* 2) Adicione um método na classe Conta, que atualiza essa conta de acordo com uma taxa percentual fornecida.
class Conta {
    private double saldo;
    // outros métodos aqui também ...
    void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
    }
} */

class Conta {
    private double saldo;
    void deposita(double valor) {
        this.saldo += valor;
    }
    void saca(double valor) { 
        this.saldo -= valor;
    }
    double getSaldo() { 
        return this.saldo;
    }

    void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
    }
}