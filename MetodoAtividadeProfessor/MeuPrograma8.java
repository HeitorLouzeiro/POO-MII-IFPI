class MeuPrograma8{
	public static void main(String[] args){
		Funcionario funcionario = new Funcionario();

	//	funcionario.nome = "Jurandir";
	//	funcionario.salario = 2000;
	//	funcionario.estaAtivo = true;

		System.out.print(funcionario.nome+" tem o salário de R$ "+funcionario.salario);
		
		if(funcionario.estaAtivo){
			System.out.print(". Ele está trabalhando na empresa");
		}else{
			System.out.print(". Eita... Ele não trabalha na empresa");
		}
	}

}

class Funcionario{
	String nome;
	String departamento;
	double salario;
	String dataDeEntrada;
	String rg;
	boolean estaAtivo;

	void bonifica(double valor){
		this.salario = this.salario + valor;
	}

	void demite(){
		this.estaAtivo = false;
	}

	void contrata(String data){
		this.dataDeEntrada = data;
		this.estaAtivo = true;
	}
}


