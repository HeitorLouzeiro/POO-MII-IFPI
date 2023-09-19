class MeuPrograma12{
	public static void main(String[] args){
		Empresa empresa1 = new Empresa("IFPI", "Promover uma educação de excelência direcionada às demandas sociais.");

		empresa1.adimiteNovoFuncionario("Jurandir", 5000, new Data(26,8,2014));
		empresa1.adimiteNovoFuncionario("Felipinho", 6000, new Data(26,8,2014));
		empresa1.adimiteNovoFuncionario("Tulio", 3000, new Data(02,02,2023));

		System.out.println("O "+empresa1.getNome()+" tem "+empresa1.getContadorDeFuncionarios()+" funcionário(s) e uma folha salarial de R$ "+empresa1.getFolhaSalarial()+".");

		// O que acontece aqui?? temos quantos problemas?
//		System.out.println(empresa1.getFuncionario(0)+" tem a matricula = "+empresa1.getFuncionario(0).getIdentificador());
//		System.out.println(empresa1.getFuncionario(1)+" tem a matricula = "+empresa1.getFuncionario(1).getIdentificador());
//		System.out.println(empresa1.getFuncionario(2)+" tem a matricula = "+empresa1.getFuncionario(2).getIdentificador());
//		System.out.println(empresa1.getFuncionario(3)+" tem a matricula = "+empresa1.getFuncionario(3).getIdentificador());


		// Como resolver estes problemas?


		System.out.println(empresa1.getFuncionario(0).getNome()+" tem a matricula = "+empresa1.getFuncionario(0).getIdentificador());
		System.out.println(empresa1.getFuncionario(1).getNome()+" tem a matricula = "+empresa1.getFuncionario(1).getIdentificador());
		System.out.println(empresa1.getFuncionario(2).getNome()+" tem a matricula = "+empresa1.getFuncionario(2).getIdentificador());
		
	}

}



class Empresa{
	private String nome;
	private String slogam;
	private Funcionario[] listaDeFuncionarios;
	private double folhaSalarial;
	private int contadorDeFuncionarios;

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

	private void incrementaContadorDeFuncionarios(){
		contadorDeFuncionarios++;
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


