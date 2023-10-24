/* 2) Uma fila (ou, em inglês, queue) regular segue a estrutura em que o primeiro a
entrar é o primeiro a sair (em inglês, first in first out, também conhecida pela
abreviação FIFO). Crie uma classe Fila que deve ter um construtor que cria uma
fila de números inteiros com capacidade de X elementos. Além disso, a fila deve
ter os métodos para adicionar um novo elemento, retirar um elemento, indicar
quantos elementos a fila possui e dizer se a fila está vazia ou não. */

class Fila {
    private int[] fila;
    private int inicio;
    private int fim;

    public Fila(int capacidade) {
        fila = new int[capacidade];
        inicio = 0;
        fim = -1;
    }

    public void adicionar(int valor) {
        /* 5 == 5  */
        if (fim == fila.length - 1) {
            System.out.println("Fila cheia!");
            System.out.println("----------------------------------------");
        } else {
            fim++;
            fila[fim] = valor;
        }
    }

    public void retirar() {
        if (inicio == fim) {
            System.out.println("Fila vazia!");
        } else {
            int valor = fila[inicio];
            inicio++;
            if (inicio == 0){
                System.out.println("Primeiro da fila: " + valor);
            }
            mostrar();
        }
    }

    public void mostrar() {
        System.out.println("Primeiro da fila: " + fila[inicio]);
        System.out.println("----------------------------------------");


        for (int i = inicio; i <= fim; i++) {
            System.out.println("Elementos da fila: " + fila[i]);
        }
        System.out.println("----------------------------------------");
    }

    public int quantidade() {
        return inicio + 1;
    }

    public boolean vazia() {
        return inicio == 0 ;
    }
}
