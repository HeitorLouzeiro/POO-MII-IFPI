/* 
2) Crie uma classe TestaDeposita com o método main. Crie uma ContaPoupanca e tente depositar valores 
inválidos:
public static void main(String[] args) {
    Conta cc = new ContaPoupanca();
    cc.deposita(-100);
}
O que acontece? Uma IllegalArgumentException é lançada uma vez que tentamos depositar um valor 
inválido. Adicione o try/catch para tratar o erro:
    public static void main(String[] args) {
    Conta cc = new ContaPoupanca();
    try {
        cc.deposita(-100);
    } catch( IllegalArgumentException e) {
        System.out.println("Você tentou depositar um valor inválido");
    }
}
Atenção: se a sua classe ContaCorrente está reescrevendo o método deposita e não utiliza do 
super.deposita, ela não lançará a exception no caso do valor negativo! Você pode resolver isso utilizando o 
super, ou fazendo apenas o teste com ContaPoupanca.
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

public class Q2 {
    public static void main(String[] args) {
    /*         
        Conta cc = new ContaPoupanca(1000);
        cc.depositar(-100);
        
        Desse modo aparecerá a mensagem abaixo:
        Exception in thread "main" java.lang.IllegalArgumentException
        at Conta.depositar(Q2.java:35)
        at Q2.main(Q2.java:78)
    */
        Conta cc = new ContaPoupanca(1000);
        try {
            cc.depositar(-100);
        } catch( IllegalArgumentException e) {
            System.out.println("Voce tentou depositar um valor invalido");
        }
    }
}
