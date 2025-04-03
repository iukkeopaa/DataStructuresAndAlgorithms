package InsertToArray;

import java.util.ArrayList;
import java.util.List;

public class InsertUsingArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int elementToInsert = 6;
        int insertPosition = 2;

        // 在指定位置插入元素
        list.add(insertPosition, elementToInsert);

        // 输出列表
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}