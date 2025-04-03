public class BinarySearch {
    // 迭代方式实现二分查找
    public static int iterativeBinarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // 递归方式实现二分查找
    public static int recursiveBinarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return recursiveBinarySearch(arr, target, mid + 1, right);
        } else {
            return recursiveBinarySearch(arr, target, left, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        // 测试迭代二分查找
        int iterativeResult = iterativeBinarySearch(arr, target);
        System.out.println("迭代二分查找结果: " + iterativeResult);
        // 测试递归二分查找
        int recursiveResult = recursiveBinarySearch(arr, target, 0, arr.length - 1);
        System.out.println("递归二分查找结果: " + recursiveResult);
    }
}    