package AccessArray;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomAccessArray {
    public static void main(String[] args) {
        // 创建并初始化一个数组
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // 创建 Random 对象
        Random random = new Random();

        // 生成一个随机索引
        int randomIndex = random.nextInt(numbers.length);

        // 随机访问数组元素
        int randomElement = numbers[randomIndex];

        // 输出结果
        System.out.println("随机生成的索引是: " + randomIndex);
        System.out.println("随机访问的元素是: " + randomElement);
    }

    /* 随机访问元素 */
    int randomAccess(int[] nums) {
        // 在区间 [0, nums.length) 中随机抽取一个数字
        int randomIndex = ThreadLocalRandom.current().nextInt(0, nums.length);
        // 获取并返回随机元素
        int randomNum = nums[randomIndex];
        return randomNum;
    }

}