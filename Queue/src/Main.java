public class Main {
    public static void main(String[] args) {
         QueueArray newQueue = new QueueArray(3);

         newQueue.enQueue(1);
        newQueue.enQueue(2);
        newQueue.enQueue(3);
        newQueue.enQueue(4);
        //newQueue.enQueue(5);


        newQueue.deQueue();
        int res = newQueue.deQueue();
        System.out.println(res);

         boolean result = newQueue.isEmpty();
        System.out.println(result);

        System.out.println(newQueue.peek());






    }
}
