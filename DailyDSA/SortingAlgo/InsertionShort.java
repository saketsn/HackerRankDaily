package DailyDSA.SortingAlgo;

public class InsertionShort {
    static void printArray(int arr[]){
        int n = arr.length;
        for(int i =0; i< n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 9 ,8, 10};

        printArray(arr);

        insertionSort(arr);

        System.out.println(" Array after Insertion sort ----");
        printArray(arr);
    }

    public static void insertionSort(int[] arr){

        for( int i= 1; i< arr.length; i++){
            int temp = arr[i];
            int j = i;
            while( j>0 && arr[j-1] > temp){
                  arr[j] = arr[j-1];
                  j--;
            }
            arr[j] = temp;
        }


    }


}


