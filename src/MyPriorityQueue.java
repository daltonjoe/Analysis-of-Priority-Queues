/*
 * @author Talha Guzel 041802046
 * @since 07.12.2020
 * Compare the time complexity of three priority queue implementations.
 * */
public class MyPriorityQueue<E extends Comparable<E>> {

    private MyHeap<E> heap = new MyHeap<E>();

    public void enqueue(E newObject) {
        heap.add(newObject);
    }

    public E dequeue() {
        return heap.remove();
    }

    public int getSize() {
        return heap.getSize();
    }

}