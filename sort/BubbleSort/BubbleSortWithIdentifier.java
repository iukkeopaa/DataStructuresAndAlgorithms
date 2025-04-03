package BubbleSort;

class Element {
    int value;
    int identifier;

    public Element(int value, int identifier) {
        this.value = value;
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "(" + identifier + ": " + value + ")";
    }
}

public class BubbleSortWithIdentifier {
    public static void bubbleSort(Element[] arr) {
        int n = arr.length;
        boolean swapped;
        int lastSwapIndex = n - 1;

        do {
            swapped = false;
            int currentLastSwap = 0;

            for (int j = 0; j < lastSwapIndex; j++) {
                if (arr[j].value > arr[j + 1].value) {
                    // 交换 arr[j+1] 和 arr[j]
                    Element temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    currentLastSwap = j;
                }
            }
            lastSwapIndex = currentLastSwap;
        } while (swapped);
    }

    public static void main(String[] args) {
        Element[] arr = {
                new Element(64, 1),
                new Element(34, 2),
                new Element(25, 3),
                new Element(12, 4),
                new Element(22, 5),
                new Element(11, 6),
                new Element(90, 7)
        };

        System.out.println("排序前:");
        for (Element element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.println("排序后:");
        for (Element element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}    