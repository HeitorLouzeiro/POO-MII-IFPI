/* 6) (opcional) Crie os getters e setters da sua classe Empresa 
e coloque seus atributos como private. 
Lembre-se de que não necessariamente todos os atributos devem ter getters e setters.
Por exemplo, na classe Empresa, seria interessante ter um setter e getter para a sua array de funcionários? 
Não seria mais interessante ter um método como este?
    class Empresa {
        ... //
        Funcionario getFuncionario(int posicao) { 
        return this.funcionarios[posicao];
        }
    } 
*/
class Funcionario{
    private String nome;
    private double salario;

    private int identificador;

    private static int identificadorFuncionario;

    public Funcionario() {
        // construtor sem argumentos
        identificador = identificadorFuncionario++;

    }

    /* Metodos get serve para retorna seu valor */
    public double getSalario() { 
        return this.salario;
    }
    /* Metodos set serve para definir ou alterar seu valor */
    public void setSalario(double salario) { 
        this.salario = salario;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Funcionario(String nome){
        this.nome = nome;
        this.identificador = identificadorFuncionario++;
    }

    public int getIdentificador(){
        return this.identificador;
    }
}

class Empresa {
    Funcionario[] funcionarios;


    Funcionario getFuncionario(int posicao) { 
        return this.funcionarios[posicao];
    }

}

public class Q6 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("João");
        funcionario.setSalario(1000.0);

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario: " + funcionario.getSalario());
        System.out.println("Identificador: " + funcionario.getIdentificador());

        String space = "-".repeat(50);
        System.out.println(space); // separador

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Maria");
        funcionario2.setSalario(1700.0);

        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Salario: " + funcionario2.getSalario());
        System.out.println("Identificador: " + funcionario2.getIdentificador());

        

    }
}
