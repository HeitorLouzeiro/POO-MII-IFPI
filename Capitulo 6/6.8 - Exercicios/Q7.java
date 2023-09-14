/* 7) (opcional) Na classe Empresa, em vez de criar um array de tamanho fixo, receba como parâmetro no cons-
trutor o tamanho do array de Funcionario.
Agora, com esse construtor, o que acontece se tentarmos dar new Empresa() sem passar argumento algum? 
Por quê? */

class space{
    static String space = "-".repeat(50);
}

class Funcionario{
    private String nome;
    private double salario;

    private int identificador;

    private static int identificadorFuncionario;

    public Funcionario() {
        // construtor sem argumentos

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
class space{
    static String space = "-".repeat(50);
}
class Funcionario{
    private String nome;
    private double salario;

    private int identificador;

    private static int identificadorFuncionario;

    public Funcionario() {
        // construtor sem argumentos

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

class Empresa{
    Funcionario[] funcionarios;

    Funcionario getFuncionario(int posicao) { 
        return this.funcionarios[posicao];
    }

    void adiciona(Funcionario funcionarios){
        for(int i = 0; i < this.funcionarios.length; i++){
            if(this.funcionarios[i] == null){
                this.funcionarios[i] = funcionarios;
                System.out.println("Funcionario adicionado com sucesso!");
                System.out.println("Posicao: " + i);
                System.out.println(space.space);
                break;
            }
        }
    }

    void mostraEmpregados(){
        System.out.println("Lista de Funcionarios");
        for(int i = 0; i < this.funcionarios.length; i++){
            if(this.funcionarios[i] != null){

                System.out.println("Funcionario na posicao: " + i);
                System.out.println("R$" + this.funcionarios[i].getNome());
                System.out.println("R$" + this.funcionarios[i].getSalario());
                System.out.println(space.space);
            }
        }
    }



}

public class Q7 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        Empresa empresa = new Empresa();
        empresa.funcionarios = new Funcionario[10];

        funcionario.setNome("Joao");
        funcionario.setSalario(1000);
        empresa.adiciona(funcionario);


        funcionario.setNome("Maria");
        funcionario.setSalario(1700);

        empresa.adiciona(funcionario);
        
        empresa.mostraEmpregados();

        
    }
}
