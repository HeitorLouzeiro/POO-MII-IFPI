/* 1) A pilha é uma das estruturas de dados e trabalha com o formato LIFO (o último 
a entrar é o primeiro a sair, “Last In, First Out”, em inglês). Um exemplo prático 
de pilha é uma pilha de livros, em que o primeiro livro que foi inserido na pilha, 
normalmente é o último que sai dela, enquanto o último adicionado é o primeiro 
a ser retirado. Crie uma classe Pilha que deve ter um construtor que cria uma 
pilha de números inteiros com capacidade de X elementos. Além disso, a pilha 
deve ter os métodos para empilhar, desempilhar, indicar quantos elementos a 
pilha possui e dizer se a pilha está vazia ou não.   */

class Pilha {
    private int[] pilha;
    private int topo;

    public Pilha(int capacidade) {
        pilha = new int[capacidade];
        topo = -1;
    }

    public void empilhar(int valor) {
        if (topo == pilha.length - 1) {
            System.out.println("Pilha cheia!");
            System.out.println("----------------------------------------");
        } else {
            topo++;
            pilha[topo] = valor;
        }
    }

    public void desempilhar() {
        if (topo == 0) {
            System.out.println("Pilha vazia!");
        } else {
            int valor = pilha[topo] - 1; // Salva o valor do topo da pilha antes da remoção
            topo--; // Remove o topo da pilha
            
            System.out.println("Pilha desempilhada!"); // Mostra a quantidade de elementos após a remoção
            System.out.println("----------------------------------------");

            System.out.println("Topo da pilha: " + valor); // Mostra o topo após a remoção
            System.out.println("----------------------------------------");
            mostrar(); // Exibe a pilha atualizada
        }
    }

    public void mostrar() {
        for (int i = topo; i >= 0; i--) {
            System.out.println("Elementos da pilha: " + pilha[i]);
        }
        System.out.println("----------------------------------------");
    }

    public int quantidade() {
        return topo + 1;
    }

    public boolean vazia() {
        return topo == 0;
    }
}


