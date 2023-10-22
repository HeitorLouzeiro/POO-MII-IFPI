/* 1) Vamos criar uma classe Conta, que possua um saldo, e os métodos para pegar saldo, depositar, e sacar. 
a) Crie a classe Conta
class Conta {
}
b) Adicione o atributo saldo
class Conta {
    private double saldo;
}
c) Crie os métodos getSaldo(), deposita(double) e saca(double)
class Conta {
    private double saldo;
    void deposita(double valor) {
    this.saldo += valor;
}
void saca(double valor) { 
    this.saldo -= valor;
}
double getSaldo() { 
    return this.saldo;
}
} */

class Conta {
    private double saldo;
    void deposita(double valor) {
        this.saldo += valor;
    }
    void saca(double valor) { 
        this.saldo -= valor;
    }
    double getSaldo() { 
        return this.saldo;
    }
}