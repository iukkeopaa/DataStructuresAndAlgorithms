package CreateArray;

// 示例代码
public class DynamicArrayInitialization {
    public static void main(String[] args) {
        // 声明并初始化一个长度为5的整型数组
        int[] numbers = new int[5];
        // 为数组元素赋值
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        // 遍历数组并打印元素
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}