import java.util.Stack;

public class DecodeProbs {

  public static void main(String[] args) {
    String s="3[a2[c]]";
    //3[a2[c]]
    //3[a]2[bc]
    Stack<Integer> intStack = new Stack<>();
    Stack<StringBuilder> strStack = new Stack<>();
    StringBuilder cur = new StringBuilder();
    int k = 0;
    for (char ch : s.toCharArray()) {
      if (Character.isDigit(ch)) {
        k = k * 10 + ch - '0';
      } else if ( ch == '[') {
        intStack.push(k);
        strStack.push(cur);
        cur = new StringBuilder();
        k = 0;
      } else if (ch == ']') {
        StringBuilder tmp = cur;
        cur = strStack.pop();
        for (k = intStack.pop(); k > 0; --k) cur.append(tmp);
      } else cur.append(ch);
    }
    //return cur.toString();
    System.out.println(cur.toString());
  }

}
