import java.util.ArrayList;
import java.util.Comparator;

public class Heap<T> {
    private final ArrayList<T> elements = new ArrayList<>();
    private final Comparator<? super T> comparator;

    public Heap(Comparator<? super T> comparator) {
        this.comparator = comparator;
    }

    public void add(T element) {
        elements.add(element);
        siftUp(elements.size() - 1);
    }

    public T remove() {
        if (elements.isEmpty()) return null;
        T root = elements.get(0);
        T last = elements.remove(elements.size() - 1);
        if (!elements.isEmpty()) {
            elements.set(0, last);
            siftDown(0);
        }
        return root;
    }

    private void siftUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (comparator.compare(elements.get(index), elements.get(parent)) >= 0) break;
            swap(index, parent);
            index = parent;
        }
    }

    private void siftDown(int index) {
        int size = elements.size();
        while (true) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = index;

            if (left < size && comparator.compare(elements.get(left), elements.get(smallest)) < 0)
                smallest = left;
            if (right < size && comparator.compare(elements.get(right), elements.get(smallest)) < 0)
                smallest = right;
            if (smallest == index) break;

            swap(index, smallest);
            index = smallest;
        }
    }

    private void swap(int i, int j) {
        T temp = elements.get(i);
        elements.set(i, elements.get(j));
        elements.set(j, temp);
    }
}
