public class MyLinkedList<E> {
    private class Node {
        E data;
        Node next;
        Node(E data) { this.data = data; }
    }

    private Node head;
    private int size;

    public MyLinkedList() { head = null; size = 0; }

    public void add(E data) {
        Node newNode = new Node(data);
        if (head == null) head = newNode;
        else {
            Node current = head;
            while (current.next != null) current = current.next;
            current.next = newNode;
        }
        size++;
    }

    public void remove(int orderNumber) {
        if (head == null) return;
        if (((Order) head.data).getOrderNumber() == orderNumber) {
            head = head.next;
            size--;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (((Order) current.next.data).getOrderNumber() == orderNumber) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    public void displayOrders() {
        if (size == 0) {
            System.out.println("No orders to display.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int size() { return size; }
}
