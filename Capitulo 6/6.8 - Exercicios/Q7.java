/* 7) (opcional) Na classe Empresa, em vez de criar um array de tamanho fixo, receba como parâmetro no cons-
trutor o tamanho do array de Funcionario.
Agora, com esse construtor, o que acontece se tentarmos dar new Empresa() sem passar argumento algum? 
Por quê? */

class space {
    static String space = "-".repeat(50);
}

class Funcionario {
    private String nome;
    private double salario;
    private int identificador;
    private static int identificadorFuncionario;

    public Funcionario() {
        // construtor sem argumentos
    }

    /* Metodos get serve para retornar seu valor */
    public double getSalario() {
        return this.salario;
    }

    /* Metodos set serve para definir ou alterar seu valor */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome) {
        this.nome = nome;
        this.identificador = identificadorFuncionario++;
    }

    public int getIdentificador() {
        return this.identificador;
    }
}

class Empresa {
    Funcionario[] funcionarios;

    public Empresa(int numFuncionarios) {
        funcionarios = new Funcionario[numFuncionarios];
    }

    // Construtor sem argumentos para permitir a criação de uma instância sem argumentos
    public Empresa() {
        // Tamanho padrão do array de funcionários: 10
        funcionarios = new Funcionario[10];
    }

    public Funcionario getFuncionario(int posicao) {
        return this.funcionarios[posicao];
    }

    public void adicionarFuncionario(Funcionario funcionario, int posicao) {
        this.funcionarios[posicao] = funcionario;
    }
}

public class Q7 {
    public static void main(String[] args) {
        // Crie uma instância de Empresa sem passar argumentos
        Empresa empresaSemArgumentos = new Empresa();

        // Agora você pode adicionar funcionários à empresa, se necessário
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setSalario(1000.0);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setSalario(1700.0);

        empresaSemArgumentos.adicionarFuncionario(funcionario1, 0);
        empresaSemArgumentos.adicionarFuncionario(funcionario2, 1);

        // Acesse os funcionários da empresa sem argumentos
        Funcionario funcionarioDaEmpresa1 = empresaSemArgumentos.getFuncionario(0);
        Funcionario funcionarioDaEmpresa2 = empresaSemArgumentos.getFuncionario(1);

        // Exemplo de uso:
        System.out.println("Nome do funcionário 1: " + funcionarioDaEmpresa1.getNome());
        System.out.println("Salário do funcionário 2: " + funcionarioDaEmpresa2.getSalario());
    }
}

