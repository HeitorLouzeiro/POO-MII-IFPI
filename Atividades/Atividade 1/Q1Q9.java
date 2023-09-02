class Q1Q9{
 //Q1
/*      public static void main(String[] args){
        for(int i = 150; i <= 300; i++){
            System.out.println(i);
        }
    }   */

    //Q2
/*     public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    } */

    //Q3
/*     public static void main(String main[]){
        int fatorial = 1;
        for(int i = 1; i <= 10; i++){
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }
    } */

    //Q4
/*     public static void main(String[] args) {
        long fatorial = 1;
        for(int i = 1; i <= 40; i++){
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }        
        System.out.println("Ocorre um estouro de memoria, pois o tipo int suporta apenas 32 bits(4294967295),\r\n" + //
                "e o tipo long suporta 64 bits .");
    } */

    //Q5
/*     public static void main(String[] args) {
        int numero = 0;
        int numero2 = 1;

        System.out.println(numero);
        System.out.println(numero2);
        
        while(numero2 < 100){
            numero2 += numero;
            numero = numero2 - numero;
            System.out.println(numero2);
            
        }

    } */

    //Q6
/*     public static void main(String[] args) {
        int x = 13;
        int y = 0;
        
        while (y != 1) {
            if (x % 2 == 0) {
                y = x / 2;
            } else {
                y = 3 * x + 1;
            }
            System.out.println(y);
            x = y;
        }
    } */

    //Q8
/*     public static void main(String[] args) {
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
    } */

    //Q9
    
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