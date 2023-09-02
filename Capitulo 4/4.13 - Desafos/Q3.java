/*
3) Escreva o método recursivo novamente, usando apenas uma linha. 
Para isso, pesquise sobre o operador condicional ternário. (ternary operator)
*/

class Fibonacci {
    public int calculaFibonacci(int n) {
        return (n <= 2) ? 1 : calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
    }
}
public class Q3 {
    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
        int i = fibo.calculaFibonacci(8);
        System.out.println(i);
    }
    
}

/*
Esse (n<=2) ? 1 : calculaFibonacci(n-1) + calculaFibonacci(n-2) é um if ou um else
se n for menor ou igual a 2 retorna 1
se não retorna calculaFibonacci(n-1) + calculaFibonacci(n-2)
 */


