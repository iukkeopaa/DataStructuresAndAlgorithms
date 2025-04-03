import java.util.Arrays;

public class FixedSizeOrderedArray {
    private int[] array;
    private int size;
    private int capacity;

    public FixedSizeOrderedArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.size = 0;
    }

    public boolean add(int value) {
        if (size == capacity) {
            return false;
        }
        int index = 0;
        while (index < size && array[index] < value) {
            index++;
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
        return true;
    }

    public boolean remove(int value) {
        int index = findIndex(value);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return true;
    }

    public boolean update(int oldValue, int newValue) {
        if (remove(oldValue)) {
            return add(newValue);
        }
        return false;
    }

    private int findIndex(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, size));
    }

    public static void main(String[] args) {
        FixedSizeOrderedArray orderedArray = new FixedSizeOrderedArray(5);
        orderedArray.add(3);
        orderedArray.add(1);
        orderedArray.add(2);
        System.out.println(orderedArray); 
        orderedArray.remove(2);
        System.out.println(orderedArray); 
        orderedArray.update(1, 4);
        System.out.println(orderedArray); 
    }
}    