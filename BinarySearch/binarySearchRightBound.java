/**
 * @Description:
 * @Author: wjh
 * @Date: 2025/4/3 下午2:49
 */
public class binarySearchRightBound {
    public static int binarySearchRightBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        int rightBound = binarySearchRightBound(nums, target);
        System.out.println("最右边的边界索引是: " + rightBound);
    }
}
