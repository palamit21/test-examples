package matrix;

public class CountZero {

  public static int N = 2;

  // Function to count number of 0s in the given
  // row-wise and column-wise sorted binary matrix.
  static int countZeroes(int mat[][]) {
    // start from bottom-left corner of the matrix
    int row = N - 1, col = 0;

    // stores number of zeroes in the matrix
    int count = 0;

    while (col < N) {
      // move up until you find a 0
      while (mat[row][col] > 0) {

        // if zero is not found in current column,
        // we are done
        if (--row < 0) {
          return count;
        }
      }

      // add 0s present in current column to result
      count += (row + 1);

      // move right to next column
      col++;
    }

    return count;
  }

  // Driver program
  public static void main(String[] args) {
    /*int mat[][] = { { 0, 0, 0, 0, 1 },
        { 0, 0, 0, 1, 1 },
        { 0, 1, 1, 1, 1 },
        { 1, 1, 1, 1, 1 },
        { 1, 1, 1, 1, 1 } };*/
    int mat[][] = {{0, 0},
        {0, 0}
    };
    System.out.println(countZeroes(mat));
  }

}
