//Java implementation of the approach
class LinkedList { 
	// Head of list
	Node head; 

	// Linked list Node 
	class Node { 
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	// Function to delete the nth node from 
	// the end of the given linked list 
	void deleteNode(int key)
	{
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
		if (temp == null)
			return;

		// Unlink the node from linked list
		prev.next = temp.next;
	}

	// Function to insert a new Node at front of the list 
	public void push(int new_data) 
	{ 
		Node new_node = new Node(new_data); 
		new_node.next = head;
		head = new_node;
	} 

	// Function to print the linked list 
	public void printList() 
	{ 
		Node tnode = head; 
		while (tnode != null) { 
			System.out.print(tnode.data + " "); 
			tnode = tnode.next; 
		} 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		LinkedList llist = new LinkedList(); 

		llist.push(7); 
		llist.push(1); 
		llist.push(3); 
		llist.push(2); 

		System.out.println("\nCreated Linked list is:"); 
		llist.printList(); 

		int N = 2; 
		llist.deleteNode(N); 

		System.out.println("\nLinked List after Deletion is:"); 
		llist.printList(); 
	} 
} 
