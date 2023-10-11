/* 4. Nosso banco precisa tributar dinheiro de alguns bens que nossos clientes possuem.
Para isso, vamos criar uma interface:
interface Tributavel {
    double calculaTributos();
}
Lemos essa interface da seguinte maneira: “todos que quiserem ser tributável precisam saber calcular tribu-
tos, devolvendo um double”.
*/

interface Tributavel {
    double calculaTributos();
}

class ContaCorrente implements Tributavel {
    // atributos e métodos aqui
    private double saldo;
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void deposita(double valor) {
        this.saldo += valor;
    }
}

class SeguroDeVida implements Tributavel {
    // atributos e métodos aqui
    public double calculaTributos() {
        return 42;
    }
}

class Q4 {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        Tributavel t = cc;
        System.out.println(t.calculaTributos());

        System.out.println(t.getSaldo());
        
    }
}