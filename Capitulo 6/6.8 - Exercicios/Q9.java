/* 9) (opcional) Crie a classe PessoaFisica. 
Queremos ter a garantia de que pessoa física alguma tenha CPF invalido,
nem seja criada PessoaFisica sem cpf inicial. 
(você não precisa escrever o algoritmo de validação de cpf, 
basta passar o cpf por um método valida(String x)....) */

class PessoaFisica{
    private String cpf;

    public PessoaFisica(String cpf){
        if(validaCpf(cpf)){
            this.cpf = cpf;

            System.out.println("CPF valido: " + this.cpf);
        }else{
            System.out.println("CPF invalido!");
        }
    }

    public boolean validaCpf(String cpf){
        if(cpf.length() != 11){
            return false;
        }else{
            return true;
        }
    }
}
public class Q9{
    public static void main(String[] args) {
        new PessoaFisica("12345678910");
       

    }
}