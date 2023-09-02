/* 5) (opcional) Modifque seu método mostra para que ele imprima o valor da dataDeEntrada daquele 
Funcionario: */

class Funcionario{
    String nome;
    String departamento;
    double salario;
    String rg;
    boolean estaNaEmpresa;

    Data dataDeEntrada;

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
        System.out.println("RG: " + this.rg);
        System.out.println("Está na empresa: " + this.estaNaEmpresa);
        System.out.println("Data de entrada: " + this.dataDeEntrada.dia + "/" + this.dataDeEntrada.mes + "/" + this.dataDeEntrada.ano);

        String space = "*".repeat(50);
        System.out.println(space);
    }
    
}
class Data{
    int dia;
    int mes;
    int ano;
}

public class Q5 {
    public static void main(String[] args) {      
        // Classe Funcionario
        Funcionario funcincionario = new Funcionario();

        // Classe Data
        Data dataDeEntrada = new Data();
        //  Dados do funcionário
        funcincionario.nome = "João";
        funcincionario.departamento = "TI";
        funcincionario.salario = 18000;
        funcincionario.rg = "123456789";
        funcincionario.estaNaEmpresa = true;

        // dados da data de entrada
        funcincionario.dataDeEntrada = dataDeEntrada;
        funcincionario.dataDeEntrada.dia = 01;
        funcincionario.dataDeEntrada.mes = 01;
        funcincionario.dataDeEntrada.ano = 2000;

        // Mostra os dados do funcionário
        funcincionario.mostra();

        // Bonifica o funcionário
        funcincionario.bonifica(100);
        funcincionario.mostra();
        
        // Demite o funcionário
        funcincionario.demite();
        funcincionario.mostra();
    }
}
