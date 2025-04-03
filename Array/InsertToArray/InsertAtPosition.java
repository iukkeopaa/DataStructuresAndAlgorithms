package InsertToArray;

public class InsertAtPosition {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int elementToInsert = 6;
        int insertPosition = 2;

        // 创建一个新数组，长度比原数组大 1
        int[] newArray = new int[originalArray.length + 1];

        // 复制指定位置之前的元素
        for (int i = 0; i < insertPosition; i++) {
            newArray[i] = originalArray[i];
        }

        // 插入元素
        newArray[insertPosition] = elementToInsert;

        // 复制指定位置之后的元素
        for (int i = insertPosition; i < originalArray.length; i++) {
            newArray[i + 1] = originalArray[i];
        }

        // 输出新数组
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}