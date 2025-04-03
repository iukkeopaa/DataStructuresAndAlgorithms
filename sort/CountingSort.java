public class CountingSort {
    public static void countingSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int max = arr[0];
        int min = arr[0];
        // 找出数组中的最大值和最小值
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int range = max - min + 1;
        int[] count = new int[range];
        // 统计每个元素出现的次数
        for (int num : arr) {
            count[num - min]++;
        }
        int index = 0;
        // 将排序好的元素放回原数组
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                arr[index++] = i + min;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}    