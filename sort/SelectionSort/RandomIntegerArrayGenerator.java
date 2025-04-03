package SelectionSort;

import java.util.Random;

public class RandomIntegerArrayGenerator {
    public static Integer[] generateRandomArray(int n, int rangeL, int rangeR) {
        if (rangeL > rangeR) {
            throw new IllegalArgumentException("范围下限不能大于范围上限");
        }
        Integer[] arr = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(rangeR - rangeL + 1) + rangeL;
        }
        return arr;
    }


    public static void printArray(Object arr[]) {

        for (int i = 0; i < arr.length; i++){
            System.out.print( arr[i] );
            System.out.print( ' ' );
        }
        System.out.println();

        return;
    }
    // 判断arr数组是否有序
    public static boolean isSorted(Comparable[] arr){

        for( int i = 0 ; i < arr.length - 1 ; i ++ )
            if( arr[i].compareTo(arr[i+1]) > 0 )
                return false;
        return true;
    }

    public static void main(String[] args) {
        int N = 20;
        Integer[] ints = RandomIntegerArrayGenerator.generateRandomArray(N, 0, 100000);


        for (Integer num : ints) {
            System.out.print(num + " ");
        }


    }
}    