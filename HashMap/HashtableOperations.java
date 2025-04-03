import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashtableOperations {
    public static void main(String[] args) {
        // 创建一个哈希表
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // 插入操作
        insert(hashtable, 1, "Apple");
        insert(hashtable, 2, "Banana");
        insert(hashtable, 3, "Cherry");

        // 遍历键值对
        System.out.println("遍历键值对:");
        traverseKeyValuePairs(hashtable);

        // 遍历键
        System.out.println("\n遍历键:");
        traverseKeys(hashtable);

        // 遍历值
        System.out.println("\n遍历值:");
        traverseValues(hashtable);

        // 查找操作
        String value = search(hashtable, 2);
        if (value != null) {
            System.out.println("\n查找键 2 的值为: " + value);
        } else {
            System.out.println("\n未找到键 2 的值");
        }

        // 删除操作
        delete(hashtable, 3);
        System.out.println("\n删除键 3 后:");
        traverseKeyValuePairs(hashtable);
    }

    // 插入元素
    public static void insert(Hashtable<Integer, String> hashtable, int key, String value) {
        hashtable.put(key, value);
    }

    // 查找元素
    public static String search(Hashtable<Integer, String> hashtable, int key) {
        return hashtable.get(key);
    }

    // 删除元素
    public static void delete(Hashtable<Integer, String> hashtable, int key) {
        if (hashtable.containsKey(key)) {
            hashtable.remove(key);
        } else {
            System.out.println("未找到键 " + key + "，无法删除。");
        }
    }

    // 遍历键值对
    public static void traverseKeyValuePairs(Hashtable<Integer, String> hashtable) {
        for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
            System.out.println("键: " + entry.getKey() + ", 值: " + entry.getValue());
        }
    }

    // 遍历键
    public static void traverseKeys(Hashtable<Integer, String> hashtable) {
        for (Integer key : hashtable.keySet()) {
            System.out.println("键: " + key);
        }
    }

    // 遍历值
    public static void traverseValues(Hashtable<Integer, String> hashtable) {
        Enumeration<String> values = hashtable.elements();
        while (values.hasMoreElements()) {
            System.out.println("值: " + values.nextElement());
        }
    }
}    