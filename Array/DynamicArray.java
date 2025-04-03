import java.util.Arrays;

public class DynamicArray {
    private int[] array;
    private int capacity;
    private int size;

    public DynamicArray() {
        this.capacity = 1;
        this.size = 0;
        this.array = new int[capacity];
    }

    public void append(int value) {
        if (size == capacity) {
            resize(2 * capacity);
        }
        array[size] = value;
        size++;
    }

    // 头部插入元素
    public void insertAtBeginning(int value) {
        if (size == capacity) {
            resize(2 * capacity);
        }
        // 将所有元素后移一位
        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = value;
        size++;
    }

    // 尾部插入元素，复用 append 方法
    public void insertAtEnd(int value) {
        append(value);
    }

    private void resize(int newCapacity) {
        int[] newArray = new int[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        capacity = newCapacity;
    }

    // 根据索引查找元素
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    // 根据索引删除元素
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        // 将索引之后的元素依次向前移动一位
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    // 打印数组中的所有元素
    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.insertAtBeginning(0);
        dynamicArray.insertAtEnd(4);
        dynamicArray.append(5);
        // 删除索引为 1 的元素
        dynamicArray.remove(1);
        // 打印所有元素
        dynamicArray.printAll();
    }
}    