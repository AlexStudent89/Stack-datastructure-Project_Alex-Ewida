//StackLinkedList
package Stacks;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class StackLinkedList {
    Node top;

    public StackLinkedList() {
        this.top = null;
        System.out.println("The stack is created using LinkedList");
    }

    // Check if it is empty
    public boolean isEmpty() {
        if (top == null) {
            System.out.println("Stack is empty");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    }

    // Implement a push method
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println("The value " + value + " is successfully inserted");
    }

    // Implement pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            int value = top.value;
            top = top.next;
            System.out.println("The value " + value + " is successfully removed");
            return value;
        }
    }

    // Implement peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            return top.value;
        }
    }

    // Implement delete a stack
    public void deleteStack() {
        top = null;
        System.out.println("The stack is successfully deleted");
    }

    public static void main(String[] args) {
        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        stackLinkedList.isEmpty();

        // Test the pop method
        stackLinkedList.pop();

        // Test the peek method
        System.out.println("Top of stack: " + stackLinkedList.peek());

        // Test the delete stack method
        stackLinkedList.deleteStack();
    }
}
