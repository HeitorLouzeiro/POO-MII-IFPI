/* 2) Crie os getters e setters necessários da sua classe Funcionario . Por exemplo:
class Funcionario {
private double salario;
double getSalario() { 
return this.salario;
}
void setSalario(double salario) { 
this.salario = salario;
}
} */
class Funcionario{
    private String nome;
    private String departamento;
    private double salario;
    private String rg;
    private boolean estaNaEmpresa;

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

public class Q2 {
    public static void main(String[] args) {

    }
}
