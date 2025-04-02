import java.util.LinkedList;

public class Queue<E> extends LinkedList<E> {

    public Queue() {
    }

    public void push(E item) {
      addLast(item);
    }


    public E pop() {
      return removeFirst();
    }


    public E peek() {
      return getFirst();
		}


    public boolean isEmpty() {
      return super.isEmpty();
    }


    public int size() {
      return super.size();
    }

		// return index of E or -1 if not found
    public int search(E e) {
      return indexOf(e);
    }

    public void clear() {
      super.clear();
		}

    @Override
    public String toString() {
      return super.toString();
		}
}
