package stack;

class MyStack {
    private int[] stack;
    private int top;
    private int capacity;

    public MyStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("stack overflow");
        } else {
            stack[++top] = value;
        }

    }

    public int pop() {
        if (top == -1) {
            System.out.println("stack underflow");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("stack is empty");
            return -1;
        } else {
            return stack[top];
        }
    }

}

public class ExampleStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
    }

}
