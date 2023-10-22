/* 3) Apenas pare efeito de entender melhor o abstract, remova (delete) o método atualiza() da ContaPoupanca, 
dessa forma ele herdará o método diretamente de Conta.
Transforme o método atualiza() da classe Conta em abstrato. Repare que, ao colocar a palavra chave 
abstract ao lado do método, o Eclipse rapidamente vai sugerir que você deve remover o corpo (body) do 
método com um quick fix: */
abstract class Conta {
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

    abstract void atualiza(double taxa);
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

class ContaCorrente extends Conta {
    public ContaCorrente(double saldo) {
        super(saldo);
    }
    public void depositar(double valor) {
        super.depositar(valor - 0.1);
    }

    void atualiza(double taxa) {
        double saldo = super.getSaldo();
        saldo += saldo * taxa * 2;
    }
}

class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldo) {
        super(saldo);
    }
    void atualiza(double taxa) {
         double saldo = super.getSaldo();
         saldo += saldo * taxa * 3;
    }
}

class Banco {
    /* Array de contas */
    private Conta[] contas;
    
    /* Variável para controlar o número de contas */
    private int indice = 0;

    // construtor, getters e outros métodos
    public Banco() {
        // criando o array de contas com 100 posições
        this.contas = new Conta[100];
    }

    // adiciona uma nova conta no array de contas do banco 
    public void adiciona(Conta c) {
        // c é uma referência à Conta que foi passada como argumento
        this.contas[this.indice] = c;
        this.indice++;
    }

    // pega uma conta do array de contas do banco
    public Conta pegaConta(int x) {
        // x é o índice da conta no array de contas do banco
        return this.contas[x];
    }

    // retorna o número de contas do banco
    public int pegaTotalDeContas() {
        return this.indice;
    }
}

public class Q3 {
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