//===========================================================
//===========================================================
// Questão 01: Imprima todos os números de 150 a 300.
//===========================================================
//===========================================================
/*
class Atividade01{
	public static void main(String[] args){
		for(int i=150; i<=300; i++){
			System.out.println(i);
		}
	}
}
*/
//===========================================================
//===========================================================
// Questão 02: Imprima todos os múltiplos de 3, entre 1 e 100.
//===========================================================
//===========================================================
/*
class Atividade01{
	public static void main(String[] args){
		for(int i=1; i<=100; i++){
			if((i%3)==0){
				System.out.println(i);
			}
		}
	}
}
*/
//===========================================================
//===========================================================
// Questão 03: Imprima os fatoriais de 1 a 10.
//===========================================================
//===========================================================
/*
class Atividade01{
	public static void main(String[] args){
		for(int i=1; i<=10; i++){
			int fatorial = 1;
			for(int j=i; j>=1 ; j--){
				fatorial = fatorial * j;
			}
			System.out.println("O fatorial de "+i+" é igual a "+fatorial);
		}
	}
}
*/
//===========================================================
//===========================================================
// Questão 04: Aumente a quantidade de números que terão os fatoriais impressos, até 20, 30, 40. Em um determinado momento, além desse cálculo demorar, vai começar a mostrar respostas completamente erradas. Por quê? Mude de int para long, e você poderá ver alguma mudança.
//===========================================================
//===========================================================
/*
class Atividade01{
	public static void main(String[] args){
		for(int i=1; i<=30; i++){
			long fatorial = 1;
			for(long j=i; j>=1 ; j--){
				fatorial = fatorial * j;
			}
			System.out.println("O fatorial de "+i+" é igual a "+fatorial);
		}
	}
}
*/
//===========================================================
//===========================================================
// Questão 05: Imprima os primeiros números da série de Fibonacci até passar de 100.
//===========================================================
//===========================================================
/*
class Atividade01{
	public static void main(String[] args){
		int a = 0;
		int b = 1;
		int c;

		System.out.print(a);
		System.out.print(", "+b);

		while(b<100){
			c = a+b;
			System.out.print(", "+c);
			a=b;
			b=c;
		}
		System.out.println(".");
	}
}
*/
//===========================================================
//===========================================================
// Questão 06: Escreva um programa que, dada uma variável x (com valor 180, por exemplo), temos y de acordo com a seguinte regra[...]
//===========================================================
//===========================================================
/*
class Atividade01{
	public static void main(String[] args){
		int x = 13;
		int y = x;

		System.out.print(x); //Apenas estético.

		while(y>1){
			System.out.print(" -> "); //Apenas estético.

			if(x%2==0){
				y=x/2;
			}else{
				y=3*x+1;
			}

			System.out.print(y);
			x=y;
		}

		System.out.println("."); //Apenas estético.
	}
}
*/
//===========================================================
//===========================================================
// Questão 07: Faça o exercício da série de Fibonacci usando apenas duas variáveis.
//===========================================================
//===========================================================
/*
class Atividade01{
	public static void main(String[] args){
		int a = 0;
		int b = 1;

		System.out.print(a);

		while(a<100){
			System.out.print(", "+(a+b));
			a=a+b;
			b=a-b;
		}
		System.out.println(".");
	}
}
*/
//===========================================================
//===========================================================
// Questão 08: aça um código utilizando o comando switch-case. Neste código, uma pessoa irá trabalhar em outro país. Como cada país tem regras trabalhistas diferentes, o programa deve retornar na tela as informações de acordo com a tabela a seguir. As informações retornadas são as seguintes: i) “Você não pode trabalhar nem estagiar”; ii) “Você não pode trabalhar, mas pode estagiar”; iii) “Você pode trabalhar”; iv) “Você pode trabalhar OU estagiar”.
//===========================================================
//===========================================================
/*
class Atividade01{
	public static void main(String[] args){
		int idade = 3;
		char pais = 'p';

		switch(pais){
		case 'a':
			System.out.println("Alemanha, "+idade+" anos:");
			if(idade>=18){
				System.out.println("Você pode trabalhar");
			}else{
				System.out.println("Você não pode trabalhar nem estagiar");
			}
			break; 

		case 'm':
			System.out.println("México, "+idade+" anos:");
			if(idade<15){
				System.out.println("Você não pode trabalhar nem estagiar");
			}
			if(idade>=15 && idade<17){
				System.out.println("Você não pode trabalhar, mas pode estagiar");
			}
			if(idade>=17){
				System.out.println("Você pode trabalhar");
			}
			break; 

		case 'e':
			System.out.println("Espanha, "+idade+" anos:");
			if(idade<14){
				System.out.println("Você não pode trabalhar nem estagiar");
			}
			if(idade>=14 && idade<19){
				System.out.println("Você não pode trabalhar, mas pode estagiar");
			}
			if(idade>=19){
				System.out.println("Você pode trabalhar");
			}
			break; 

		case 'r':
			System.out.println("Rússia, "+idade+" anos:");
			if(idade>=16){
				System.out.println("Você pode trabalhar");
			}else{
				System.out.println("Você não pode trabalhar nem estagiar");
			}
			break; 

		case 'i':
			System.out.println("Itália, "+idade+" anos:");
			if(idade<15){
				System.out.println("Você não pode trabalhar nem estagiar");
			}
			if(idade>=15 && idade<18){
				System.out.println("Você não pode trabalhar, mas pode estagiar");
			}
			if(idade>=18 && idade<25){
				System.out.println("Você pode trabalhar OU estagiar");
			}
			if(idade>=25){
				System.out.println("Você pode trabalhar");
			}
			break; 

		default:
			System.out.println("eita... sei não...");
		}
	}
}
*/
//===========================================================
//===========================================================
// Questão 09: Com base na questão anterior faça um código que seja dita a idade de uma pessoa e o programa retorne os países que ela pode estagiar e os países que ela pode trabalhar.
//===========================================================
//===========================================================

class Atividade01{
	public static void main(String[] args){
		int idade = 2;

		System.out.println("\n\nVocê tem "+idade+" anos.\n\nVocê pode estagiar em:");

		if(idade>=15 && idade<17) System.out.print("México ");
		if(idade>=14 && idade<19) System.out.print("Espanha ");
		if(idade>=15 && idade<25) System.out.print("Itália ");
		if(idade<14 || idade>25) System.out.print("Lugar nenhum :( ");

		System.out.println("\n\nAlém disso, você pode trabalhar em:");

		if(idade>=18) System.out.print("Alemanha ");
		if(idade>=17) System.out.print("México ");
		if(idade>=19) System.out.print("Espanha ");
		if(idade>=16) System.out.print("Rússia ");
		if(idade>=18) System.out.print("Itália ");
		if(idade<16) System.out.print("Lugar nenhum :( ");

		System.out.println("\n\n\nEscolha com sabedoria. :)");

	}
}
