import tree.MiddleElement;
import tree.MiddleElement.ListNode;

//Java implementation of the approach
class LinkedList {

  // Head of list
  Node head;

  // Linked list Node
  class Node {

    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  // Function to delete the nth node from
  // the end of the given linked list
  void deleteNode(int key) {
    // Store head node
    Node temp = head, prev = null;

    // If head node itself holds the key to be deleted
    if (temp != null && temp.data == key) {
      head = temp.next; // Changed head
      return;
    }

    // Search for the key to be deleted, keep track of
    // the previous node as we need to change temp.next
    while (temp != null && temp.data != key) {
      prev = temp;
      temp = temp.next;
    }

    // If key was not present in linked list
		if (temp == null) {
			return;
		}

    // Unlink the node from linked list
    prev.next = temp.next;
  }

  // Function to insert a new Node at front of the list
  public LinkedList push(LinkedList list, int data) {
		/*Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;*/
    // Create a new node with given data
    Node new_node = new Node(data);
    new_node.next = null;

    // If the Linked List is empty,
    // then make the new node as head
    if (list.head == null) {
      list.head = new_node;
    } else {
      // Else traverse till the last node
      // and insert the new_node there
      Node last = list.head;
      while (last.next != null) {
        last = last.next;
      }

      // Insert the new_node at last node
      last.next = new_node;
    }

    // Return the list by head
    return list;
  }
  public Node middleNode(Node head) {
    Node slow = head, fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  // Function to print the linked list
  public void printList() {
    Node tnode = head;
    while (tnode != null) {
      System.out.print(tnode.data + " ");
      tnode = tnode.next;
    }
  }
  static boolean isCircular( Node head)
  {
    // An empty linked list is circular
    if (head == null)
      return true;

    // Next of head
    Node node = head.next;

    // This loop would stop in both cases (1) If
    // Circular (2) Not circular
    while (node != null && node != head)
      node = node.next;

    // If loop stopped because of circular
    // condition
    return (node == head);
  }
  Node reverse(Node node)
  {
    Node prev = null;
    Node current = node;
    Node next = null;
    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    node = prev;
    return node;
  }

  // Driver code
  public static void main(String[] args) {
    LinkedList llist = new LinkedList();

    llist = llist.push(llist, 7);
    llist.push(llist, 8);
    llist.push(llist, 9);
    llist.push(llist, 5);
    llist.push(llist, 1);
    llist.push(llist, 3);
    llist.push(llist, 2);
		/*llist.push(1);
		llist.push(3); 
		llist.push(2); */
  Node middle=  llist.middleNode(llist.head);
    System.out.println(middle.data);

    System.out.println("\nCreated Linked list is:" + llist);
    llist.printList();
    System.out.println("reverse");
   //Node reverse= llist.reverse(llist.head);
    llist.printList();
    System.out.println("Circular");
    System.out.println(isCircular(llist.head));

    int N = 8;
    llist.deleteNode(N);

    System.out.println("\nLinked List after Deletion is:");
    llist.printList();
  }
} 
