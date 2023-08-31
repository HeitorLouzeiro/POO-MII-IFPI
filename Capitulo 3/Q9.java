/*Faca um codigo utilizando o comando switch - case. Neste codigo, uma pessoa ira trabalhar em 
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

Com base na quest ao anterior faca um codigo que seja dita a idade de uma pessoa e o 
prog rama retorne os paises q ue ela pode estagiar e os paises q ue e la pode trabalhar. */


class Q9 {
    public static void main(String[] args) {
        // int idade = 18;
        int idade = 14;
        char space = '-';
        /* 
            Russia trabalhar idade > 16
            Mexico trabalhar idade > 17
            Alemanha trabalhar idade > 18
            Italia trabalhar idade > 18
            Espanha trabalhar idade > 19
        */
        for(int i = idade; i < 27; i++){
            System.out.println("Voce tem " + i + " anos.");
            System.out.println("Voce pode trabalhar na: ");
            if (i == 16) {
                System.out.println("* Russia");
            }else if (i == 17) {
                System.out.println("* Russia");
                System.out.println("* Mexico");
            }else if (i == 18) {
                System.out.println("* Russia");
                System.out.println("* Mexico");
                System.out.println("* Alemanha");
                System.out.println("* Italia");
            }else if (i >= 19) {
                System.out.println("* Russia");
                System.out.println("* Mexico");
                System.out.println("* Alemanha");
                System.out.println("* Italia");
                System.out.println("* Espanha");
            }else{
                System.out.println("Voce nao pode trabalhar em nenhum pais.");
            }
            System.out.println(space);
            /*
                * idade = 14; estagiar - espanha
                * idade = 15 estagiar - espanha, mexico, italia
                * idade = 16 estagiar - espanha, mexico, italia
                * idade = 17 estagiar - espanha, mexico, italia
                * idade = 18 estagiar - espanha, italia
                * idade = 19 estagiar - espanha, italia
                * idade 20 > 25 estagiar - italia
                * 
            */

            System.out.println("Voce pode estagiar em: ");
            if (i == 14) {
                System.out.println("* Espanha");
            }else if (i >= 15 && i <= 17) {
                System.out.println("* Espanha");
                System.out.println("* Mexico");
                System.out.println("* Italia");
            }else if (i > 17 && i <= 19) {
                System.out.println("* Espanha");
                System.out.println("* Italia");
            }else if (i > 19 && i < 25) {
                System.out.println("* Italia");
            }else{
                System.out.println("nenhum pais.");
            }
            System.out.println(space);
        }
    }   
}
