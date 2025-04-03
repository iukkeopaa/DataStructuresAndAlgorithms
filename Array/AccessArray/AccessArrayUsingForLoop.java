package AccessArray;

public class AccessArrayUsingForLoop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("索引 " + i + " 处的元素: " + numbers[i]);
        }
    }
}