/* Crie duas referências para o mesmo funcionário, compare-os com o ==. 
Tire suas conclusões. Para criar duas referências pro mesmo funcionário: */

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

public class Q5 {
    public static void main(String[] args) {      
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Fiodor";
        funcionario.salario = 100;

        Funcionario funcionario2 = funcionario;

        if (funcionario == funcionario2) {
            System.out.println("iguais");
        } else{
            System.out.println("diferentes");
        }

        /* Os objetos foram criados no mesmo endereço de memória, por isso são iguais. */

    
    }
}
