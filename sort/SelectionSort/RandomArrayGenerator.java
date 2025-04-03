package SelectionSort;

import java.util.Random;

public class RandomArrayGenerator {
    public static int[] generateRandomArray(int n, int rangeL, int rangeR) {
        if (rangeL > rangeR) {
            throw new IllegalArgumentException("范围下限不能大于范围上限");
        }
        int[] arr = new int[n];
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

    public static void main(String[] args) {
        int n = 10; // 数组元素个数
        int rangeL = 1; // 随机数范围下限
        int rangeR = 100; // 随机数范围上限
        int[] randomArray = generateRandomArray(n, rangeL, rangeR);
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
    }
}    