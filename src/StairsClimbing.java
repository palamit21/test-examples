public class StairsClimbing {

  public static void main(String[] args) {
    StairsClimbing s= new StairsClimbing();
    System.out.println(s.climbStairs(3));

  }
  int destination = 0;
  int[] memo = null;
  public int climbStairs(int n) {
    memo = new int[n + 1];
    destination = n;
    return climb(0);
  }
  private int climb(int currentStairNo) {

    if (currentStairNo > destination) return 0;
    if (currentStairNo == destination) return 1;
    if (memo[currentStairNo] > 0)
      return memo[currentStairNo];

     memo[currentStairNo] = climb(currentStairNo + 1) +
        climb(currentStairNo + 2);

    return memo[currentStairNo];
  }

}
