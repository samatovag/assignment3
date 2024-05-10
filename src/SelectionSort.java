import java.io.*;
public class SelectionSort {
    void sort(int arr[]) {
        int n= arr.length;
        for (int i= 0; i < n-1; i++) {
            //min element in unsorted arr
            int min_indx = i;
            for (int j= i + 1; j < n; j++)
                if (arr[j] < arr[min_indx])
                    min_indx= j;
            //swapping of the min element with 1st element
            int temp= arr[min_indx];
            arr[min_indx]= arr[i];
            arr[i] = temp;
        }
    }
    //print
    void printArray(int arr[]) {
        int n= arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i]+ " ");
        System.out.println();
    }
    //driver
    public static void main(String args[]) {
        SelectionSort ob= new SelectionSort();
        int arr[]= {66, 22, 1, 29, 11};
        ob.sort(arr);
        System.out.println("the sorted array");
        ob.printArray(arr);
    }
}
