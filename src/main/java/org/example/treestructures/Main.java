package org.example.treestructures;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        System.out.println("Inserindo valores: 50, 30, 70, 20, 40, 60, 80");
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        tree.inOrder();     // Deve imprimir: 20 30 40 50 60 70 80
        tree.preOrder();    // Deve imprimir: 50 30 20 40 70 60 80
        tree.postOrder();   // Deve imprimir: 20 40 30 60 80 70 50

        System.out.println("\nBuscando valor 60: " + (tree.search(60) ? "Encontrado" : "Não encontrado"));
        System.out.println("Buscando valor 25: " + (tree.search(25) ? "Encontrado" : "Não encontrado"));

        System.out.println("\nRemovendo 20 (nó folha)");
        tree.remove(20);
        tree.inOrder();

        System.out.println("\nRemovendo 30 (nó com um filho)");
        tree.remove(30);
        tree.inOrder();

        System.out.println("\nRemovendo 50 (nó com dois filhos)");
        tree.remove(50);
        tree.inOrder();
    }
}
