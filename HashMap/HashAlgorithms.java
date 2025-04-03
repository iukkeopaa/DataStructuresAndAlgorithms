public class HashAlgorithms {

    // 加法哈希
    public static int additiveHash(String input) {
        int hash = 0;
        for (int i = 0; i < input.length(); i++) {
            hash += input.charAt(i);
        }
        return hash;
    }

    // 乘法哈希
    public static int multiplicativeHash(String input) {
        int hash = 0;
        int constant = 31; // 常用的常数
        for (int i = 0; i < input.length(); i++) {
            hash = hash * constant + input.charAt(i);
        }
        return hash;
    }

    // 异或哈希
    public static int xorHash(String input) {
        int hash = 0;
        for (int i = 0; i < input.length(); i++) {
            hash ^= input.charAt(i);
        }
        return hash;
    }

    // 旋转哈希
    public static int rotateHash(String input) {
        int hash = 0;
        int rotation = 5; // 旋转位数
        for (int i = 0; i < input.length(); i++) {
            hash = (hash << rotation) | (hash >> (32 - rotation));
            hash ^= input.charAt(i);
        }
        return hash;
    }

    public static void main(String[] args) {
        String test = "Hello, World!";
        System.out.println("加法哈希值: " + additiveHash(test));
        System.out.println("乘法哈希值: " + multiplicativeHash(test));
        System.out.println("异或哈希值: " + xorHash(test));
        System.out.println("旋转哈希值: " + rotateHash(test));
    }
}    