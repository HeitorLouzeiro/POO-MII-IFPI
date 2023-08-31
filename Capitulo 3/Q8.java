/* Faca um codigo utilizando o comando switch - case. Neste codigo, uma pessoa ira trabalhar em 
outro pais . Como cada pais tem regras trabalhistas diferentes, o programa deve retornar na tela 
as informacoes de acordo com a tabela a seguir . As informacoes retornadas s ao as seguintes: 
i) “Voce nao pode trabalhar nem estagiar” ; 
ii) “Voce n ao pode trabalhar , mas pode estagiar” ; 
iii) “Voce pode trabalhar” ; 
iv) “Voce pode trabalhar OU estagiar” . */

/* Pais Cod Regra 
Alemanha  a A pessoa so pode trabalha r quando tiver mais de 18 anos. N ao existe estagio. 
Mexico m A pessoa so pode trabalha r quando tiver mais 17 anos. Mas pode estagiar entre 15 e 17 anos. 
Espanha e A pessoa so pode trabalha r quando tiver mais de 19 anos. Mas pode estagiar entre 14 e 19 anos. 
Russia r A pessoa so pode trabalha r quando tiver mais de 1 6 anos. Nao existe estagio. 
Italia i pessoa so pode trabalha r quando tiver mais 18 anos. Mas pode estagiar entre 15 e 25 anos. 
*/

class Q8 {
    public static void main(String[] args) {
        char pais = 'i';
        int idade = 26;

        switch (pais) {
            // Alemanha
            case 'a':
                System.out.println("Alemanha voce");
                if (idade >= 18) {
                    System.out.println("pode trabalhar.");
                } else {
                    System.out.println("nao pode trabalhar nem estagiar");
                }
                break;
            // Mexico
            case 'm':
                System.out.println("Mexico voce:");
                if (idade > 17) {
                    System.out.print("trabalhar");
                } else if (idade >= 15 && idade <= 17) {
                    System.out.println("nao pode trabalhar mas pode estagiar.");
                } else {
                    System.out.println("nao pode trabalhar nem estagiar.");
                }
                break;
            // Espanha
            case 'e':
                System.out.println("Espanha voce:");
                if (idade > 19) {
                    System.out.println("pode trabalhar, mais não pode estagiar.");
                } else if (idade >= 14 && idade <= 19) {
                    System.out.println("nao pode trabalhar mais estagiar.");
                } else {
                    System.out.println("nao pode trabalhar nem estagiar.");
                }
                break;
            // Russia
            case 'r':
                System.out.println("Russia voce:");
                if (idade > 16) {
                    System.out.println("pode trabalhar");
                } else {
                    System.out.println("nao pode trabalhar nem estagiar");
                }
                break;
            // Italia
            case 'i':
                System.out.println("Italia voce:");
                if (idade >= 15 && idade <= 18){
                    System.out.println("nao pode trabalhar mais estagiar.");
                }else if(idade > 18 && idade <= 25){
                    System.out.println("pode trabalhar ou estagiar.");
                }else if(idade > 25){
                    System.out.println("pode trabalhar.");
                }else{
                    System.out.println("nao pode trabalhar nem estagiar.");
                }
                break;
            default:
                System.out.println("Pais invalido");
                break;
            
        }
    }
}
