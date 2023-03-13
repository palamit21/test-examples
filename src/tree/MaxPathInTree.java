package tree;


public class MaxPathInTree {

  private static int max;

  static class Node {

    int data;
    Node left, right;
  }

  static class A {

    int ans = Integer.MIN_VALUE;
  }
 // int max=Integer.MIN_VALUE;;
  public static int maxPathSum(Node root) {
    if(root==null)
      return 0;
    solve(root);
    return max;
  }

  private static int solve(Node root)
  {
    if(root==null)
      return 0;
    int l=solve(root.left);
    int r=solve(root.right);
    max= Math.max(max , Math.max(Math.max(Math.max(l,r)+root.data,root.data) , root.data+l+r));

    return Math.max(Math.max(l,r)+root.data,root.data);
  }


  static Node newNode(int data) {
    Node node = new Node();
    node.data = data;
    node.left = null;
    node.right = null;

    return (node);
  }

  public static void main(String[] args) {
    Node root = newNode(1);
    root.left = newNode(2);
    root.right = newNode(3);
    root.left.left = newNode(4);
    root.left.right = newNode(5);
    root.left.left = newNode(8);
    System.out.println("max path  is " + maxPathSum(root));
    MaxPathInTree m= new MaxPathInTree();
    System.out.println("max path  is 2 " + m.maxPathSum1(root));
    System.out.println("height of a binary tree  " + m.maxDepth(root));




  }

  int maximumSum = Integer.MIN_VALUE;
  public int maxPathSum1(Node root) {
    sum(root);
    return maximumSum;
  }
  // this is best solution
  private int sum(Node node) {
    if (node == null) return 0;
    int leftSum = Math.max(sum(node.left), 0);
    int rightSum = Math.max(sum(node.right), 0);
    int currentSum = node.data + leftSum + rightSum;
    maximumSum = Math.max(maximumSum, currentSum);
    return Math.max(leftSum, rightSum) + node.data;
  }

  // height of a Binary tree
  int maxDepth(Node node)
  {
    if (node == null)
      return 0;
    else
    {
      /* compute the depth of each subtree */
      int lDepth = maxDepth(node.left);
      int rDepth = maxDepth(node.right);

      /* use the larger one */
      if (lDepth > rDepth)
        return (lDepth + 1);
      else
        return (rDepth + 1);
    }
  }

}
