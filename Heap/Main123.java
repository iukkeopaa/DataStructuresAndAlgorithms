import java.util.Arrays;

class MaxHeap1 {
    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeap1(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int leftChild(int i) {
        return 2 * i + 1;
    }

    private int rightChild(int i) {
        return 2 * i + 2;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void heapifyUp(int i) {
        while (i > 0 && heap[parent(i)] < heap[i]) {
            swap(parent(i), i);
            i = parent(i);
        }
    }

    private void heapifyDown(int i) {
        int largest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }

        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(i, largest);
            heapifyDown(largest);
        }
    }

    public void insert(int key) {
        if (size == capacity) {
            throw new IllegalStateException("Heap is full");
        }

        heap[size] = key;
        size++;
        heapifyUp(size - 1);
    }

    public int extractMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }

        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return max;
    }

    public int getMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap[0];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(heap, size));
    }
}

public class Main123 {
    public static void main(String[] args) {
        MaxHeap1 maxHeap = new MaxHeap1(10);
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(15);
        maxHeap.insert(30);
        System.out.println("Heap: " + maxHeap);
        System.out.println("Max: " + maxHeap.getMax());
        System.out.println("Extracted Max: " + maxHeap.extractMax());
        System.out.println("Heap after extraction: " + maxHeap);
    }
}    