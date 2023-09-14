/* 4) Faça com que sua classe Funcionario possa receber, opcionalmente,
o nome do Funcionario durante a criação do objeto. 
Utilize construtores para obter esse resultado.
Dica: utilize um construtor sem argumentos também,
para o caso de a pessoa não querer passar o nome do 
Funcionario.

Seria algo mais ou menos assim:
class Funcionario {
    Funcionario() {
    // construtor sem argumentos
    }
    Funcionario(String nome) {
    // construtor que recebe o nome
    }
}
Por que você precisa do construtor sem argumentos para que a passagem do nome seja opcional?
Porque se você não tiver o construtor sem argumentos, 
você não poderá criar um Funcionario sem passar o nome.

*/
/* Esse execicio não irá funcionar */

class Funcionario{
    private String nome;
    private String departamento;
    private double salario;
    private String rg;
    private boolean estaNaEmpresa;

    public Funcionario() {
        // construtor sem argumentos

    }
     public Funcionario(String nome) {
        // construtor que recebe o nome
        this.nome = nome;
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

    public String getDepartamento(){
        return this.departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getRg(){
        return this.rg;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public boolean getEstaNaEmpresa(){
        return this.estaNaEmpresa;
    }

    public void setEstaNaEmpresa(boolean estaNaEmpresa){
        this.estaNaEmpresa = estaNaEmpresa;
    }
}

public class Q4 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(1000);
        System.out.println(funcionario.getSalario());
        
        funcionario.setNome("João");
        System.out.println(funcionario.getNome());
        
        funcionario.setDepartamento("TI");
        System.out.println(funcionario.getDepartamento());

        funcionario.setRg("123456789");
        System.out.println(funcionario.getRg());

        funcionario.setEstaNaEmpresa(true);
        System.out.println(funcionario.getEstaNaEmpresa());

        
    }
}

