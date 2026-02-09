package com.palindromo.stack;



import com.palindromo.node.Node;

public class CharStack {
   private Node top;

   int count = 0;

   public void push(char next){
    Node newNode = new Node(next);
    newNode.setNext(top);
    top = newNode;

    count++;
   }

   public char pop(){
    if (isEmpty()) {
        throw new RuntimeException("Stack is empty");
        }
    char newNode = top.getValue();
    top = top.getNext();
    count--;
    
    return newNode;
   }

   public boolean isEmpty(){
    return top == null;
   }
}


