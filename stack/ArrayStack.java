package stack;

import java.util.*;

class ArrayStack {
    int[] arr; // array
    int cap; // capacity of the stack
    int top; // index of the top item

    ArrayStack(int n) {
        cap = n;
        arr = new int[cap];
        top = -1;
    }

    void push(int x) {
        top++;
        arr[top] = x;
    }

    int pop() {
        int res = arr[top];
        top--;
        return res;
    }

    int size() {
        return top + 1;
    }

    boolean empty() {
        return top == -1;
    }

    int peek() {
        return arr[top];
    }
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayStack as = new ArrayStack(5);
        as.push(10);
        as.push(15);
        as.push(20);
        as.push(25);
        System.out.println("Size of Stack: " + as.size());
        System.out.println("Top Element: " + as.peek());
        System.out.println("Element Removed: " + as.pop());
        System.out.println("Size of Stack: " + as.size());
        System.out.println("Top Element: " + as.peek());
        System.out.println(as.empty());
        sc.close();
    }
}