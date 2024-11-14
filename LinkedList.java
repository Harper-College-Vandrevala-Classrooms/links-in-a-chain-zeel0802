public class LinkedList {
    private Node head;

    // Method to append a new ChainLink to the end of the list
    public void append(ChainLink chainLink) {
        Node newNode = new Node(chainLink);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to get a ChainLink at a specific index
    public ChainLink get(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.data;
            }
            current = current.next;
            count++;
        }
        return null; // If the index is out of bounds
    }
}
