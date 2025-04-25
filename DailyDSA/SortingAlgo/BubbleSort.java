package DailyDSA.SortingAlgo;

public class BubbleSort {
    static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j =0; j< n-i-1; j++){
                if(arr[j] > arr[j+i]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
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

        bubbleSort(arr);
        printArray(arr);
    }
}
