import java.util.NoSuchElementException;

/**
 * LinkedList class
 * A implementation of a singly linked list data structure
 * with a head pointer.
 * 
 * AP CS students: Implement all methods in this file
 */
public class LinkedList<E> {
    
    /**
     * Node class for the LinkedList
     * Contains data and a reference to the next node
     */
    private class Node<E> {
        private E data;         // Data stored in this node
        private Node<E> next;      // Reference to the next node in the list
        
        
        /**
         * Constructor for the Node class
         * @param data The data to store in this node
         */
        public Node(E data) {
            this.data = data;
        }
        
        /**
         * Constructor for the Node class
         * @param data The data to store in this node
         * @param next The reference to the next node
         */
        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    
    // Instance variables for the LinkedList
    private Node<E> head;  // Reference to the first node in the list
    private Node<E> last;  // Reference to the last node in the list
    private int size;   // Number of elements in the list
    
    /**
     * Default constructor for the LinkedList class
     * Creates an empty list
     */
    public LinkedList() {
        this.size = 0;
        this.head = null;
        this.last = null;
    }
    
    /**
     * Returns the number of elements in the list
     * @return The number of elements in the list
     */
    public int size() {
        // Implement this method
        return size; // Placeholder return value
    }
    
    /**
     * Checks if the list is empty
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        // Implement this method
        if(size ==0){
            return true;
        }
        return false; // Placeholder return value
    }
    
    /**
     * Returns the first element in the list without removing it
     * @return The first element in the list
     * @throws NoSuchElementException if the list is empty
     */
    public E getFirst() {
        // Implement this method
        if(isEmpty()==true){
            throw new NoSuchElementException("List is empty");
        }
        return head.data; // Placeholder return value
    }
    
    /**
     * Returns the last element in the list without removing it
     * @return The last element in the list
     * @throws NoSuchElementException if the list is empty
     */
    public E getLast() {
        // Implement this method
        if(isEmpty()==true){
            throw new NoSuchElementException("List is empty");
        }
         
        return last.data; 
    }
    
    /**
     * Adds an element to the beginning of the list
     * @param element The element to add
     */
    public void addFirst(E element) {
        Node <E> newNode = new Node(element, head);
        head = newNode;
        if(isEmpty()){
            last= newNode;
        }
        size++;
    }
    
    /**
     * Adds an element to the end of the list
     * @param element The element to add
     */
    public void addLast(E element) {
        Node<E> newNode = new Node<>(element);
        if (isEmpty()) {
            head = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }
     
    /**
     * Removes and returns the first element in the list
     * @return The first element in the list
     * @throws NoSuchElementException if the list is  empty
     */
    public E removeFirst() {
        // Implement this method
        if(isEmpty()==true){
            throw new NoSuchElementException("List is empty");
        }
        Node<E> tempNode = head;
        this.head = this.head.next;
        if(head == null){
            last = null;
        }
        size--;
        return tempNode.data; // Placeholder return value
    }
    
    /**
     * Removes and returns the last element in the list
     * @return The last element in the list
     * @throws NoSuchElementException if the list is empty
     */
    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
        if (size == 1) {
            return removeFirst();
        }
        Node<E> current = head;
        while (current.next != last) {
            current = current.next;
        }
        E data = last.data;
        last = current;
        last.next = null;
        size--;
        return data;
    }
    
    
    /**
     * Adds an element at the specified index
     * @param index The index at which to add the element
     * @param element The element to add
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        if (index == size) {
            addLast(element);
            return;
        }
        Node<E> current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        Node<E> newNode = new Node<>(element, current.next);
        current.next = newNode;
        size++;
    }
    /**
     * Returns the element at the specified index without removing it
     * @param index The index of the element to return
     * @return The element at the specified index
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        
        Node <E> tempNode = head;
        int i = 0;
        while(i != index){
            tempNode = tempNode.next;
            i++;
        }
        if(tempNode == null){
            return null;
        }
        return tempNode.data; // Placeholder return value
    }
    
    /**
     * Removes and returns the element at the specified index
     * @param index The index of the element to remove
     * @return The element at the specified index
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == size - 1) {
            return removeLast();
        }
        Node <E> current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        Node <E> tempNode = current.next;
        current.next = tempNode.next;
        size--;
        return tempNode.data;
    }
    
    /**
     * Returns the index of the first occurrence of the specified element
     * @param element The element to search for
     * @return The index of the first occurrence of the element, or -1 if not found
     */
    public int indexOf(E element) {
        Node <E> current = head;
        for(int i = 0;i < size; i++ ){
            if(current.data == null && element == null){
                return i;
            }
            if(current.data == element){
                return i;
            }
            current = current.next;
        }
        return -1; // Placeholder return value
    }
    
    /**
     * Checks if the list contains the specified element
     * @param element The element to search for
     * @return true if the list contains the element, false otherwise
     */
    public boolean contains(E element) {
        Node <E> current = head;
        for(int i = 0; i < size; i++){
            if(current.data == null && element == null){
                return true;
            }
            if(current.data == element){
                return true;
            }
            current = current.next;
        }
        return false; // Placeholder return value
    }
    
    /**
     * Returns a string representation of the list
     * @return A string representation of the list
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node <E> current = head;
        sb.append("[");
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
    
    /**
     * Clears the list, removing all elements
     */
    public void clear() {
        head = null;
        size = 0;
    }
    
    /**
     * Extra challenge: Reverses the list in place
     */
    public void reverse() {
        String s = toString(); 
        String reverse = "";
        char ch;

        for (int i = s.length()-1; i >= 0; i--) {
            ch = s.charAt(i);
            reverse = ch + reverse; 
        }
    }
}
