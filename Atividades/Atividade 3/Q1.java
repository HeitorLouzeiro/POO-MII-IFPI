/* 1. Vamos criar uma classe Conta, que possua um saldo, e os métodos para pegar
saldo, depositar e sacar. */
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
}

public class Q1{
    public static void main(String[] args) {
    }
}