package org.example.treestructures;

public class BinarySearchTree {
    private Node root; // A raiz da árvore. Começa nula.

    // Método para inserir um valor na árvore
    public void insert(int value) {
        // Chama o método recursivo de inserção, começando pela raiz
        root = insertRecursive(root, value);
    }

    // Método recursivo que percorre a árvore até encontrar o local correto para inserir
    private Node insertRecursive(Node current, int value) {
        // Se o local está vazio, cria um novo nó com o valor
        if (current == null) return new Node(value);

        // Se o valor for menor, insere à esquerda
        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        }
        // Se o valor for maior, insere à direita
        else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        }

        // Retorna o nó atual para manter a ligação na árvore
        return current;
    }

    // Método para buscar um valor na árvore
    public boolean search(int value) {
        // Chama o método recursivo de busca
        return searchRecursive(root, value);
    }

    // Busca recursiva
    private boolean searchRecursive(Node current, int value) {
        // Se chegou numa folha sem encontrar, retorna falso
        if (current == null) return false;

        // Se encontrou o valor, retorna verdadeiro
        if (value == current.value) return true;

        // Se o valor for menor, procura à esquerda; se for maior, à direita
        return value < current.value
            ? searchRecursive(current.left, value)
            : searchRecursive(current.right, value);
    }

    // Método para remover um valor da árvore
    public void remove(int value) {
        // Chama o método recursivo de remoção
        root = removeRecursive(root, value);
    }

    // Método recursivo para remoção
    private Node removeRecursive(Node current, int value) {
        // Se a árvore está vazia ou não encontrou o valor, retorna null
        if (current == null) return null;

        if (value < current.value) {
            // Vai para a esquerda
            current.left = removeRecursive(current.left, value);
            return current;
        }

        if (value > current.value) {
            // Vai para a direita
            current.right = removeRecursive(current.right, value);
            return current;
        }

        // Encontrou o nó que deve ser removido

        // Caso 1: o nó não tem filhos (é uma folha)
        if (current.left == null && current.right == null) return null;

        // Caso 2: o nó tem apenas um filho
        if (current.left == null) return current.right;
        if (current.right == null) return current.left;

        // Caso 3: o nó tem dois filhos
        // Encontra o menor valor na subárvore da direita (sucessor)
        int minValue = findMinValue(current.right);

        // Substitui o valor atual pelo menor valor da subárvore direita
        current.value = minValue;

        // Remove o nó duplicado (menor valor da direita)
        current.right = removeRecursive(current.right, minValue);

        return current;
    }

    // Método auxiliar para encontrar o menor valor em uma subárvore
    private int findMinValue(Node node) {
        // O menor valor estará sempre à esquerda
        while (node.left != null) {
            node = node.left;
        }
        return node.value;
    }

    // Mostra os elementos da árvore em ordem (esquerda -> raiz -> direita)
    public void inOrder() {
        System.out.print("Em ordem: ");
        inOrderRecursive(root);
        System.out.println();
    }

    private void inOrderRecursive(Node node) {
        if (node == null) return;

        inOrderRecursive(node.left);           // Visita a subárvore esquerda
        System.out.print(node.value + " ");    // Visita o nó atual
        inOrderRecursive(node.right);          // Visita a subárvore direita
    }

    // Mostra os elementos em pré-ordem (raiz -> esquerda -> direita)
    public void preOrder() {
        System.out.print("Pré-ordem: ");
        preOrderRecursive(root);
        System.out.println();
    }

    private void preOrderRecursive(Node node) {
        if (node == null) return;

        System.out.print(node.value + " ");    // Visita o nó atual
        preOrderRecursive(node.left);          // Visita a subárvore esquerda
        preOrderRecursive(node.right);         // Visita a subárvore direita
    }

    // Mostra os elementos em pós-ordem (esquerda -> direita -> raiz)
    public void postOrder() {
        System.out.print("Pós-ordem: ");
        postOrderRecursive(root);
        System.out.println();
    }

    private void postOrderRecursive(Node node) {
        if (node == null) return;

        postOrderRecursive(node.left);         // Visita a subárvore esquerda
        postOrderRecursive(node.right);        // Visita a subárvore direita
        System.out.print(node.value + " ");    // Visita o nó atual
    }
}
