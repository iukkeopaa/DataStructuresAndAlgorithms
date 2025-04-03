package DeleteFromArray;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int deleteIndex = 2;

        // 创建一个新数组，长度比原数组小 1
        int[] newArray = new int[originalArray.length - 1];

        // 复制指定位置之前的元素
        for (int i = 0; i < deleteIndex; i++) {
            newArray[i] = originalArray[i];
        }

        // 复制指定位置之后的元素
        for (int i = deleteIndex; i < originalArray.length - 1; i++) {
            newArray[i] = originalArray[i + 1];
        }

        // 输出新数组
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}