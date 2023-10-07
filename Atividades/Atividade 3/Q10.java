/* 
10. Crie uma classe Banco que possui um array de Conta. Repare que num array 
de Conta você pode colocar tanto ContaCorrente quanto ContaPoupanca. Crie 
um método void adiciona(Conta c), um método Conta pegaConta(int x) e outro 
int pegaTotalDeContas(), muito similar a relação anterior de Empresa-
Funcionario. Faça com que seu método main crie diversas contas, insira-as no 
Banco e depois, com um for, percorra todas as contas do Banco para passá-las 
como argumento para o AtualizadorDeContas.
*/
/*
Se aparecer o erro abaixo, é porque você está usando uma versão antiga do Java.
Exception in thread "main" java.lang.UnsupportedClassVersionError: 
Q10 has been compiled by a more recent version of the Java Runtime (class file version 64.0),
this version of the Java Runtime only recognizes class file versions up to 52.0
        at java.lang.ClassLoader.defineClass1(Native Method)
        at java.lang.ClassLoader.defineClass(Unknown Source)
        at java.security.SecureClassLoader.defineClass(Unknown Source)
        at java.net.URLClassLoader.defineClass(Unknown Source)
        at java.net.URLClassLoader.access$100(Unknown Source)
        at java.net.URLClassLoader$1.run(Unknown Source)
        at java.net.URLClassLoader$1.run(Unknown Source)
        at java.security.AccessController.doPrivileged(Native Method)
        at java.net.URLClassLoader.findClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        at sun.launcher.LauncherHelper.checkAndLoadMain(Unknown Source)

Para resolver, atualize o Java para a versão mais recente.
ou
use o comando no terminal: javac -source 1.8 -target 1.8 Q10.java
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

    void atualiza(double taxa) {
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

public class Q10 {
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

