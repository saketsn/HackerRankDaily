package DailyDSA.SortingAlgo;

public class SelectionSort {

    static void selectionSort(int[] a){
        for (int j =0; j< a.length; j++){
            int minIndex = j;
            for(int i = j+1; i< a.length; i++){
                if(a[i] < a[minIndex]){
                    minIndex = i;
                }
                if(minIndex != j){
                    int temp = a[j];
                    a[j] = a[minIndex];
                    a[minIndex] = temp;
                }
            }
        }

    }



    static void printArray(int arr[]){
        int n = arr.length;
        for(int i =0; i< n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 9 ,8, 10};

        SelectionSort.selectionSort(arr);
        printArray(arr);
    }

}
