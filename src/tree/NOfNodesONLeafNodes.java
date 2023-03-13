package tree;

public class NOfNodesONLeafNodes {

  static class Node {

    int data;
    Node left, right;
  }

  static class A {

    int ans = Integer.MIN_VALUE;
  }
  static class B {

    int ans = Integer.MIN_VALUE;
  }

//this method is used to get the diamaeter
  static int diameter(Node root) {
    A res = new A();
    solve(root, res);
    return res.ans;
  }

  static int solve(Node root, A res) {
    if (root == null) {
      return 0;
    }
    int l = solve(root.left, res);
    int r = solve(root.right, res);

    int temp = 1 + Math.max(l, r);
    int ans = Math.max(temp, 1 + r + l);
    res.ans = Math.max(res.ans, ans);
    return temp;
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
    System.out.println("Diameter is " + diameter(root));
    System.out.println("path is " + maxPath(root));


  }

  private static int maxPath(Node root) {
    A res = new A();
    solve1(root, res);
    return res.ans;

  }
//max sum in node
  private static int solve1(Node root, A res) {
    if (root == null) {
      return 0;
    }
    int l = solve1(root.left, res);
    int r = solve1(root.right, res);

    int temp = Math.max((Math.max(l,r)+root.data),(root.data));
    int ans = Math.max(temp,(l+r+root.data));
    res.ans = Math.max(res.ans, ans);
    return temp;

  }

}
