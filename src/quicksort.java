import java.io.*;
public class quicksort {
    //in order to swap to elements
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //last element is considered as pivot,placing in correct position

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; //selecting the pivot
        int i = (low - 1); // index of smaller element

        for (int j = low; j <= high - 1; j++) {
            //current element is smaller than pivot

            if (arr[j] < pivot) {
                i++; //increment ind of smaller element
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i+1);
    }
    //low is starting and high is ending indexes
    static void QUICKsort(int[] arr, int low, int high)
    {
        if (low<high)

        {
            int partind=partition(arr, low, high);
            QUICKsort(arr, low, partind-1);
            QUICKsort(arr, partind+1, high);
        }
    }
    //print the sorted array
    public static void printArr(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 6};
        int N = arr.length;

        //call
        QUICKsort(arr, 0, N-1);
        System.out.println("sorted array:");

        printArr(arr);
    }
}
