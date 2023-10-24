/* 3) Crie uma classe Main para criar e testar as classes Pilha e Fila. */

public class App {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        
        pilha.empilhar(1);
        pilha.empilhar(2);
        pilha.empilhar(3);
        pilha.empilhar(4);
        pilha.empilhar(5);
        
        /* Para indicar que a pilha está cheia */
        pilha.empilhar(6);


        pilha.mostrar();

        pilha.desempilhar(); // Ao chamar desempilhar, removerá o topo da pilha e mostrará o novo topo

        pilha.desempilhar(); // removerá o topo 3 da pilha e mostrará o novo topo
        pilha.desempilhar(); // removerá o topo 2 da pilha e mostrará o novo topo
        pilha.desempilhar(); // removerá o topo 1 da pilha e mostrará o novo topo

        pilha.desempilhar(); // removerá o topo 1 da pilha e mostrará pilha Vazia
        
        System.out.println("===================================================");
        Fila fila = new Fila(5); 

        fila.adicionar(1);
        fila.adicionar(2);
        fila.adicionar(3);
        fila.adicionar(4);
        fila.adicionar(5);
        
        /* fila.adicionar(6); */ // Para indicar que a fila está cheia


        fila.mostrar();

        fila.retirar(); // Ao chamar retirar, removerá o primeiro da fila e mostrará o novo primeiro
        fila.retirar(); // Ao chamar retirar, ira tira o elemento 2 da fila e mostrará o novo primeiro
        fila.retirar(); // Ao chamar retirar, ira tira o elemento 3 da fila e mostrará o novo primeiro
        fila.retirar(); // Ao chamar retirar, ira tira o elemento 4 da fila e mostrará o novo primeiro

        fila.retirar(); // Ao chamar retirar, ira tira o elemento 5 da fila e mostrará fila Vazia


    }
}