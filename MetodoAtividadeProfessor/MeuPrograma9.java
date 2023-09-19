class MeuPrograma9{
	public static void main(String[] args){
		int idade1;
		int idade2;
		int idade3;
		int idade4;
		int idade5;

		//Arrays
		int[] idades;
		idades = new int[5];

		//o que acontece??
		idades[0] = 18;
		idades[1] = 19;
		idades[2] = 17;
		idades[3] = 22;
		idades[4] = 15;
	//	idades[5] = 25;

		//Arrays de objetos??
		Conta[] minhasContas = new Conta[10];

		Conta contaNova = new Conta();
		contaNova.saldo = 5000;
		minhasContas[0] = contaNova;

		minhasContas[1] = new Conta();
		minhasContas[1].saldo = 8000;

		//Como está a memória neste momento??

		for(int i=0; i<2; i++){
			System.out.println(minhasContas[i].saldo);
		}

		//E se eu não sei o tamanho do Array? Ex: Array recebido por parametro.
		System.out.println("----------------------------------------");

		Conta[] minhasContas2 = new Conta[4];

		minhasContas2[0] = new Conta();
		minhasContas2[0].saldo = 7000;
		minhasContas2[1] = new Conta();
		minhasContas2[1].saldo = 8000;
		minhasContas2[2] = new Conta();
		minhasContas2[2].saldo = 1000;
		minhasContas2[3] = new Conta();
		minhasContas2[3].saldo = 80000;

		for(int i=0; i<minhasContas2.length; i++){
			System.out.println(minhasContas2[i].saldo);
		}

		System.out.println("----------------------------------------");


		for(Conta i : minhasContas2){
			System.out.println(i.saldo);
		}
	}

}

class Conta{
	String nome;
	double saldo;

	void adiciona(double valor){
		this.saldo = this.saldo + valor;
	}
}


