/* 1) Na classe Conta, modifique o método deposita(double x): Ele deve lançar uma exception chamada 
IllegalArgumentException, que já faz parte da biblioteca do java, sempre que o valor passado como 
argumento for inválido (por exemplo, quando for negativo).
void deposita(double valor){
if (valor < 0) {
    throw new IllegalArgumentException(); 
    } else {
    this.saldo += valor * 0.9962;
    }
}

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
        if (valor < 0) {
            throw new IllegalArgumentException();
        } else {
            this.saldo += valor * 0.9962;
        }
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
    }
}

class ContaCorrente extends Conta {
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public void depositar(double valor) {
        super.depositar(valor - 0.1);
    }

    void atualiza(double taxa) {
        super.atualiza(taxa * 2);
    }
}

class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    void atualiza(double taxa) {
        super.atualiza(taxa * 3);
    }
}

public class Q1 {
    
}
