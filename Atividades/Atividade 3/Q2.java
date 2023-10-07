/* 2. Adicione um método na classe Conta, que atualiza essa conta de acordo com
uma taxa percentual fornecida.*/
class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }
    void atualiza(double taxa){
        this.saldo += this.saldo * taxa;
    }
}

public class Q2{
    public static void main(String[] args) {
    }
}