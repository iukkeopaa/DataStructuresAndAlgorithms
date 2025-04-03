package InsertToArray;

public class InsertAtEnd {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int elementToInsert = 6;

        // 创建一个新数组，长度比原数组大 1
        int[] newArray = new int[originalArray.length + 1];

        // 复制原数组元素到新数组
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        // 在新数组末尾插入元素
        newArray[newArray.length - 1] = elementToInsert;

        // 输出新数组
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}