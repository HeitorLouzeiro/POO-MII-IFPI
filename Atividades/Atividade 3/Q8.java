/*8. Use a palavra-chave super nos métodos atualiza reescritos, para não ter de 
refazer o trabalho.  */
/*
Se aparecer o erro abaixo, é porque você está usando uma versão antiga do Java.
Exception in thread "main" java.lang.UnsupportedClassVersionError: 
Q8 has been compiled by a more recent version of the Java Runtime (class file version 64.0), 
this version of the Java Runtime only recognizes class file versions up to 52.0.
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
use o comando no terminal: javac -source 1.8 -target 1.8 Q8.java
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

public class Q8 {
    public static void main(String[] args) {
        Conta c = new Conta(1000);
        Conta cc = new ContaCorrente(1000);
        Conta cp = new ContaPoupanca(1000);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);
        System.out.println("Saldo Total: " + adc.getSaldoTotal());
    }
}

