/* 1) Adicione o modificador de visibilidade (private, se necessário) para cada atributo e método da classe 
Funcionario. Tente criar um Funcionario no main e modificar ou ler um de seus atributos privados. O 
que acontece? */

class Funcionario{
    private String nome;
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String rg;
    private boolean estaNaEmpresa;

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

public class Q1 {
    public static void main(String[] args) {   
    /*         	
        Dará erro de compilação:
        Dizendo que os atributos são privados e não podem ser acessados
        The field Funcionario.nome is not visible
        The field Funcionario.departamento is not visible
        The field Funcionario.salario is not visible
        The field Funcionario.dataEntrada is not visible
        The field Funcionario.rg is not visible
    */   
    Funcionario funcincionario = new Funcionario();
    funcincionario.nome = "João";
    funcincionario.departamento = "TI";
    funcincionario.salario = 18000;
    funcincionario.dataEntrada = "01/01/2000";
    funcincionario.rg = "123456789";
    funcincionario.estaNaEmpresa = true;    funcincionario.mostra();
    
    }
}
