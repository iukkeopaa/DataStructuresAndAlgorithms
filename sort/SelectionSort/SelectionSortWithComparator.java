package SelectionSort;

import java.util.Comparator;

public class SelectionSortWithComparator {

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

    public static void main(String[] args) {
        Integer[] arr = {5, 3, 8, 4, 2};
        Double[] doubliearr = {4.4, 3.3, 2.2, 1.1};
        String[] stringarr = {"D", "C", "B", "A"};

        // 使用默认比较器进行升序排序
        selectionSort(arr, Comparator.naturalOrder());
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();



        // 使用自定义比较器进行降序排序
        selectionSort(arr, (a, b) -> b - a);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}    