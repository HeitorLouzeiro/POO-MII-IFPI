class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            System.out.println("Mês invalido");
        }
        if (ano < 0) {
            System.out.println("Ano invalido");
        }
        // Verifica se o dia é válido de acordo com o mês
        if (dia < 1 || dia > diasNoMes(mes, ano)) {
            System.out.println("Dia invalido");

        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getData() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    // Método auxiliar para determinar o número de dias em um mês
    private int diasNoMes(int mes, int ano) {
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28;
            default:
                return 31;
        }
    }
}
class Funcionario{
    private double salario;
    private String nome;
    private static int totalFuncionarios;

    private int identificador;
    private Data dataNascimento;


    public Funcionario(String nome, double salario, Data dataNascimento) {
        this.nome = nome;
        this.salario = salario;
        this.dataNascimento = dataNascimento;

        totalFuncionarios++; 
        this.identificador = totalFuncionarios;
    }

    /* Metodos get serve para retorna seu valor */
    public double getSalario() { 
        return this.salario;
    }
    
    public String getNome(){
        return this.nome;
    }

    public int getIdentificador(){
        return this.identificador;
    }
    
    /* Metodos set serve para definir ou alterar seu valor */
    public void setSalario(double salario) { 
        this.salario = salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Data getDataNascimento(){
        return this.dataNascimento;
    }

}
class Empresa{
    private String slogan;
    private int totalfolhaPagamento;

    private Funcionario[] funcionarios;

    public Empresa(String slogan){
        this.slogan = slogan;
        funcionarios = new Funcionario[10];

    }

    public String getSlogan(){
        return this.slogan;
    }

    public int getTotalFolhaPagamento(){
        return this.totalfolhaPagamento;
    }

    public void adicionarFuncionario(Funcionario funcionario){
        for (int i = 0; i < funcionarios.length; i++) {
                funcionarios[i] = funcionario;
                this.totalfolhaPagamento += funcionario.getSalario();
                break;
        }
    }

    public Funcionario[] getFuncionarios(){
        return this.funcionarios;
    }
}


class Aula1509 {
    public static void main(String[] args) {
        // Criar objetos Data para as datas de nascimento dos funcionários
        Data dataNascimentoFuncionario1 = new Data(31, 2, 1990);
        Data dataNascimentoFuncionario2 = new Data(10, 8, 1985);

        // Criar objetos Funcionario com as datas de nascimento
        Funcionario funcionario1 = new Funcionario("João", 1000, dataNascimentoFuncionario1);
        Funcionario funcionario2 = new Funcionario("Maria", 2000, dataNascimentoFuncionario2);

        Empresa empresa = new Empresa("Empresa X");

        System.out.println("Identificador: " + funcionario1.getIdentificador());
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Data de Nascimento: " + funcionario1.getDataNascimento().getData());

        System.out.println("-".repeat(50)); // separador

        System.out.println("Identificador: " + funcionario2.getIdentificador());
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Data de Nascimento: " + funcionario2.getDataNascimento().getData());

        System.out.println("-".repeat(50)); // separador

        System.out.println("Slogan: " + empresa.getSlogan());

        empresa.adicionarFuncionario(funcionario1);
        empresa.adicionarFuncionario(funcionario2);

        System.out.println("Total da folha de pagamento: " + empresa.getTotalFolhaPagamento());
    }
}
