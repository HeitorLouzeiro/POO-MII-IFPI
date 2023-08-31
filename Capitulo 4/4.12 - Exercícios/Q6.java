/* 6) (opcional) Em vez de utilizar umaStringpara representar a data, crie uma outra classe, chamadaData. 
Ela possui 3 campos int, para dia, mês e ano. Faça com que seu funcionário passe a usá-la. 
(é parecido com o último exemplo, em que aContapassou a ter referência para um Cliente). */

class Funcionario{
    String nome;
    String departamento;
    double salario;
    String rg;
    boolean estaNaEmpresa;

    Data dataDeEntrada;

    void bonifica(double aumento){
        this.salario += aumento;
    }
    void demite(){
        this.estaNaEmpresa = false;
    }
  
}

class Data{
    int dia;
    int mes;
    int ano;
}

public class Q6 {
    public static void main(String[] args) {      
        Funcionario funcionario = new Funcionario();
        Data dataDeEntrada = new Data();

        funcionario.dataDeEntrada = dataDeEntrada;

        funcionario.dataDeEntrada.dia = 10;
        funcionario.dataDeEntrada.mes = 10;
        funcionario.dataDeEntrada.ano = 2020;

        System.out.println(funcionario.dataDeEntrada.dia + "/" + funcionario.dataDeEntrada.mes + "/" + funcionario.dataDeEntrada.ano);

    }
}
