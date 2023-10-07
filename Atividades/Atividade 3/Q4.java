/* Crie uma classe com método main e instancie essas classes, atualize-as e veja o resultado. Algo como:
class TestaContas {
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
Após imprimir o saldo (getSaldo()) de cada uma das contas, o que acontece?  */
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

public class Q4{
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
/* O que acontece é que o método atualiza() da classe Conta é chamado, e não o das classes filhas.
Para que o método atualiza() das classes filhas seja chamado, é necessário que o método atualiza()
da classe Conta seja abstrato(ou seja não possui uma implementação definida), 
e que as classes filhas implementem o método atualiza() de acordo com suas necessidades. */
