class Funcionario{
    private double salario;

    private static int totalFuncionarios;

    public Funcionario() {
        Funcionario.totalFuncionarios = Funcionario.totalFuncionarios + 1;

    }

    /* Metodos get serve para retorna seu valor */
    public double getSalario() { 
        return this.salario;
    }
    /* Metodos set serve para definir ou alterar seu valor */
    public void setSalario(double salario) { 
        this.salario = salario;
    }

    public int getTotalFuncionarios(){
        return Funcionario.totalFuncionarios;
    }

}

public class Aula1309 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setSalario(1000);
        System.out.println(funcionario.getSalario());
        System.out.println(funcionario.getTotalFuncionarios());

        Funcionario funcionario2 = new Funcionario();

        funcionario2.setSalario(2000);
        System.out.println(funcionario2.getSalario());
        System.out.println(funcionario2.getTotalFuncionarios());      
        
    }
}
