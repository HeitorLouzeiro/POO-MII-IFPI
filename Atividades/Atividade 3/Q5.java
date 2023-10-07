/* 5) O que você acha de rodar o código anterior da seguinte maneira:
Conta c = new Conta();
Conta cc = new ContaCorrente();
Conta cp = new ContaPoupanca();
Compila? Roda? O que muda? Qual é a utilidade disso? Realmente, essa não é a maneira mais útil do 
polimorfismo - veremos o seu real poder no próximo exercício. 
Porém existe uma utilidade de declararmos uma variável
de um tipo menos específico do que o objeto realmente é.
É extremamente importante perceber que não importa como nos referimos a um objeto, o método que 
será invocado é sempre o mesmo! A JVM vai descobrir em tempo de execução qual deve ser invocado, 
dependendo de que tipo é aquele objeto e não de acordo com como nos referimos a ele.
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
    void atualiza(double taxa){
        this.saldo += this.saldo * taxa;
    }
}

class ContaCorrente extends Conta{
    void atualiza(double taxa){
        this.saldo += this.saldo * taxa * 2;
    }
    void depositar(double valor){
        this.saldo += valor - 0.1;
    }
}

class ContaPoupanca extends Conta{
    void atualiza(double taxa){
        this.saldo += this.saldo * taxa * 3;
    }
}

public class Q5{
    public static void main(String[] args) {
        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
    }
}