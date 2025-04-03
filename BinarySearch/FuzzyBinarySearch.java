public class FuzzyBinarySearch {
    public static int fuzzyBinarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 6;
        int index = fuzzyBinarySearch(arr, target);
        if (index != -1) {
            System.out.println("大于等于 " + target + " 的第一个元素的索引是: " + index);
        } else {
            System.out.println("未找到大于等于 " + target + " 的元素。");
        }
    }
}    