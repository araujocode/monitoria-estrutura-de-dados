/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.stack;

/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(5); // Cria uma pilha com tamanho 5

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        myStack.display(); // Deve mostrar: 10 20 30

        System.out.println("Removido do topo: " + myStack.pop()); // Remove 30
        myStack.display(); // Agora: 10 20

        System.out.println("Elemento no topo: " + myStack.peek()); // Deve mostrar 20    
    }    
}
