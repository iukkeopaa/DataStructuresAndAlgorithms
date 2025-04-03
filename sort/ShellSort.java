public class ShellSort {
    public static void shellSort(int[] arr) {
        int n = arr.length;
        // 初始增量为数组长度的一半
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // 对每个子序列进行插入排序
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 3};
        System.out.println("排序前的数组：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        shellSort(arr);
        System.out.println("\n排序后的数组：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}    