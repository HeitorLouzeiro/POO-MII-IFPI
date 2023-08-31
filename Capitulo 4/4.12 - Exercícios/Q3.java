/* Crie um método mostra(), que não recebe nem devolve parâmetro algum e simplesmente imprime todos 
os atributos do nosso funcionário. Dessa maneira, você não precisa fcar copiando e colando um monte 
de System.out.println() para cada mudança e teste que fzer com cada um de seus funcionários, você 
simplesmente vai fazer: */

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

public class Q3 {
    public static void main(String[] args) {      
        Funcionario funcincionario = new Funcionario();
        funcincionario.nome = "João";
        funcincionario.departamento = "TI";
        funcincionario.salario = 18000;
        funcincionario.dataEntrada = "01/01/2000";
        funcincionario.rg = "123456789";
        funcincionario.estaNaEmpresa = true;

        funcincionario.mostra();

        funcincionario.bonifica(100);
        funcincionario.mostra();

        funcincionario.demite();
        funcincionario.mostra();
    
    }
}
