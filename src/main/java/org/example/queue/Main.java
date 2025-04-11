package org.example.queue;

/**
 * Testando a fila
 */
public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5); // Cria uma fila com tamanho 5

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);

        myQueue.display(); // Deve mostrar: 10 20 30

        System.out.println("Removido da fila: " + myQueue.dequeue()); // Remove 10
        myQueue.display(); // Agora: 20 30

        System.out.println("Primeiro da fila: " + myQueue.peek()); // Deve mostrar 20
    }
}
