/*
5 )  Imprima os primeiros numeros da serie de Fibonacci at e passar de 100. 
A serie de Fibonacci e a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... 
Para calcula-la, o primeiro e segundo elementos valem 1, da i por diante, 
o n - e simo elemento vale o (n - 1) - e simo elemento somando ao (n -2)-esimo 
elemento (ex: 8 = 5 + 3).  
 */
class Q5 {
    public static void main(String[] args) {
        int numero = 0;
        int numero2 = 1;

        System.out.println(numero);
        System.out.println(numero2);
        
        while(numero2 < 100){
            numero2 += numero;
            numero = numero2 - numero;
            System.out.println(numero2);
            
        }

    }
}
/*
 * numero2 = 1
 * numero = 0
 * 
 * numero2 = 1 + 0 = 1
 * numero = 1 - 0 = 1
 * 
 * numero2 = 1 + 1 = 2
 * numero = 2 - 1 = 1
 * 
 * numero2 = 2 + 1 = 3
 * numero = 3 - 1 = 2
 * 
 * numero2 = 3 + 2 = 5
 * numero = 5 - 2 = 3
 * 
 */