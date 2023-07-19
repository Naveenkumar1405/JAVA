import java.util.PriorityQueue;

PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Min-Heap

// Inserting elements into the heap
minHeap.offer(10);
minHeap.offer(30);
minHeap.offer(20);

// Retrieving the minimum element
int minElement = minHeap.poll(); // Removes and returns the minimum element (10)
System.out.println(minElement); // Output: 10


import java.util.PriorityQueue;

class Heap {
    private PriorityQueue<Integer> minHeap;

    Heap() {
        minHeap = new PriorityQueue<>();
    }

    public void insert(int element) {
        minHeap.offer(element);
    }

    public int remove() {
        if (minHeap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        return minHeap.poll();
    }

    public int peek() {
        if (minHeap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        return minHeap.peek();
    }
}
