/* 6. Transforme a classe Conta em uma interface. Atenção: faça isso num projeto a 
parte pois usaremos a Conta como classe em exercícios futuros.   */
public interface Conta {
    double getSaldo();
    void depositar(double valor);
    void sacar(double valor);
    void atualiza(double taxa);
}

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


public class Q2 {
    public static void main(String[] args) {
        // criando o banco
        System.out.println("Criando o banco...");
        Banco banco = new Banco();

        // criando as contas
        System.out.println("Criando as contas...");
        ContaCorrente cc = new ContaCorrente(1000);
        ContaPoupanca cp = new ContaPoupanca(1000);
        
        // Adicionando as contas no banco
        System.out.println("Adicionando as contas no banco...");
        banco.adiciona(cc);
        banco.adiciona(cp);

        // fazendo a atualização de todas as contas do banco
        System.out.println("Fazendo a atualização de todas as contas do banco...");
        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        // FOR para percorrer todas as contas do banco
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < banco.pegaTotalDeContas(); i++) {
            System.out.println("Saldo da conta " + i);
            adc.roda(banco.pegaConta(i));
            
            System.out.println("---------------------------------------------------");
        }
        
        System.out.println("Total de contas do banco: " + banco.pegaTotalDeContas());

        // imprimindo saldo total do banco
        System.out.println("Saldo Total do banco: " + adc.getSaldoTotal());


    }
}