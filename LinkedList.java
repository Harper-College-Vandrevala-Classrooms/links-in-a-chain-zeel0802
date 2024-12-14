public class LinkedList {
    private Node head;

    // Method to add a node at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Add-On: Reverse the Linked List
    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Store the next node
            current.next = previous; // Reverse the link
            previous = current; // Move the 'previous' pointer forward
            current = next; // Move the 'current' pointer forward
        }
        head = previous; // Update the head of the list
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
