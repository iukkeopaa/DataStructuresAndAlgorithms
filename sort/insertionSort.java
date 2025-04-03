import java.util.Arrays;

/**
 * @Description: 插入排序
 * @Author: wjh
 * @Date: 2025/4/3 上午10:13
 */
public class insertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        //写法1
        // for( int j = i ; j > 0 ; j -- )
        ////                if( arr[j].compareTo( arr[j-1] ) < 0 )
        ////                    swap( arr, j , j-1 );
        ////                else
        ////                    break;


        //  // 写法2
        //            for( int j = i; j > 0 && arr[j].compareTo(arr[j-1]) < 0 ; j--)
        //                swap(arr, j, j-1);
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args){
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] arrCopy = arr.clone();
        insertionSort(arrCopy);
        System.out.println("插入排序结果: " + Arrays.toString(arrCopy));

    }
}
