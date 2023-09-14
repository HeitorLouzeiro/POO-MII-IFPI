/* 1) No capítulo anterior, você deve ter reparado que a versão recursiva 
para o problema de Fibonacci é lenta porque toda hora estamos recalculando valores. 
Faça com que a versão recursiva seja tão boa quanto a versão iterativa. (Dica: use arrays para isso) */
public class Q1 { 
    public static void main(String[] args) {
        int[] array = new int[100];
        System.out.println(fibonacci(10, array));
    }

    static int fibonacci(int n, int[] array) {
        if (n == 0 || n == 1) {
            return n;
        } else if (array[n] != 0) {
            return array[n];
        } else {
            array[n] = fibonacci(n - 1, array) + fibonacci(n - 2, array);
            return array[n];
        }
    }
    
}
