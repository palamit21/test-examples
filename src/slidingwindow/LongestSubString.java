package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

  public static void main(String[] args) {
    String s = "abacf";

    int length = longestkSubstr(s, 3);
    System.out.println("The input String is " + length);
    System.out.println(lengthOfLongestSubstring("amit akumar"));
  }

  public static int longestkSubstr(String s, int k) {
    Map<Character, Integer> map = new HashMap<>();
    int j = 0;
    int i = 0;
    int max = -1;

    while (j < s.length()) {
      map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
      if (map.size() == k) {

        max = Math.max(max, j - i + 1);

      } else if (map.size() > k) {
        while (map.size() > k) {

          map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
          if (map.get(s.charAt(i)) == 0) {
            map.remove(s.charAt(i));
          }
          i++;

        }
      }
      j++;
    }
    return max;
  }

  //longest sub string
  public static int lengthOfLongestSubstring(String str) {

    int i = 0, j = 0;
    //j-1+1 -> give u the sliding window size at any time
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    int maxLength = 0;
    while (j < str.length()) {
      map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0) + 1);

      if (map.size() == j - i + 1) {

        if (maxLength < j - i + 1) {
          maxLength = j - i + 1;
        }
        j++;
      } else if (map.size() < j - i + 1) {
        while (map.size() < j - i + 1) {
          map.put(str.charAt(i), map.get(str.charAt(i)) - 1);
          if (map.get(str.charAt(i)) == 0) {
            map.remove(str.charAt(i));
          }
          i++;
        }
        j++;
      }
    }
    return maxLength;

  }

}
