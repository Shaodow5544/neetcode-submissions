
class LRUCache {

    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final HashMap<Integer, Node> map;

    // Dummy head and tail nodes
    private final Node head;
    private final Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertAtEnd(Node node) {
        Node prevTail = tail.prev;

        prevTail.next = node;
        node.prev = prevTail;

        node.next = tail;
        tail.prev = node;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        // Move to most recently used position
        remove(node);
        insertAtEnd(node);

        return node.value;
    }

    public void put(int key, int value) {

        // Key already exists
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;

            remove(node);
            insertAtEnd(node);

            return;
        }

        // New key
        Node node = new Node(key, value);
        map.put(key, node);
        insertAtEnd(node);

        // Remove least recently used if capacity exceeded
        if (map.size() > capacity) {
            Node lru = head.next;

            remove(lru);
            map.remove(lru.key);
        }
    }
}