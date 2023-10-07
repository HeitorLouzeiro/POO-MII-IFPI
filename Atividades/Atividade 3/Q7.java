/* 7) (opcional) No método main, vamos criar algumas contas e rodá-las: */
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
class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
    AtualizadorDeContas(double selic) { 
        this.selic = selic;
    }
    void roda(Conta c) {
        System.out.println("Saldo anterior: " + c.getSaldo());
        c.atualiza(this.selic);
        System.out.println("Saldo final: " + c.getSaldo());
        this.saldoTotal += c.getSaldo();

    }
    // outros métodos, colocar o getter para saldoTotal!
    public double getSaldoTotal() {
        return this.saldoTotal;
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

public class Q7{
    public static void main(String[] args) {
        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        c.depositar(1000); 
        cc.depositar(1000); 
        cp.depositar(1000);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
        adc.roda(c); 
        adc.roda(cc); 
        adc.roda(cp);
        System.out.println("Saldo Total: " + adc.getSaldoTotal());
    }
}