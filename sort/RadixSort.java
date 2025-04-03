import java.util.Arrays;

public class RadixSort {
    public static void radixSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        // 找到数组中的最大值，确定最大位数
        int max = Arrays.stream(arr).max().getAsInt();

        // 从个位开始，对每一位进行计数排序
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(arr, exp);
        }
    }

    private static void countingSortByDigit(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // 统计每个数字在当前位上出现的次数
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // 计算累积次数
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // 根据累积次数将元素放入输出数组
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // 将输出数组复制回原数组
        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}    