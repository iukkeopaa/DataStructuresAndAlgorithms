package AccessArray;

public class AccessArrayUsingWhileLoop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int index = 0;
        while (index < numbers.length) {
            System.out.println("索引 " + index + " 处的元素: " + numbers[index]);
            index++;
        }
    }
}