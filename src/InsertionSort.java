public class InsertionSort {
    void sort(int arr[]) {
        int n= arr.length;
        for (int i = 1; i < n; ++i) {
            int key= arr[i];
            int j= i - 1;
            //placing elements that are bigger than key to 1 place further
            while (j >=0 && arr[j] > key) {
                arr[j +1] = arr[j];
                j= j- 1;
            }
            arr[j+ 1] = key;
        }
    }
    //print array of size n
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[]= {22, 11, 33, 5, 57};

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        printArray(arr);

    }
}
