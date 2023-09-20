// EXERCICIO 3 - AULA 18/09
/* 
1 - Crie um metodo para demitir um funcionario de uma empresa.
Lembre-se a demissão de um funcionario impacta em alguns atributos da empresa.
(ex. Quantidade de funcionarios, folha salarial, etc.)
*/

/* 2- Ao demitir um funcionario, a empresa deve pagar uma idenização ao funcionario.
essa idenização corresponde a 0,001% do salario do funcionario para cada dia trabalhado.
Crie um metodo que calcule essa idenização e imprima o valor da idenização no momento da demissão. */

class Aula1809{
	public static void main(String[] args){
		Empresa empresa1 = new Empresa("IFPI", "Promover uma educação de excelência direcionada às demandas sociais.");

		empresa1.adimiteNovoFuncionario("Jurandir", 5000, new Data(26,8,2014));
		empresa1.adimiteNovoFuncionario("Felipinho", 6000, new Data(26,8,2014));
		empresa1.adimiteNovoFuncionario("Tulio", 3000, new Data(02,02,2023));

		System.out.println("O "+empresa1.getNome()+" tem "+empresa1.getContadorDeFuncionarios()+" funcionário(s) e uma folha salarial de R$ "+empresa1.getFolhaSalarial()+".");

		System.out.println(empresa1.getFuncionario(0).getNome()+" tem a matricula = "+empresa1.getFuncionario(0).getIdentificador());
		System.out.println(empresa1.getFuncionario(1).getNome()+" tem a matricula = "+empresa1.getFuncionario(1).getIdentificador());
		System.out.println(empresa1.getFuncionario(2).getNome()+" tem a matricula = "+empresa1.getFuncionario(2).getIdentificador());
		
        empresa1.demiteFuncionario(0);
	}

}



class Empresa{
	private String nome;
	private String slogam;
	private Funcionario[] listaDeFuncionarios;
	private double folhaSalarial;
	private int contadorDeFuncionarios;
    private double indenizacao;

	Empresa(String nome, String slogam){
		this.nome = nome;
		this.slogam = slogam;
		this.listaDeFuncionarios = new Funcionario[100];
	}

	public void adimiteNovoFuncionario(String nome, double salario, Data dataDeEntrada){
		this.listaDeFuncionarios[contadorDeFuncionarios] = new Funcionario(nome, salario, dataDeEntrada);
		folhaSalarial = folhaSalarial + salario;
		incrementaContadorDeFuncionarios();
	}

    public void demiteFuncionario(int id){
        this.indenizacao = 0.001 * listaDeFuncionarios[id].getSalario() * listaDeFuncionarios[id].getIdentificador();
        this.folhaSalarial = this.folhaSalarial - listaDeFuncionarios[id].getSalario();

        System.out.println("O funcionário "+listaDeFuncionarios[id].getNome()+" foi demitido e receberá uma indenização de R$ "+indenizacao+".");
        System.out.println("A folha salarial da empresa "+this.nome+" agora é de R$ "+this.folhaSalarial+".");
        decrementaContadorDeFuncionarios();

        System.out.print("Quantidades de funcionários: " + contadorDeFuncionarios);
    }

	private void incrementaContadorDeFuncionarios(){
		contadorDeFuncionarios++;
	}

    private void decrementaContadorDeFuncionarios(){
        contadorDeFuncionarios--;
    }

	public double getFolhaSalarial(){
		return folhaSalarial;
	}

	public int getContadorDeFuncionarios(){
		return contadorDeFuncionarios;
	}

	public String getNome(){
		return nome;
	}

	public Funcionario[] getListaDeFuncionarios(){
		return listaDeFuncionarios;
	}

	public Funcionario getFuncionario(int id){
		return listaDeFuncionarios[id];
	}

}



class Data{
	private int ano;
	private int mes;
	private int dia;
	private int anoAtual;

	Data(int dia, int mes, int ano){
		this.anoAtual = 2023;
		novaData(dia, mes, ano);
	}

	public void novaData(int dia, int mes, int ano){
		if(checaDiaMes(mes,dia) && checaAno(ano)){
			this.ano = ano;
			this.mes = mes;
			this.dia = dia;
		}else{
			System.out.println("Data inválida!");
		}
	}

	private boolean checaAno(int ano){
		if((ano>0) && (ano<=this.anoAtual)){
			return true;
		}else{
			return false;
		}
	}

/*	private boolean checaMes(int mes){
		if((mes>=1) && (mes<=12)){
			return true;
		}else{
			return false;
		}
	}
*/
	private boolean checaDiaMes(int mes, int dia){
		switch (mes){
		case 2:
			if((dia>=1) && (dia<=28)){
				return true;
			}else{
				return false;
			}
		case 1,3,5,7,8,10,12:
			if((dia>=1) && (dia<=31)){
				return true;
			}else{
				return false;
			}
		case 4,6,9,11:
			if((dia>=1) && (dia<=30)){
				return true;
			}else{
				return false;
			}
		default:
			return false;
		}

	}
}



class Funcionario{
	private String nome;
	private String departamento;
	private double salario;
	private Data dataDeEntrada;
	private String rg;
	private boolean estaAtivo;
	private static int contadorDeFuncionarios;
	private int identificador;

	Funcionario(String nome, double salario, Data data){
		incrementaContadorDeFuncionarios();
		this.nome = nome;
		this.salario = salario;
		this.dataDeEntrada = data;
		this.identificador = getContadorDeFuncionarios();
		System.out.println("Funcionário criado!");
	}

	private static void incrementaContadorDeFuncionarios(){
		contadorDeFuncionarios++;
	}

	public void bonifica(double valor){
		this.salario = this.salario + valor;
	}

	public void demite(){
		this.estaAtivo = false;
	}

	public double getSalario(){
		return salario;
	}

	public void setSalario(double salario){
		this.salario = salario;
	}

	public String getNome(){
		return nome;
	}

	public int getIdentificador(){
		return identificador;
	}

	public static int getContadorDeFuncionarios(){
		return contadorDeFuncionarios;
	}

}