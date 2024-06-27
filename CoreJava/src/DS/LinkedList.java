class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Insertion at beginning completed");
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Insertion at the end completed");
    }

    // Insert after a given node
    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null.");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // Delete a node by key
    public void deleteByKey(int key) {
        Node temp = head, prev = null;

        // If the head node itself holds the key
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in the list
        if (temp == null) {
            System.out.println("No deletion possible");
            return;
        }

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    // Delete a node at a given position
    public void deleteAtPosition(int position) {
        if (head == null) return;

        Node temp = head;

        // If head needs to be removed
        if (position == 0) {
            head = temp.next; // Change head
            return;
        }

        // Find previous node of the node to be deleted
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        // If position is more than number of nodes
        if (temp == null || temp.next == null) return;

        // Node temp->next is the node to be deleted
        temp.next = temp.next.next;
    }

    // Update a node by key
    public void updateByKey(int key, int newData) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                temp.data = newData;
                return;
            }
            temp = temp.next;
        }
    }

    // Update a node at a given position
    public void updateAtPosition(int position, int newData) {
        Node temp = head;
        for (int i = 0; temp != null && i < position; i++) {
            temp = temp.next;
        }
        if (temp != null) {
            temp.data = newData;
        }
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insertions
        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtBeginning(5);

        // Insert after a node
        list.insertAfter(list.head.next, 15); // Insert 15 after 10

        list.printList(); // Output: 5 10 15 20 30

        // Deletions
        list.deleteByKey(15); // Delete node with data 15
        list.printList(); // Output: 5 10 20 30

        list.deleteAtPosition(2); // Delete node at position 2
        list.printList(); // Output: 5 10 30

        // Updates
        list.updateByKey(10, 25); // Update node with data 10 to 25
        list.printList(); // Output: 5 25 30

        list.updateAtPosition(1, 35); // Update node at position 1 to 35
        list.printList(); // Output: 5 35 30
    }
}
