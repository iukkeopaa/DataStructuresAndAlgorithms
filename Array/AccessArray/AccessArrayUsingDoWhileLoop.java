package AccessArray;

public class AccessArrayUsingDoWhileLoop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int index = 0;
        do {
            System.out.println("索引 " + index + " 处的元素: " + numbers[index]);
            index++;
        } while (index < numbers.length);
    }
}