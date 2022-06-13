package structures;

public class ListNode<T> {
    public T item;
    public ListNode<T> next;
    
    public ListNode(T item) {
        this.item = item;
        this.next = null;
    }    

    /**
     * print out the list starting from the current node
     */
    public void printList() {
        ListNode<T> p = this;

        do {
            System.out.print(p.item + " -> ");
            p = p.next;
        } while (p != null);
    }
}
