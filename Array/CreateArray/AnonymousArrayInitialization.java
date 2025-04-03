package CreateArray;

// 示例代码
public class AnonymousArrayInitialization {
    public static void main(String[] args) {
        // 调用printArray方法并传入匿名数组
        printArray(new int[]{1, 2, 3, 4, 5});
    }
    public static void printArray(int[] array) {
        // 遍历数组并打印元素
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}