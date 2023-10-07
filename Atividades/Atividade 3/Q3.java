/* 3. Crie duas subclasses da classe Conta: ContaCorrente e ContaPoupanca.
Ambas terão o método atualiza reescrito: A ContaCorrente deve atualizar-se com
o dobro da taxa e a ContaPoupanca deve atualizar-se com o triplo da taxa. Além
disso, a ContaCorrente deve reescrever o método deposita, a fim de retirar uma
taxa bancária de dez centavos de cada depósito. */
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

class ContaCorrente extends Conta{
    void atualiza(double taxa){
        this.saldo += this.saldo * taxa * 2;
    }
    void depositar(double valor){
        this.saldo += valor - 0.1;
    }
}

class ContaPoupanca extends Conta{
    void atualiza(double taxa){
        this.saldo += this.saldo * taxa * 3;
    }
}

public class Q3{
    public static void main(String[] args) {
    }
}