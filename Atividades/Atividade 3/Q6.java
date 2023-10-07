/*
Vamos criar uma classe que seja responsável por fazer a atualização de todas 
as contas bancárias e gerar um relatório com o saldo anterior e saldo novo de 
cada uma das contas. 
*/
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
        
    // aqui voce imprime o saldo anterior, atualiza a conta, 
    // e depois imprime o saldo final
    // lembrando de somar o saldo final ao atributo saldoTotal
    }
    // outros métodos, colocar o getter para saldoTotal!
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

public class Q6{
    public static void main(String[] args) {
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        c.deposita(1000); 
        cc.deposita(1000); 
        cp.deposita(1000);
        c.atualiza(0.01); 
        cc.atualiza(0.01); 
        cp.atualiza(0.01);
        System.out.println(c.getSaldo()); 
        System.out.println(cc.getSaldo()); 
        System.out.println(cp.getSaldo());
    }
}