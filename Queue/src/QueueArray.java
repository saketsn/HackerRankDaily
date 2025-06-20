public class QueueArray {

    int[] arr;
    int topOfQueue;
    int beginingOfQueue;

    public QueueArray(int size){
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginingOfQueue = -1;
        System.out.println("The Queue is succesffully created with size of : " + size);

    }

    public boolean isFull(){
        if(topOfQueue == arr.length-1){
            return true;
        }else{
            return false;
        }
    }

    public  boolean isEmpty(){
        if( (beginingOfQueue == -1) || (beginingOfQueue == arr.length)){
            return true;
        }else{
            return false;
        }
    }

    public void enQueue(int value){
        if(isFull()){
            System.out.println("The Queue is full.");
        }else if(isEmpty()){
            beginingOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value+ " in the queue.");
        }else{
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value+ " in the queue.");
        }
    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("The Queue is empty.");
            return -1;
        }else{
            int result = arr[beginingOfQueue];
            beginingOfQueue++;
            if(beginingOfQueue > topOfQueue){
                beginingOfQueue = topOfQueue = -1;
            }
            return result;

        }
    }

    public int peek(){
        if(!isEmpty()){
            return arr[beginingOfQueue];
        }else{
            System.out.println("Queue is empty");
            return -1;
        }
    }

    public void deleteQueue(){
        arr = null;
        System.out.println("The Queue is successfully deleted.");
    }


}
