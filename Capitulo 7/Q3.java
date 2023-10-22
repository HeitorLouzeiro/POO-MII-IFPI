/* 3) Crie duas subclasses da classe Conta: ContaCorrente e ContaPoupanca. Ambas terão o método atualiza 
reescrito: A ContaCorrente deve atualizar-se com o dobro da taxa e a ContaPoupanca deve atualizar-se com 
o triplo da taxa.
Além disso, a ContaCorrente deve reescrever o método deposita, afim de retirar uma taxa bancária de dez 
centavos de cada depósito.
• Crie as classes ContaCorrente e ContaPoupanca. Ambas são filhas da classe Conta:
class ContaCorrente extends Conta {
}
class ContaPoupanca extends Conta { 
}
• Reescreva o método atualiza na classe ContaCorrente, seguindo o enunciado:
class ContaCorrente extends Conta {
    void atualiza(double taxa) {
    this.saldo += this.saldo * taxa * 2;
}
}
Repare que, para acessar o atributo saldo herdado da classe Conta, você vai precisar trocar o modifi-
cador de visibilidade de saldo para protected.
• Reescreva o método atualiza na classe ContaPoupanca, seguindo o enunciado:
class ContaPoupanca extends Conta {
    void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }
}
• Na classe ContaCorrente, reescreva o método deposita para descontar a taxa bancária de dez
centavos:
class ContaCorrente extends Conta {
    void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }
    void deposita(double valor) { 
        this.saldo += valor - 0.10;
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

    void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
    }
}

class ContaCorrente extends Conta{
    void atualiza(double taxa){
        this.saldo += this.saldo * taxa * 2;
    }
    void deposita(double valor) { 
        this.saldo += valor - 0.10;
    }
}

class ContaPoupanca extends Conta{
    void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }
}