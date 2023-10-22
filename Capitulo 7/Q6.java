/* 6) (opcional) Vamos criar uma classe que seja responsável por fazer a atualização de todas as contas 
bancárias e gerar um relatório com o saldo anterior e saldo novo de cada uma das contas.
class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
    AtualizadorDeContas(double selic) { 
        this.selic = selic;
    }
    void roda(Conta c) {
        // aqui voce imprime o saldo anterior, atualiza a conta, 
        // e depois imprime o saldo final
        // lembrando de somar o saldo final ao atributo saldoTotal
    }
    // outros métodos, colocar o getter para saldoTotal!
} */

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

class AtualizadorDeContas{
    private double saldoTotal = 0;
    private double selic;

    AtualizadorDeContas(double selic){
        this.selic = selic;
    }

    void roda(Conta c) {
        // aqui voce imprime o saldo anterior, atualiza a conta, 
        // e depois imprime o saldo final
        // lembrando de somar o saldo final ao atributo saldoTotal
    }
    // outros métodos, colocar o getter para saldoTotal!

    
}

public class Q6{
    public static void main(String[] args) {
        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
    }
}