/* 
1) Volte ao nosso sistema de Funcionario e crie uma classe Empresa. 
A Empresa tem um nome, cnpj e uma array de Funcionario, 
além de outros atributos que você julgar necessário.
class Empresa {
// outros atributos
Funcionario[] funcionarios;
String cnpj;
} */
/* 
2) A empresa deve ter um método adiciona, que recebe uma referência a Funcionario como argumento, e 
guarda esse funcionário. Algo como:
...
    void adiciona(Funcionario f) {
    // algo tipo: this.funcionarios[ ??? ] = f
    // mas que posição colocar?
    } 
... 
*/
/*
3) Crie uma outra classe que possuirá o seu método main. Dentro dele crie algumas instâncias de Funcionario 
e passe para a empresa pelo método adiciona. Repare que antes você vai precisar criar a array, pois 
inicialmente o atributo funcionarios da classe Empresa não referencia lugar nenhum (null):
...
    Empresa empresa = new Empresa();
    empresa.funcionarios = new Funcionario[10];
...
*/
/*
4) Percorra o atributo funcionarios da sua instância da Empresa e imprima o salários de todos seus funcionários. 
Ou você pode chamar o método mostra() de cada Funcionario da sua array.
Use também o for novo do java 5.0.
Cuidado: alguns índices do seu array podem não conter referência para um Funcionario construído, isto é, 
ainda se referirem para null.

*/
/* 
5) (Opcional) Crie um método para verificar se um determinado Funcionario se encontra ou não como 
funcionário desta empresa:
boolean contem(Funcionario f) {
... //
}
Você vai precisar fazer um for na sua array e verificar se a referência passada como argumento se encontra 
dentro da array. Evite ao máximo usar números hard-coded, isto é, use o .length 
*/

// class apenas para criar um espaço entre os prints.
class space{
    static String space = "*".repeat(50);
}

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
    void mostra(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: " + this.salario);
        System.out.println("RG: " + this.rg);
        System.out.println("Está na empresa: " + this.estaNaEmpresa);
        System.out.println("Data de entrada: " + this.dataDeEntrada.dia + "/" + this.dataDeEntrada.mes + "/" + this.dataDeEntrada.ano);

        System.out.println(space.space);
        
    }
    
}
class Data{
    int dia;
    int mes;
    int ano;
}

/* Question 1 */
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

    /* Question 5 */
    boolean contem(Funcionario funcionario){
        for(int i = 0; i < this.indice; i++){
            if (this.funcionarios[i].estaNaEmpresa == true){
                System.out.println("Funcionario Trabalhando!");
                System.out.println("Posicao: " + i);
                System.out.println(space.space);
                return true;
            }
        }
        System.out.println("Funcionario não esta trabalhando!");
        System.out.println(space.space);
        return false;
    }

}

public class Q1 {
    public static void main(String[] args) {

        /* Question 3 */
        Empresa empresa = new Empresa();
        empresa.funcionarios = new Funcionario[10];

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "João";
        funcionario.departamento = "TI";
        funcionario.salario = 1000;
        funcionario.rg = "123456789";
        funcionario.estaNaEmpresa = true;
        funcionario.dataDeEntrada = new Data();
        funcionario.dataDeEntrada.dia = 10;
        funcionario.dataDeEntrada.mes = 10;
        funcionario.dataDeEntrada.ano = 2020;

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Maria";
        funcionario2.departamento = "TI";
        funcionario2.salario = 1000;
        funcionario2.rg = "123456789";
        funcionario2.estaNaEmpresa = false;
        funcionario2.dataDeEntrada = new Data();
        funcionario2.dataDeEntrada.dia = 10;
        funcionario2.dataDeEntrada.mes = 10;
        funcionario2.dataDeEntrada.ano = 2020;


        empresa.adiciona(funcionario);
        empresa.adiciona(funcionario2);
        empresa.mostraEmpregados();
        empresa.contem(funcionario);

        
    }
}
