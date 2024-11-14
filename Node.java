public class Node {
    public ChainLink data;  // Holds the ChainLink object
    public Node next;       // Points to the next node in the list

    public Node(ChainLink data) {
        this.data = data;
        this.next = null;
    }
}
