public class Main {
    public static void main(String[] args) {

        CircularQueue newCQ = new CircularQueue(3);
        boolean result = newCQ.isFull();
        System.out.println(result);

        newCQ.enQueue(10);
        newCQ.enQueue(34);
        newCQ.enQueue(56);
        newCQ.enQueue(67);
    }
}
