/* Modele um funcionário. 
Ele deve ter o nome do funcionário, o departamento onde trabalha, 
seu salário (double), a data de entrada no banco (String), seu RG (String) 
e um valor booleano que indique se o funcionário está na empresa no momento ou se já foi embora.
Você deve criar alguns métodos de acordo com sua necessidade. Além deles, crie um métodobonificaque 
aumenta osalariodo funcionário de acordo com o parâmetro passado como argumento. Crie, também, um 
métododemite, que não recebe parâmetro algum, só modifca o valor booleano indicando que o funcionário 
não trabalha mais aqui.
A idéia aqui é apenas modelar, isto é, só identifque que informações são importantes e o que um funcionário 
faz. Desenhe no papel tudo o que umFuncionariotem e tudo que ele faz. */

// Q1
/* funcionário
nome: String
departamento: String
salario: double
dataEntrada: String
rg: String
estaNaEmpresa: boolean

metodos:
bonifica (double aumento)
demite () */
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
}
public class Q2 {
    public static void main(String[] args) {
        Funcionario funcincionario = new Funcionario();
        funcincionario.nome = "João";
        funcincionario.departamento = "TI";
        funcincionario.salario = 1000;
        funcincionario.dataEntrada = "01/01/2000";
        funcincionario.rg = "123456789";
        funcincionario.estaNaEmpresa = true;

        System.out.println("Nome: " + funcincionario.nome);
        System.out.println("Departamento: " + funcincionario.departamento);
        System.out.println("Salário: " + funcincionario.salario);
        System.out.println("Data de entrada: " + funcincionario.dataEntrada);
        System.out.println("RG: " + funcincionario.rg);
        System.out.println("Está na empresa: " + funcincionario.estaNaEmpresa);

        funcincionario.bonifica(100);
        System.out.println("Salário: " + funcincionario.salario);

        funcincionario.demite();
        System.out.println("Está na empresa: " + funcincionario.estaNaEmpresa);

    }
}