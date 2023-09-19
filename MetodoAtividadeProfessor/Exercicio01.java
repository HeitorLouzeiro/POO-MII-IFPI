//======================================================================
//======================================================================
//Questão 01: Faça um código para mostrar todos os números pares de 0 até 1000.
//======================================================================
//======================================================================
/*
class Exercicio01{
	public static void main(String[] args){
		for(int i=1; i<=1000; i++){
			if((i%2)==0){
				System.out.println(i);
			}
		}
	}
}
*/

//======================================================================
//======================================================================
//Questão 02: Faça um código para indicar o quadrado de um número e se ele (o resultado) é divisível por 3 ou não.
//======================================================================
//======================================================================
/*
class Exercicio01{
	public static void main(String[] args){
		int numero = 6;
		int quadrado = numero * numero;

		System.out.print("O quadrado de "+numero+" é "+quadrado);

		if((quadrado%3)==0){
			System.out.println(" e "+quadrado+" é divisível por 3");
		}else{
			System.out.println(" e "+quadrado+" NÃO é divisível por 3");
		}
		
	}
}
*/
//======================================================================
//======================================================================
//Questão 03: Faça um código para mostrar todos os múltiplos de 5 entre 0 e 1000.
//======================================================================
//======================================================================
/*
class Exercicio01{
	public static void main(String[] args){
		for(int i=1; i<=1000; i++){
			if((i%5)==0){
				System.out.println(i);
			}
		}
	}
}
*/

//======================================================================
//======================================================================
//Questão 04: Faça um código para mostrar todos os múltiplos de 5 e que são pares entre 0 e 1000
//======================================================================
//======================================================================
/*
class Exercicio01{
	public static void main(String[] args){
		for(int i=1; i<=1000; i++){
			if( ((i%5)==0) && ((i%2)==0)){
				System.out.println(i);
			}
		}
	}
}
*/
//======================================================================
//======================================================================
//Questão 05: Faça um código que mostre todos os números de 0 até 100. Após cada número, mostre o seu quadrado (x2)
//======================================================================
//======================================================================
/*
class Exercicio01{
	public static void main(String[] args){
		for(int i=0; i<=100; i++){
				System.out.println("O número é "+i+" e o seu quadrado é "+(i*i));
		}
	}
}
*/
//======================================================================
//======================================================================
//Questão 06: Faça um programa para transformar um número (menor que 31) de decimal para binário (gambiarra, usando apenas IF e sem vetor)
//======================================================================
//======================================================================

class Exercicio01{
	public static void main(String[] args){
		int numeroDec =31;
		int auxiliar = numeroDec;
		int p1=0;
		int p2=0;
		int p3=0;
		int p4=0;
		int p5=0;

//		if(auxiliar<1){
//			p1=auxiliar;
//			auxiliar=0;
//		}

		p1=auxiliar%2;
		auxiliar=auxiliar/2;

//		if(auxiliar<1){
//			p2=auxiliar;
//			auxiliar=0;
//		}

		p2=auxiliar%2;
		auxiliar=auxiliar/2;

//		if(auxiliar<1){
//			p3=auxiliar;
//			auxiliar=0;
//		}

		p3=auxiliar%2;
		auxiliar=auxiliar/2;

//		if(auxiliar<1){
//			p4=auxiliar;
//			auxiliar=0;
//		}

		p4=auxiliar%2;
		auxiliar=auxiliar/2;

//		if(auxiliar<1){
//			p5=auxiliar;
//			auxiliar=0;
//		}

		p5=auxiliar%2;
		auxiliar=auxiliar/2;

		System.out.println("O Valor "+numeroDec+" em binário é igual a: "+p5+p4+p3+p2+p1);
	}

}

