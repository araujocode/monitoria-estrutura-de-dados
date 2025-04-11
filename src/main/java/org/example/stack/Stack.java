package org.example.stack;

/**
 *
 * @author Bruno
 */
public class Stack {
    private int maxSize;      // Tamanho máximo da pilha
    private int[] stackArray; // Array que armazena os elementos da pilha
    private int top;          // Índice do topo da pilha

    // Construtor - define o tamanho da pilha e inicializa os atributos
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Começa vazia, então o topo é -1
    }

    // Método para adicionar um elemento na pilha
    public void push(int value) {
        if (isFull()) {
            System.out.println("A pilha está cheia. Não é possível adicionar o valor.");
        } else {
            top++; // Move o topo pra cima
            stackArray[top] = value; // Adiciona o valor no topo
        }
    }

    // Método para remover e retornar o elemento do topo
    public int pop() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia. Não é possível remover.");
            return -1; // Valor de erro
        } else {
            int value = stackArray[top]; // Pega o valor do topo
            top--; // Diminui o topo
            return value; // Retorna o valor retirado
        }
    }

    // Método para ver o valor do topo sem remover
    public int peek() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia. Nenhum elemento no topo.");
            return -1;
        } else {
            return stackArray[top]; // Retorna o valor do topo
        }
    }

    // Verifica se a pilha está vazia
    public boolean isEmpty() {
        return top == -1;
    }

    // Verifica se a pilha está cheia
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Mostra todos os elementos da pilha
    public void display() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.print("Elementos na pilha: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println(); // Nova linha
        }
    }
}
