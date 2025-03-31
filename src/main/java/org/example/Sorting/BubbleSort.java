package org.example.Sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i <= n-1; i++){
            boolean swap = true;
            for(int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swap = false;
                }
            }
            if(swap == true){
                System.out.println("Array is already sorted..");
                break;
            }
        }
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("original Array");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted Array: ");
        printArray(arr);

        int[][] testCases = {
                {1, 2, 3, 4, 5, 6},  // Already sorted
                {6, 5, 4, 3, 2, 1},  // Reverse order
                {3, 1, 4, 1, 5, 9},  // Random order
                {10, 20, 30, 40, 50}, // Sorted order
                {99, 45, 67, 23, 1}  // Random unsorted
        };

        for(int i = 0; i < testCases.length; i++) {
            System.out.println();
            System.out.println("Test Case " + (i + 1) + ":");
            System.out.print("Original Array: ");
            printArray(testCases[i]);

            bubbleSort(testCases[i]);

            System.out.print("Sorted Array: ");
            printArray(testCases[i]);
            System.out.println("---------------------");
        }
    }
}
