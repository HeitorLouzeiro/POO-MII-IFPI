class ContaCorrente implements Conta {
    private double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor - 0.1;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }
}

class ContaPoupanca implements Conta {
    private double saldo;

    public ContaPoupanca(double saldo) {
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

    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }
}

public class App {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(100);
        ContaPoupanca cp = new ContaPoupanca(100);

        cc.depositar(100);
        cp.depositar(100);

        cc.atualiza(0.01);
        cp.atualiza(0.01);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }
}