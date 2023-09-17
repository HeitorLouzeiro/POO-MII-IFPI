class Funcionario{
    private double salario;
    private String nome;
    private static int totalFuncionarios;

    public Funcionario() {
        totalFuncionarios++; 

    }

    public Funcionario(String nome) {
        this.nome = nome;
        totalFuncionarios++; 
    }

    /* Metodos get serve para retorna seu valor */
    public double getSalario() { 
        return this.salario;
    }
    
    public String getNome(){
        return this.nome;
    }

    
    /* Metodos set serve para definir ou alterar seu valor */
    public void setSalario(double salario) { 
        this.salario = salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getTotalFuncionarios(){
        return totalFuncionarios;
    }

}

public class Aula1309 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        System.out.println(funcionario.getNome());
        funcionario.setSalario(1000);
        System.out.println(funcionario.getSalario());

        Funcionario funcionario2 = new Funcionario("Heitor");

        System.out.println(funcionario2.getNome());
        funcionario2.setSalario(2000);
        System.out.println(funcionario2.getSalario());
        
        System.out.println("Total Funcionarios: "+ funcionario2.getTotalFuncionarios());

    }
}
