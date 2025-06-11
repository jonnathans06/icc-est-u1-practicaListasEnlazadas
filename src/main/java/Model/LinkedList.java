package Model;

public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;


    public LinkedList() {
    }

    public LinkedList(Node<T> head, int size) {
        this.head = null;
        this.size = 0;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void print() {
        if (head == null) {
            System.out.println("END");
            return;
        }
        Node current = head;
        while (current.getNext() != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println(current.getValue() + " -> END");
    }

    public void appendToTail(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }
    public void delateByValue(T value) {
        if (head == null) {
            return;
        }
        if (head.getValue().equals(value)) {
            head = head.getNext();
            size--;
            return;
        }
        Node<T> current = head;
        while (current.getNext() != null && !current.getNext().getValue().equals(value)) {
            current = current.getNext();
        }
        if (current.getNext() != null) {
            current.setNext(current.getNext().getNext());
            size--;
            if (current.getNext() == null) {
                tail = current;
            }
        }
    }
    public void findByValue(T value) {
        if (head == null) {
            System.out.println("Lista vacía");
            return;
        }
        Node<T> current = head;
        while (current != null) {
            if (current.getValue().equals(value)) {
                System.out.println("Valor encontrado: " + current.getValue());
                return;
            }
            current = current.getNext();
        }
        System.out.println("Valor no encontrado");
    }

}
