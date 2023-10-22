/* 
4) Agora, altere sua classe TestaDeposita para exibir a mensagem da exceção através da chamada do 
getMessage(): */
class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        if (valor < 0){
            throw new IllegalArgumentException("Voce tentou depositar um valor negativo");
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

public class Q4 {
    public static void main(String[] args) {
        Conta cc = new ContaPoupanca(1000);
        try {
            cc.depositar(-100);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
