package tree;

public class ChildSumNode {

  int data;
  ChildSumNode left = null, right = null;

  ChildSumNode(int data) {

    this.data = data;
  }
}

class Main
{
  // Function to check if a given binary tree holds children-sum property
  public static int hasChildrenSumProperty(ChildSumNode root)
  {
    // base case: empty tree
    if (root == null) {
      return 0;
    }

    // base case: leaf node
    if (root.left == null && root.right == null) {
      return root.data;
    }

    int left = hasChildrenSumProperty(root.left);
    int right = hasChildrenSumProperty(root.right);

    // if the root's value is equal to the sum of values at its left and
    // right subtree
    if (left != Integer.MIN_VALUE && right != Integer.MIN_VALUE &&
        root.data == left + right) {
      return root.data;
    }

    return Integer.MIN_VALUE;
  }

  public static void main(String[] args)
  {
        /* Construct the following binary tree
                  25
                /    \
               /      \
              /        \
             12        13
            /  \      /  \
           /    \    /    \
          7      5  6      7
        */

    ChildSumNode root = new ChildSumNode(25);
    root.left = new ChildSumNode(12);
    root.right = new ChildSumNode(13);
    root.left.left = new ChildSumNode(7);
    root.left.right = new ChildSumNode(5);
    root.right.left = new ChildSumNode(6);
    root.right.right = new ChildSumNode(7);

    if (hasChildrenSumProperty(root) != Integer.MIN_VALUE) {
      System.out.println("Binary tree holds children-sum property");
    }
    else {
      System.out.println("Binary tree does not hold children-sum property");
    }
  }

}
