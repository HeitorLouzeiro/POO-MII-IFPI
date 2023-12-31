/* 5) (opcional) Adicione um atributo na classe Funcionario de tipo int que se chama identificador. Esse identifi-
cador deve ter um valor único para cada instância do tipo Funcionario. O primeiro Funcionario instanciado 
tem identificador 1, o segundo 2, e assim por diante. Você deve utilizar os recursos aprendidos aqui para 
resolver esse problema.
Crie um getter para o identificador. Devemos ter um setter? */

class Funcionario{
    private String nome;
    private String departamento;
    private double salario;
    private String rg;
    private boolean estaNaEmpresa;

    private int identificador;

    private static int identificadorFuncionario;
    
    public Funcionario() {
        // construtor sem argumentos
        identificador = identificadorFuncionario++;
        
    }
    public Funcionario(String nome){
        this.nome = nome;
        this.identificador = identificadorFuncionario++;
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

    public int getIdentificador(){
        return this.identificador;
    }
}

public class Q5 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Heitor");
        System.out.println(funcionario.getNome());

        funcionario.setSalario(1000);
        System.out.println(funcionario.getSalario());
        System.out.println("Identificador: " + funcionario.getIdentificador());

        String space = "-".repeat(50);
        System.out.println(space); 

        Funcionario funcionario1 = new Funcionario("Carlos");
        System.out.println(funcionario1.getNome());

        funcionario1.setSalario(1000);
        System.out.println(funcionario1.getSalario());
        
        System.out.println("Identificador: " + funcionario1.getIdentificador());


        
    }
}
