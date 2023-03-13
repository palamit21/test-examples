package dp;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

  public static void main(String[] args) {

    System.out.println(lengthOfLongestSubstring("amit akumar"));
  }

  public static int lengthOfLongestSubstring(String s) {
    if (s == null) return 0;
    Set<Character> set = new HashSet<>();
    int left = 0, right = 0, maxLength = 0;
    while (right < s.length()) {
      char current = s.charAt(right);
      if (!set.contains(current)) {
        set.add(current);
        right++;
        maxLength = Math.max(maxLength, (right - left));
      } else {
        char toRemove = s.charAt(left);
        set.remove(toRemove);
        left++;
        System.out.println(set);
      }
    }
    return maxLength;
  }

}
