package org.example.treestructures;

/*
 * =============================================================
 * CONCEITO DE ÁRVORE BINÁRIA
 * -------------------------------------------------------------
 * Uma árvore binária é uma estrutura de dados em forma de hierarquia,
 * composta por "nós" (nodes), onde cada nó pode ter no máximo dois filhos:
 * um à esquerda (left) e um à direita (right).
 *
 * O primeiro nó da árvore é chamado de "raiz" (root).
 * Cada nó pode levar a outros nós, formando uma estrutura em forma de árvore.
 *
 * Árvores binárias de busca (BST - Binary Search Tree) seguem esta regra:
 * - Valores menores que o nó atual ficam à esquerda
 * - Valores maiores ficam à direita
 *
 * =============================================================
 * ELEMENTOS FUNDAMENTAIS DE UMA ÁRVORE
 * -------------------------------------------------------------
 * - Raiz (Root): O primeiro nó da árvore.
 * - Nó (Node): Cada elemento da árvore.
 * - Filho (Child): Um nó abaixo de outro nó.
 * - Pai (Parent): Um nó acima de outro nó.
 * - Folha (Leaf): Um nó que não possui filhos.
 * - Subárvore (Subtree): Uma árvore dentro da árvore, começando em qualquer nó.
 * - Nível (Level): A raiz está no nível 0, seus filhos no nível 1, e assim por diante.
 * - Profundidade (Depth): A distância da raiz até um nó específico.
 * - Altura (Height): A maior profundidade da árvore (da raiz até a folha mais distante).
 *
 * =============================================================
 * TIPOS DE PERCURSOS (TRAVESSIAS)
 * -------------------------------------------------------------
 * Durante os percursos, visitamos os nós da árvore numa ordem específica:
 *
 * 1. PRÉ-ORDEM (pre-order):        raiz → esquerda → direita
 * 2. EM ORDEM (in-order):          esquerda → raiz → direita
 *    - Quando aplicada em uma BST, resulta em uma lista ordenada
 * 3. PÓS-ORDEM (post-order):       esquerda → direita → raiz
 *
 * Esses percursos são úteis para diversas operações, como imprimir, copiar,
 * liberar memória ou avaliar expressões.
 *
 * =============================================================
 * EXEMPLO DE ESTRUTURA:
 *
 *            10           <- raiz
 *           /  \
 *         5     15
 *        / \    / \
 *       3   7  12  18     <- folhas: 3, 7, 12, 18
 *
 * Altura da árvore = 2
 * Nível do nó 7 = 2
 * Profundidade do nó 12 = 2
 * =============================================================
 */

// Classe que representa um nó da árvore binária
public class Node {
    int value;       // Valor armazenado no nó
    Node left;       // Referência para o filho à esquerda
    Node right;      // Referência para o filho à direita

    // Construtor: cria um nó com um valor
    public Node(int value) {
        this.value = value;     // Define o valor do nó
        this.left = null;       // Inicialmente, o nó não tem filho à esquerda
        this.right = null;      // Nem filho à direita
    }
}
