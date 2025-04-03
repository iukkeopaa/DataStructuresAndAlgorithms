package SelectionSort;

import java.util.Arrays;

/**
 * @Description: 选择排序
 * @Author: wjh
 * @Date: 2025/4/3 上午10:12
 */
public class selectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            //swap(arr, i, minIndex)
        }
    }


    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args){
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] arrCopy = arr.clone();
        selectionSort(arrCopy);
        System.out.println("选择排序结果: " + Arrays.toString(arrCopy));

    }
}
