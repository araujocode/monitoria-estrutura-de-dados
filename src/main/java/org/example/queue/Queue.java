package org.example.queue;

/**
 * Fila simples usando array
 */
public class Queue {
    private int maxSize;     // Tamanho máximo da fila
    private int[] queueArray; // Array que armazena os elementos
    private int front;       // Índice do início da fila
    private int rear;        // Índice do final da fila
    private int count;       // Quantidade de elementos na fila

    // Construtor - inicializa a fila
    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;  // Começa no início
        rear = -1;  // Ainda não tem elementos
        count = 0;  // Fila começa vazia
    }

    // Adiciona um elemento no final da fila
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("A fila está cheia. Não é possível adicionar.");
        } else {
            rear = (rear + 1) % maxSize; // Movimento circular
            queueArray[rear] = value;
            count++;
        }
    }

    // Remove e retorna o elemento do início da fila
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("A fila está vazia. Não é possível remover.");
            return -1;
        } else {
            int value = queueArray[front];
            front = (front + 1) % maxSize; // Movimento circular
            count--;
            return value;
        }
    }

    // Retorna o elemento do início sem remover
    public int peek() {
        if (isEmpty()) {
            System.out.println("A fila está vazia. Nenhum elemento no início.");
            return -1;
        } else {
            return queueArray[front];
        }
    }

    // Mostra todos os elementos da fila
    public void display() {
        if (isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.print("Elementos na fila: ");
            for (int i = 0; i < count; i++) {
                int index = (front + i) % maxSize;
                System.out.print(queueArray[index] + " ");
            }
            System.out.println(); // Nova linha
        }
    }

    // Verifica se a fila está vazia
    public boolean isEmpty() {
        return count == 0;
    }

    // Verifica se a fila está cheia
    public boolean isFull() {
        return count == maxSize;
    }
}
