import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void bucketSort(double[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        // 确定桶的数量
        int numBuckets = arr.length;
        List<List<Double>> buckets = new ArrayList<>(numBuckets);
        for (int i = 0; i < numBuckets; i++) {
            buckets.add(new ArrayList<>());
        }
        // 找到数组中的最大值和最小值
        double max = arr[0];
        double min = arr[0];
        for (double num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        // 将元素分配到不同的桶中
        for (double num : arr) {
            int bucketIndex = (int) ((num - min) / (max - min) * (numBuckets - 1));
            buckets.get(bucketIndex).add(num);
        }
        // 对每个桶内的元素进行排序
        for (List<Double> bucket : buckets) {
            Collections.sort(bucket);
        }
        // 将桶中的元素依次放回原数组
        int index = 0;
        for (List<Double> bucket : buckets) {
            for (double num : bucket) {
                arr[index++] = num;
            }
        }
    }

    public static void main(String[] args) {
        double[] arr = {0.42, 0.32, 0.33, 0.52, 0.37, 0.47, 0.51};
        bucketSort(arr);
        for (double num : arr) {
            System.out.print(num + " ");
        }
    }
}    