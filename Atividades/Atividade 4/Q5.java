/* 5. Crie um GerenciadorDeImpostoDeRenda, que recebe todos os tributáveis de 
uma pessoa e soma seus valores, e inclua nele um método para devolver seu 
total:  */

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

class GerenciadorDeImpostoDeRenda {
    private double total;
    void adiciona(Tributavel t) {
        System.out.println("Adicionando tributavel: " + t);
        this.total = this.total + t.calculaTributos();
    }
    public double getTotal() { 
        return total;
    }
}

class Q5 {
    public static void main(String[] args) {
        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
        SeguroDeVida sv = new SeguroDeVida(); 
        gerenciador.adiciona(sv);
        ContaCorrente cc = new ContaCorrente(); 
        cc.deposita(1000);
        gerenciador.adiciona(cc);
        System.out.println(gerenciador.getTotal());
        
    }
}