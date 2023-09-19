
class MeuPrograma5{
	public static void main(String[] args){
		int numero=2;

		//imprimir números pares com while
/*		while(numero <= 100){
			if(numero%2==0){
				System.out.println(numero);
			}

			numero = numero + 1;
			numero++;
			numero+=1;
		}

*/
		//imprimir números pares com DOwhile
/*		do{
			if(numero%2==0){
				System.out.println(numero);
			}
			numero++;
		}while(numero == 100);
*/

/*		int ano = 2023;
		int idade = 15;
		char nacionalidade = 'b';
		//char nacionalidade = 'e';

		while(ano < 2030){
			System.out.print("Estamos no ano "+ano+".");

			if(nacionalidade=='b' && idade>=18){
				System.out.println(" Voce tem "+idade+" anos, já pode beber (com moderação)");
				ano++;
				idade++;
				continue;
				//break;
			}

			if(nacionalidade=='e' && idade>=21){
				System.out.println(" Voce tem "+idade+" anos, já pode beber (com moderação)");
				ano++;
				idade++;
				continue;
			}	

			System.out.println(" Voce tem "+idade+" anos, não pode beber");
		


			ano++;
			idade++;
		}


*/
		int idade = 20;
		char nacionalidade = 'z';

		switch(nacionalidade){
		case 'b':
			if(idade>=18){
				System.out.println(" Voce é um brasileiro de "+idade+" anos, já pode beber (com moderação)");
			}else{
				System.out.println(" Voce é um brasileiro de "+idade+" anos, não pode beber");
			}
			break;
		
		case 'e':
			if(idade>=21){
				System.out.println(" Voce é um estadunidense de "+idade+" anos, já pode beber (com moderação)");
			}else{
				System.out.println(" Voce é um estadunidense de "+idade+" anos, não pode beber");
			}
			break;

		case 'j':
			if(idade>=20){
				System.out.println(" Voce é um japones de "+idade+" anos, já pode beber (com moderação)");
			}else{
				System.out.println(" Voce é um japones de "+idade+" anos, não pode beber");
			}
			break;

		case 'c':
			System.out.println(" Voce é do Catar e tem "+idade+" anos, mesmo se tivesse mais de 8000 mil anos não poderia beber...");
			break;

		default:
			System.out.println(" Não sei de nada");
		}

		
	}	
}