package Practic_alone;

public class QuickSortTest {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.println("Original array:");
        printArray(arr);

        quickSort.quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
