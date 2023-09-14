/* 3) Modifique suas classes que acessam e modificam atributos de um Funcionario para utilizar os getters e 
setters.
Por exemplo:
f.salario = 100;
System.out.println(f.salario);
passa para:
f.setSalario(100);
System.out.println(f.getSalario()); */

class Funcionario{
    private double salario;

    /* Metodos get serve para retorna seu valor */
    double getSalario() { 
        return this.salario;
    }
    /* Metodos set serve para definir ou alterar seu valor */
    void setSalario(double salario) { 
        this.salario = salario;
    }


}

public class Q3 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(1000.0);
        System.out.println(funcionario.getSalario());        
    }
}
