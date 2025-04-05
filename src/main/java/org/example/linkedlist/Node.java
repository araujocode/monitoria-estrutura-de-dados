package org.example.linkedlist;

/**
 * Classe que representa um nó da lista ligada, contendo um valor inteiro.
 * Cada nó guarda um valor e uma referência para o próximo nó da lista.
 */
public class Node {
    int data;   // Valor armazenado no nó
    Node next;  // Referência para o próximo nó da lista

    // Construtor que inicializa o nó com um valor inteiro
    public Node(int data) {
        this.data = data;  // Atribui o valor ao nó
        this.next = null;  // Inicializa o próximo nó como nulo (não há próximo nó ainda)
    }
}
