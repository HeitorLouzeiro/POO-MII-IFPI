
class MeuPrograma7{
	public static void main(String[] args){
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();

		conta1.nomeUsuario = "Jurandir";
		conta1.saldo = 2000;

		conta2.nomeUsuario = "Claudemiro";
		conta2.saldo = 180000;

//		conta1.tira(500);
		conta1.bota(800);

		System.out.println(conta1.nomeUsuario+" tem R$ "+conta1.saldo+" em sua conta.");
		System.out.println(conta2.nomeUsuario+" tem R$ "+conta2.saldo+" em sua conta.");

/*		boolean deuCerto = conta1.tira2(500);
		if(deuCerto){
			System.out.println("Operação realizada com sucesso! A conta de "+conta1.nomeUsuario+" tem R$ "+conta1.saldo+".");
		}else{
			System.out.println("Operação falhou! A conta de "+conta1.nomeUsuario+" tem R$ "+conta1.saldo+".");
		}
*/

/*	
		// Testando o método transfere...
		Conta conta2 = new Conta();
		conta2.nomeUsuario = "Pedro";
		conta2.saldo = 18000;

		System.out.println(conta1.nomeUsuario+" tem R$ "+conta1.saldo+" em sua conta.");
		System.out.println(conta2.nomeUsuario+" tem R$ "+conta2.saldo+" em sua conta.");

		conta1.transferePara(conta2, 500);

		System.out.println(conta1.nomeUsuario+" tem R$ "+conta1.saldo+" em sua conta.");
		System.out.println(conta2.nomeUsuario+" tem R$ "+conta2.saldo+" em sua conta.");
*/
	}

}


class Conta{
	// Inicio dos atributos da conta	
	int numeroConta;
	String nomeUsuario;
	double saldo;
	double limite;		
	// Fim dos atributos da conta

	//=========================================================

	// Inicio dos métodos da conta

	// Método para depositar
	void bota(double valor){
		this.saldo += valor;
	}



	//Método para sacar
	void tira(double valor){
		this.saldo -= valor;
	}



	//Método para sacar versão 2
	boolean tira2(double valor){
		if(valor < this.saldo){
			this.saldo -= valor;
			return true;
		}else{
			return false;
		}
	}

	//Método para transferir
	void transferePara(Conta destino, double valor){
		this.tira(valor);
		destino.bota(valor);
	}


}