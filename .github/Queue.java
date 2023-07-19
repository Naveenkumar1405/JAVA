import java.util.LinkedList;
import java.util.Queue;

Queue<Integer> queue = new LinkedList<>();

// Enqueue elements
queue.offer(10);
queue.offer(20);
queue.offer(30);

// Dequeue elements
int element = queue.poll(); // Removes and returns the front element (10)
System.out.println(element); // Output: 10

// Peeking at the front element without removing it
int frontElement = queue.peek();
System.out.println(frontElement); // Output: 20

class Queue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int element) {
        if (size == capacity) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        int element = queue[front];
        front = (front + 1) % capacity;
        size--;
        return element;
    }

    public int peek() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
