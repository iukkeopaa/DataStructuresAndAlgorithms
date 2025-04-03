package SelectionSort;

import java.util.Arrays;
import java.util.Comparator;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class SelectionSortWithComparatorWithClass {

    public static <T> void selectionSort(T[] arr, Comparator<T> comparator) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(arr[j], arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                T temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 25),
                new Person("Bob", 20),
                new Person("Charlie", 30)
        };

        // 按姓名排序
        selectionSort(people, Comparator.comparing(Person::getName));
        System.out.println("按姓名排序: " + Arrays.toString(people));

        // 按年龄排序
        selectionSort(people, Comparator.comparingInt(Person::getAge));
        System.out.println("按年龄排序: " + Arrays.toString(people));
    }
}    