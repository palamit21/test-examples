package tree;

public class RootToLeafe {

  // Java program to print all root to leaf paths

  /* A binary tree node has data, pointer to left child
  and a pointer to right child */

    int data;
  RootToLeafe left, right;

  RootToLeafe(int item)
    {
      data = item;
      left = right = null;
    }
  }

  class BinaryTree
  {
    RootToLeafe root;

    /* Given a binary tree, print out all of its root-to-leaf
    paths, one per line. Uses a recursive helper to do the work.*/
    void printPaths(RootToLeafe node)
    {
      int path[] = new int[1000];
      printPathsRecur(node, path, 0);
    }

    /* Recursive helper function -- given a node, and an array containing
    the path from the root node up to but not including this node,
    print out all the root-leaf paths. */
    void printPathsRecur(RootToLeafe node, int path[], int pathLen)
    {
      if (node == null)
        return;

      /* append this node to the path array */
      path[pathLen] = node.data;
      pathLen++;

      /* it's a leaf, so print the path that led to here */
      if (node.left == null && node.right == null)
        printArray(path, pathLen);
      else
      {
        /* otherwise try both subtrees */
        printPathsRecur(node.left, path, pathLen);
        printPathsRecur(node.right, path, pathLen);
      }
    }

    /* Utility that prints out an array on a line */
    void printArray(int ints[], int len)
    {
      int i;
      for (i = 0; i < len; i++)
        System.out.print(ints[i] + " ");
      System.out.println("");
    }

    /* Driver program to test all above functions */
    public static void main(String[] args)
    {
      BinaryTree tree = new BinaryTree();

      tree.root = new RootToLeafe(1);
      tree.root.left = new RootToLeafe(2);
      tree.root.right = new RootToLeafe(3);
      tree.root.left.left = new RootToLeafe(4);
      tree.root.left.right = new RootToLeafe(5);

      /* Print all root-to-leaf paths of the input tree */
      tree.printPaths(tree.root);

    }
  }


