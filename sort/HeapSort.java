public class HeapSort {
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // 构建最大堆
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // 一个个交换元素
        for (int i = n - 1; i > 0; i--) {
            // 将堆顶元素（最大值）与当前未排序部分的最后一个元素交换
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // 重新调整堆，使其满足最大堆性质
            heapify(arr, i, 0);
        }
    }

    // 调整堆，使其满足最大堆性质
    static void heapify(int[] arr, int n, int i) {
        int largest = i; // 初始化根节点为最大值
        int left = 2 * i + 1; // 左子节点
        int right = 2 * i + 2; // 右子节点

        // 如果左子节点比根节点大，则更新最大值
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // 如果右子节点比最大值大，则更新最大值
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // 如果最大值不是根节点，则交换并继续调整
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // 递归调整受影响的子树
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        heapSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}    