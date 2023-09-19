/*
//Forma antiga
class MeuPrograma11{
	public static void main(String[] args){
		Funcionario funcionario = new Funcionario();

		funcionario.nome = "Jurandir";
		funcionario.salario = 2000;
		funcionario.estaAtivo = true;

		System.out.print(funcionario.nome+" tem o salário de R$ "+funcionario.salario);
		
		if(funcionario.estaAtivo){
			System.out.print(". Ele está trabalhando na empresa");
		}else{
			System.out.print(". Eita... Ele não trabalha na empresa");
		}
	}

}
*/

//Forma nova (correta). 
class MeuPrograma11{
	public static void main(String[] args){
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario("Jurandir");
		Funcionario funcionario3 = new Funcionario("Tulio");

		funcionario1.setSalario(5000);
		funcionario2.setSalario(4000);
		funcionario3.setSalario(3500);

		System.out.println(funcionario1.getNome()+" tem o salário de R$ "+funcionario1.getSalario());
		System.out.println(funcionario2.getNome()+" tem o salário de R$ "+funcionario2.getSalario());
		System.out.println(funcionario3.getNome()+" tem o salário de R$ "+funcionario3.getSalario());

		System.out.println("A nossa empresa tem "+Funcionario.getContadorDeFuncionarios()+" funcionários.");
		
		System.out.println("(ERRADO) A nossa empresa tem "+funcionario1.getContadorDeFuncionariosERRADO()+" funcionários.");
		System.out.println("(ERRADO) A nossa empresa tem "+funcionario2.getContadorDeFuncionariosERRADO()+" funcionários.");
		System.out.println("(ERRADO) A nossa empresa tem "+funcionario3.getContadorDeFuncionariosERRADO()+" funcionários.");

	}

}

class Funcionario{
	private String nome;
	private String departamento;
	private double salario;
	private String dataDeEntrada;
	private String rg;
	private boolean estaAtivo;
	private int contadorDeFuncionariosERRADO;
	private static int contadorDeFuncionarios;

	Funcionario(){
		incrementaContadorDeFuncionariosERRADO();
		incrementaContadorDeFuncionarios();
		System.out.println("Funcionário criado!");
	}

	Funcionario(String nome){
		this.nome = nome;
		incrementaContadorDeFuncionariosERRADO();
		incrementaContadorDeFuncionarios();
		System.out.println("Funcionário criado!");
	}

	private void incrementaContadorDeFuncionariosERRADO(){
		contadorDeFuncionariosERRADO++;
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

	public void contrata(String data){
		this.dataDeEntrada = data;
		this.estaAtivo = true;
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

	public int getContadorDeFuncionariosERRADO(){
		return contadorDeFuncionariosERRADO;
	}

	public static int getContadorDeFuncionarios(){
		return contadorDeFuncionarios;
	}

}


