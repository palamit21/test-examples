// Java program for rearrange an
// array such that arr[i] = i.
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ReArrangeArray
{
  public static void main(String[] args)
  {
    int[] arr = { -1, 5, 6, 1, 9, 3, -1, -1, 4, -1 };
    for (int i = 0; i < arr.length;)
    {
      if (arr[i] >= 0 && arr[i] != i)
      {
        int ele = arr[arr[i]];
        arr[arr[i]] = arr[i];
        arr[i] = ele;
      }
      else
      {
        i++;
      }
    }
    System.out.println(Arrays.toString(arr));
    // Function calling
    System.out.println(Arrays.toString(fix(arr)));
  }

  public static int[] fix(int[] A)
  {
    Set<Integer> s = new HashSet<Integer>();

    // Storing all the values in the HashSet
    for(int i = 0; i < A.length; i++)
    {
      s.add(A[i]);
    }

    for(int i = 0; i < A.length; i++)
    {
      if(s.contains(i))
        A[i] = i;
      else
        A[i] = -1;
    }

    return A;
  }
}

