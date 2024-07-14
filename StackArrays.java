//StackArrays
package Stacks;

public class StackArrays {
    int[] arr;
    int topOfStack;

    public StackArrays(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with a size of: " + size);
    }

    // Check if it is empty
    public boolean isEmpty() {
        if (topOfStack == -1) {
            System.out.println("Stack is empty");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    }

    // Check if stack is full
    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
            System.out.println("Stack is full");
            return true;
        } else {
            System.out.println("Stack is not full");
            return false;
        }
    }

    // Implement a push method
    public void push(int value) {
        if (isFull()) {
            System.out.println("The stack is full");
        } else {
            arr[++topOfStack] = value;
            System.out.println("The value is successfully inserted");
        }
    }

    // Implement pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            int value = arr[topOfStack--];
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
            return arr[topOfStack];
        }
    }

    // Implement delete a stack
    public void deleteStack() {
        arr = null;
        topOfStack = -1;
        System.out.println("The stack is successfully deleted");
    }

    // Use the stack data structure to check whether a word is a palindrome or not
    public static boolean isPalindrome(String word) {
        int size = word.length();
        StackArrays stack = new StackArrays(size);
        for (int i = 0; i < size; i++) {
            stack.push(word.charAt(i));
        }
        for (int i = 0; i < size; i++) {
            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        StackArrays stackArrays = new StackArrays(5);
        stackArrays.push(1);
        stackArrays.push(2);
        stackArrays.push(3);
        stackArrays.isEmpty();
        stackArrays.isFull();

        // Test pop method
        stackArrays.pop();

        // Test peek method
        System.out.println("Top of stack: " + stackArrays.peek());

        // Test delete stack method
        stackArrays.deleteStack();

        // Test palindrome check
        String word = "racecar";
        System.out.println("Is \"" + word + "\" a palindrome? " + StackArrays.isPalindrome(word));
    }
}
