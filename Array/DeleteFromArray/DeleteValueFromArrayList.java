package DeleteFromArray;

import java.util.ArrayList;
import java.util.List;

public class DeleteValueFromArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int valueToDelete = 3;

        // 删除指定值的元素
        list.remove(Integer.valueOf(valueToDelete));

        // 输出列表
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}