import java.util.Arrays;

/**
 * @Description: 快速排序
 * @Author: wjh
 * @Date: 2025/4/3 上午10:14
 */
public class quickSort {
    // 快速排序
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args){
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] arrCopy = arr.clone();
        quickSort(arrCopy, 0, arrCopy.length - 1);
        System.out.println("快速排序结果: " + Arrays.toString(arrCopy));

    }
}
