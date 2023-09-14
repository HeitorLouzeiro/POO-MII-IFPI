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

class Empresa {
    String nome;
    String cnpj;
    Funcionario[] funcionarios;


    /* Question 2 */
    int indice = 0;
    void adiciona(Funcionario funcionario) {
        this.funcionarios[this.indice] = funcionario;
        System.out.println("Funcionario adicionado com sucesso!");
        System.out.println("Posicao: " + this.indice);
        this.indice++;
        System.out.println(space.space);

    }
    /* Question 4 */
    void mostraEmpregados(){
        for(int i = 0; i < this.indice; i++){
            if (this.funcionarios != null){
                System.out.println("Funcionario na posicao: " + i);
                System.out.println("Salário: " + this.funcionarios[i].salario);

                System.out.println(space.space);
            }
            
        }
    }

}

public class Q6 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        new Empresa();

        funcionario.setSalario(1000);
        System.out.println(funcionario.getSalario());
        /* salario has private access in Funcionario 
         * O atributo salario é privado, ou seja, só pode ser acessado dentro da classe Funcionario.
        */

    }
}
