/* 8) (opcional) O que acontece se você tentar acessar um atributo diretamente na classe? 
Como, por exemplo:
Conta.saldo = 1234;
Esse código faz sentido? E este:
Conta.saca(50);
Faz sentido pedir para o esquema do conta sacar uma quantia? */

 class Cliente{
    String nome;
    String sobrenome;
    String cpf;
    double saldo;
    double limite;

}
class Conta{
    int numero; 
    double saldo; 
    double limite;
    Cliente titular = new Cliente();

    void saca(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }
}

public class Q8 {
    public static void main(String[] args) {      
        Conta minhaConta = new Conta();

        Conta.saldo = 1234; // Essa Conta.saldo nao existe, pois saldo e um atributo nao uma classe.
        Conta.saca(50); // Essa Conta.saca nao existe, pois saca e um metodo nao uma classe.

        // Faz sentido pedir para o esquema da conta sacar uma quantia? 
        /* Sim, pois o metodo saca esta dentro da classe Conta, e o metodo saca e responsável 
        por sacar uma quantia. */
    }
}