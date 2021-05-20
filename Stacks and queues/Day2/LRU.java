class LRUCache {

    final Node head = new Node();
    final Node tail = new Node();
    Map<Integer, Node> map;
    int cap;

    public LRUCache(int capacity) {
        map = new HashMap(capacity);
        this.cap = capacity;
        head.next = tail;
        tail.prev = head;

    }

    public int get(int key) {
        int result = -1;
        Node node = map.get(key);
        if (node != null) {
            result = node.value;
            remove(node);
            add(node);
        }
        return result;

    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if (node != null) {
            node.value = value;
            remove(node);
            add(node);
        } else {
            if (map.size() == cap) {
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node newnode = new Node();
            newnode.key = key;
            newnode.value = value;

            map.put(key, newnode);
            add(newnode);
        }

    }

    public void add(Node node) {
        Node headn = head.next;
        node.next = headn;
        headn.prev = node;
        head.next = node;
        node.prev = head;
    }

    public void remove(Node node) {
        Node nextn = node.next;
        Node prevn = node.prev;

        nextn.prev = prevn;
        prevn.next = nextn;
    }

    class Node {
        int key;
        int value;
        Node prev;
        Node next;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such: LRUCache obj =
 * new LRUCache(capacity); int param_1 = obj.get(key); obj.put(key,value);
 */
