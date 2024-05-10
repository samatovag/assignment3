public class HeapSort {
    public void sort(int arr[]) {
        int N= arr.length;

        //rearranging of array- heap
        for (int i= N / 2-1; i >= 0; i--)
            heapify(arr, N, i);

        //take  out elements from the heap
        for (int i= N -1; i > 0; i--) {
            //replace the current root to the end
            int temp = arr[0];
            arr[0]= arr[i];
            arr[i] =  temp;
            //heapify - max on reduced heap
            heapify(arr, i, 0);
        }
    }
    void heapify(int arr[], int N, int i) {
        int largest= i; //initialize it as the Root
        int l= 2 * i +1; //left
        int r = 2 * i + 2; //right

        //left child is bigger than root
        if (l < N && arr[l] > arr[largest])
            largest = l;
        //right child is bigger than the largest so far
        if (r < N && arr[r] > arr[largest])
            largest=r;
        //largest isnt the root
        if (largest != i) {
            int swap = arr[i];
            arr[i]= arr[largest];
            arr[largest] = swap;
            heapify(arr,N, largest);
        }
    }
    //print arr of size n
    static void printArray(int arr[]) {
        int N= arr.length;
        for (int i = 0; i < N; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[]= { 222, 11, 3 , 4, 9, 7};
        int N = arr.length;
        HeapSort obj= new HeapSort();
        obj.sort(arr);

        System.out.println(" sorted array: ");
        printArray(arr);
    }
}
