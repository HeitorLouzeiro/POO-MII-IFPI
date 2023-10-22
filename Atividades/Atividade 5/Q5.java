/* 5) Crie sua própria Exception, ValorInvalidoException. Para isso, você precisa criar uma classe com esse 
nome que extenda de RuntimeException.
class ValorInvalidoException extends RuntimeException {
}
Lance-a em vez de IllegalArgumentException.
Atenção: nem sempre é interessante criarmos um novo tipo de exception! Depende do caso. Neste aqui, 
seria melhor ainda utilizarmos IllegalArgumentException. */

class ValorInvalidoException extends RuntimeException {
    public ValorInvalidoException(String message) {
        super(message);
    }
}

class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0){
            throw new ValorInvalidoException("Voce tentou depositar um valor invalido");
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

public class Q5 {
    public static void main(String[] args) {
        Conta cc = new ContaPoupanca(1000);
        try {
            cc.depositar(-100);
            System.out.println("Deposito realizado com sucesso!"+ "\n" + "Saldo atual: " + cc.getSaldo());
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
