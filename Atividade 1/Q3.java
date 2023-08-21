/*3 )  Imprima os fatoriais de 1 a 10.  
O fatorial de um n u mero n e n * n - 1 * n - 2 ... ate n = 1. Lembre - se de utilizar os 
parenteses. O fatorial de 0 e 1 . O fatorial de 1 e (0!) *1=1 . O fatorial de 2 e (1!) * 2 = 2. 
O fatorial de 3 e (2!) * 3 = 6 . O fatorial de 4 e (3!) * 4 = 24 .  */

class Q3 {
    public static void main(String main[]){
        int fatorial = 1;
        for(int i = 1; i <= 10; i++){
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }
    }
}
