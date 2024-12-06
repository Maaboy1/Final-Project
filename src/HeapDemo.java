import java.util.Comparator;
import java.util.Random;

public class HeapDemo {
    public static void main(String[] args) {
        Comparator<Integer> comparator = Integer::compareTo;
        Heap<Integer> heap = new Heap<>(comparator);
        Random random = new Random();

        System.out.println("Adding elements:");
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(100);
            System.out.print(num + " ");
            heap.add(num);
        }

        System.out.println("\nRemoving elements:");
        Integer num;
        while ((num = heap.remove()) != null) {
            System.out.print(num + " ");
        }
    }
}
//
