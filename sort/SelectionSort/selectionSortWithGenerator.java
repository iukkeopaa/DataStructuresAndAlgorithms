package SelectionSort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description:
 * @Author: wjh
 * @Date: 2025/4/3 下午3:42
 */
public class selectionSortWithGenerator {

    public static <T> void selectionSort(T[] arr, Comparator<T> comparator) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(arr[j], arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                T temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args){
        int N = 20000;
        Integer[] ints = RandomIntegerArrayGenerator.generateRandomArray(N, 0, 100000);
        selectionSort(ints, Comparator.naturalOrder());
        System.out.println("选择排序结果: " + Arrays.toString(ints));


    }
}
