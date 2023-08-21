/*
Escreva um programa que, dada uma variavel x (com valor 180, por exemplo), temos y de 
acordo com a seguinte regra:  
• Se x e par, y=x/2  
• Se x e impar, y=3*x+1  
• imprime y  
• O programa deve ent a o jogar o valor de y em x e continuar ate que y tenha o valor final 
de 1. Por exemplo, para x = 13, a sa i da sera: 
40 - > 20 - > 10 - > 5 - > 16 - > 8 - > 4 - > 2 -> 1  
 */
class Q6 {
    public static void main(String[] args) {
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
    }
}
