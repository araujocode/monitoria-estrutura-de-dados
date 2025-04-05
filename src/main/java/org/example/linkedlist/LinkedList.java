package org.example.linkedlist;

/**
 * Implementação simples de uma lista ligada para inteiros.
 * Em uma lista ligada, cada nó contém um valor e uma referência para o próximo nó.
 */
public class LinkedList {
    private Node head; // Variável que guarda a referência para o primeiro nó da lista

    // Construtor que cria uma lista vazia (sem nenhum nó)
    public LinkedList() {
        this.head = null;
    }

    /**
     * Adiciona um novo elemento no final da lista.
     *
     * Explicação:
     * 1. Cria um novo nó com o valor passado.
     * 2. Se a lista estiver vazia (head é nulo), o novo nó se torna o primeiro nó.
     * 3. Se a lista não estiver vazia, percorre os nós a partir do head até encontrar o último nó (onde next é nulo).
     * 4. Adiciona o novo nó ao final da lista.
     *
     * @param data - valor inteiro a ser adicionado no novo nó
     */
    public void add(int data) {
        // Cria um novo nó encapsulando o valor passado
        Node newNode = new Node(data);

        // Verifica se a lista está vazia (nenhum nó foi adicionado ainda)
        if (head == null) {
            head = newNode;  // Se estiver vazia, o novo nó se torna o head (primeiro nó)
            return;
        }

        // Se a lista não estiver vazia, inicializa uma variável para percorrer a lista a partir do head
        Node current = head;

        // Percorre a lista até encontrar o último nó (current.next == null)
        while (current.next != null) {
            current = current.next; // Avança para o próximo nó
        }

        // Adiciona o novo nó como o próximo do último nó encontrado
        current.next = newNode;
    }

    /**
     * Remove o primeiro nó que contém o valor especificado.
     *
     * Explicação:
     * 1. Verifica se a lista está vazia; se estiver, não há o que remover.
     * 2. Se o primeiro nó (head) contém o valor, atualiza o head para o próximo nó.
     * 3. Se o valor não estiver no primeiro nó, percorre a lista procurando o nó cujo próximo nó possui o valor.
     * 4. Quando encontrado, "pula" esse nó, ajustando a referência do nó anterior para o nó seguinte.
     *
     * @param data - valor inteiro que deve ser removido da lista
     * @return true se o nó foi encontrado e removido, false caso contrário
     */
    public boolean remove(int data) {
        // Verifica se a lista está vazia
        if (head == null) {
            return false; // Não há nenhum nó para remover
        }

        // Verifica se o primeiro nó contém o valor a ser removido
        if (head.data == data) {
            head = head.next; // Atualiza o head para o próximo nó, removendo o primeiro
            return true;
        }

        // Inicializa uma variável para percorrer a lista a partir do head
        Node current = head;

        // Percorre a lista enquanto houver um próximo nó
        while (current.next != null) {
            // Verifica se o próximo nó contém o valor desejado
            if (current.next.data == data) {
                // Remove o nó "pulando" sua referência
                current.next = current.next.next;
                return true;
            }
            // Avança para o próximo nó
            current = current.next;
        }
        // Se nenhum nó com o valor foi encontrado, retorna false
        return false;
    }

    /**
     * Imprime todos os elementos da lista.
     *
     * Explicação:
     * 1. Inicia pelo primeiro nó (head) e, enquanto houver nós, imprime o valor de cada nó.
     * 2. Avança para o próximo nó até que não haja mais nós (quando current se torna nulo).
     */
    public void printList() {
        // Inicializa a variável current com o primeiro nó da lista
        Node current = head;

        // Percorre a lista enquanto houver nós
        while (current != null) {
            // Imprime o valor armazenado no nó atual
            System.out.println(current.data);
            // Avança para o próximo nó
            current = current.next;
        }
    }
}
