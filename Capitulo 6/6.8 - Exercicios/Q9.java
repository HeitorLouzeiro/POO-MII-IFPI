/* 9) (opcional) Crie a classe PessoaFisica. 
Queremos ter a garantia de que pessoa física alguma tenha CPF invalido,
nem seja criada PessoaFisica sem cpf inicial. 
(você não precisa escrever o algoritmo de validação de cpf, 
basta passar o cpf por um método valida(String x)....) */

class Funcionario{
    private String nome;
    private double salario;
    private String cpf;

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
    }

    public String getCpf(){
        return this.cpf;
    }

    public boolean validaCpf(String cpf){
        if(cpf.length() == 11){
            System.out.println("CPF valido");
            return true;
        }else{
            return false;
        }
    }

    public void setCpf(String cpf){
        if(validaCpf(cpf)){
            this.cpf = cpf;
        }else{
            System.out.println("CPF invalido");
        }
    }
}

public class Q9{
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        System.out.println(funcionario.validaCpf("12345678910"));

    }
}