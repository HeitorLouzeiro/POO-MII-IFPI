class MeuPrograma10{
	public static void main(String[] args){
		int[] sequencia = new int[100];
		int numero = 150;
		int numeroDec = numero;

		for(int i=0; i<sequencia.length; i++){
			sequencia[i] = 99;
		}

		for(int i=0; i<sequencia.length; i++){
			if(numero>1){
				sequencia[i] = numero%2;
				numero = numero/2;
			}else{
				sequencia[i] = numero;
				break;
			}
		}


		for(int i=sequencia.length-1; i>=0; i--){
			if(sequencia[i]!=99){
				System.out.print(sequencia[i]);
			}
		}

		System.out.println(" é a representação binária do número "+numeroDec);
	}

}




