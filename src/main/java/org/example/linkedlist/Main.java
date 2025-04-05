package org.example.linkedlist;

/**
 * Classe principal para executar o exemplo da lista ligada.
 */
public class Main {
    public static void main(String[] args) {
        // Cria uma nova lista ligada para inteiros
        LinkedList list = new LinkedList();

        // Adiciona alguns elementos à lista
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Lista inicial:");
        list.printList(); // Imprime os elementos da lista

        // Remove o elemento 20 da lista
        list.remove(20);

        System.out.println("Lista após remover o elemento 20:");
        list.printList(); // Imprime a lista atualizada
    }
}
