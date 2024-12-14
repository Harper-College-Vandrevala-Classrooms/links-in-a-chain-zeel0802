public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding elements to the linked list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original Linked List:");
        list.printList();

        // Reverse the linked list
        list.reverse();

        System.out.println("Reversed Linked List:");
        list.printList();
    }
}
