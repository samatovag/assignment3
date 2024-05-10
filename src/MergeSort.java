import java.io.*;
public class MergeSort {
    void merge(int arr[], int l, int m, int r) {
        //sizes of sub arrays
        int n1 = m-l+1;
        int n2= r-m;

        //temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        //data to temp arrays
        for (int i=0; i < n1; ++i)
            L[i] = arr[l+i];
        for (int j = 0; j < n2; ++j)
            R[j]= arr[m+1+j];
        //merge of the temp arrays
        //the initial indexes of 1,2 sub arrays
        int i = 0, j = 0;

        //initial index of merged array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] =R[j];
                j++;
            }
            k++;
        }
        //copying of elements - L[]
        while (i < n1) {
            arr[k] =L[i];
            i++;
            k++;
        }
        // R[]
        while (j < n2) {
            arr[k]= R[j];
            j++;
            k++;
        }
    }
    // arr[l...r] sorting
    void sort(int arr[], int l , int r) {
        if (l < r) {
            //middle
            int m= l+(r- l) / 2;

            //sorting of first and second parts
            sort(arr, l, m);
            sort(arr, m+1, r);

            //merging of sorted parts
            merge(arr, l, m, r);
        }
    }
    //to print arr of size n
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[]= {12, 11, 13, 4, 6, 7};

        System.out.println("initial array");
        printArray(arr);
        MergeSort obj = new MergeSort();
        obj.sort(arr, 0,arr.length -1);

        System.out.println("The sorted array");
        printArray(arr);
    }
}
