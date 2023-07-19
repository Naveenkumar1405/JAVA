import java.util.Stack;

Stack<Integer> stack = new Stack<>();

// Pushing elements onto the stack
stack.push(10);
stack.push(20);
stack.push(30);

// Popping elements from the stack
int element = stack.pop(); // Removes and returns the top element (30)
System.out.println(element); // Output: 30

// Peeking at the top element without removing it
int topElement = stack.peek();
System.out.println(topElement); // Output: 20

class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    Stack(int capacity) {
        stack = new int[capacity];
        top = -1;
        this.capacity = capacity;
    }

    public void push(int element) {
        if (top == capacity - 1) {
            throw new IllegalStateException("Stack is full");
        }
        stack[++top] = element;
    }

    public int pop() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top--];
    }

    public int peek() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
