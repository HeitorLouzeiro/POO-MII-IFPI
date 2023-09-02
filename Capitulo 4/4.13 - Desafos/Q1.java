/* 
1) Um método pode chamar ele mesmo. Chamamos isso de recursão.
Você pode resolver a série de fibonacci usando um método que chama ele mesmo. 
O objetivo é você criar uma classe, que possa ser usada da seguinte maneira:

Fibonacci fibo = new Fibonacci();
int i = fibo.calculaFibonacci(5);
System.out.println(i);

Aqui imprimirá 8, já que este é o sexto número da série.
Este métodocalculaFibonaccinão pode ter nenhum laço, só pode chamar ele mesmo como método. Pense 
nele como uma função, que usa a própria função para calcular o resultado. 
*/

/* 
Sequencia de Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
formula para calcular o fibonacci: F(n) = F(n-1) + F(n-2)
 */
class Fibonacci {
    public int calculaFibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
        int i = fibo.calculaFibonacci(8);
        System.out.println(i);
    }
    
}
/* 
Quando n = 8 o resultado é 21
n é o número que queremos calcular o fibonacci
n = 8
calculaFibonacci(8) = calculaFibonacci(7) + calculaFibonacci(6)
calculaFibonacci(7) = calculaFibonacci(6) + calculaFibonacci(5)
calculaFibonacci(6) = calculaFibonacci(5) + calculaFibonacci(4)
calculaFibonacci(5) = calculaFibonacci(4) + calculaFibonacci(3)
calculaFibonacci(4) = calculaFibonacci(3) + calculaFibonacci(2)
calculaFibonacci(3) = calculaFibonacci(2) + calculaFibonacci(1)
calculaFibonacci(2) = 1
calculaFibonacci(1) = 1

calculaFibonacci(3) = 1 + 1 = 2
calculaFibonacci(4) = 2 + 1 = 3
calculaFibonacci(5) = 3 + 2 = 5
calculaFibonacci(6) = 5 + 3 = 8
calculaFibonacci(7) = 8 + 5 = 13
calculaFibonacci(8) = 13 + 8 = 21 
*/

/* Q2.java  
2) Por que o modo acima é extremamente mais lento para calcular a série do que o modo iterativo 
(que se usa um laço)?

R: Porque o modo acima calcula o mesmo número várias vezes, enquanto o modo iterativo calcula
cada número apenas uma vez. O codigo a cima é mais lento porque ele calcula 
o Fibonacci de um número, é preciso somar os dois anteriores.

*/

