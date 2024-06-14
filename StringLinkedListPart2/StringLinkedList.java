public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public String get(int index) {
        if (index < 0) return null;

        Node current = first.next;
        while (index > 0) {
            if (current == null) return null;
            current = current.next;
            index--;
        }
        return current.value;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
