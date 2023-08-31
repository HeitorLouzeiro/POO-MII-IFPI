/* 4) Construa dois funcionários com onewe compare-os com o==. E se eles tiverem os mesmos atributos? 
Para isso você vai precisar criar outra referência: */

class Funcionario{
    String nome;
    String departamento;
    double salario;
    String dataEntrada;
    String rg;
    boolean estaNaEmpresa;

    void bonifica(double aumento){
        this.salario += aumento;
    }
    void demite(){
        this.estaNaEmpresa = false;
    }
    void mostra(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: " + this.salario);
        System.out.println("Data de entrada: " + this.dataEntrada);
        System.out.println("RG: " + this.rg);
        System.out.println("Está na empresa: " + this.estaNaEmpresa);

        String space = "*".repeat(50);
        System.out.println(space);
    }
    
}

public class Q4 {
    public static void main(String[] args) {      
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Fiodor";
        funcionario.salario = 100;

        Funcionario f2 = new Funcionario(); 
        f2.nome = "Fiodor";
        f2.salario = 100;

        if (funcionario == f2) {
        System.out.println("iguais");
        } else{
        System.out.println("diferentes");
        }

        /* Os objetos foram criados em endereços de memória diferentes, por isso são diferentes. */

    
    }
}
