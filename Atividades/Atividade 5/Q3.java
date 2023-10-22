/* 
3) Ao lançar a IllegalArgumentException, passe via construtor uma mensagem a ser exibida. Lembre que 
a String recebida como parâmetro é acessível depois via o método getMessage() herdado por todas as 
Exceptions.
void deposita(double valor){
    if (valor < 0){
        throw new IllegalArgumentException("Você tentou depositar um valor negativo");
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
        if (valor < 0){
            throw new IllegalArgumentException("Você tentou depositar um valor negativo");
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

public class Q3 {
    public static void main(String[] args) {
        Conta cc = new ContaPoupanca(1000);
        try {
            cc.depositar(-100);
        } catch( IllegalArgumentException e) {
            System.out.println("Voce tentou depositar um valor invalido");
        }
    }
}
