package org.example.Sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            int min = i;

            for(int j = i; j <= n-1; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            if(min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
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
        int[] arr = {61, 51, 41, 31, 21, 11};
        System.out.println("original Array: ");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted Array: ");
        printArray(arr);
    }
}
