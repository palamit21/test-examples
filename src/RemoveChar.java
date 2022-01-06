public class RemoveChar {

  public static void main(String[] args) {
    //CBACD
    //CABABD
    StringBuilder s=  new StringBuilder("AABBBCDDD");
    System.out.println("method se  "+singleOccurence(s.toString()));
    StringBuilder newString=new StringBuilder();
    for (int i = 0; i <= s.length()-2; i++) {
      if((s.charAt(i)=='A' && s.charAt(i+1)=='B')||((s.charAt(i)=='B' && s.charAt(i+1)=='A'))){
        newString=s.deleteCharAt(i);
        System.out.println(newString);
        newString=s.deleteCharAt(i);
        System.out.println(newString);
        s=newString;
        i=0;

      }
      else if((s.charAt(i)=='C' && s.charAt(i+1)=='D')||((s.charAt(i)=='D' && s.charAt(i+1)=='C'))){
        newString=s.deleteCharAt(i);
        System.out.println(newString);
        newString=s.deleteCharAt(i);
        System.out.println(newString);
        s=newString;
        System.out.println("final String block  "+newString);

      }
      else {
        System.out.println("final String block  "+s);


      }

    }

  }
  public static StringBuilder singleOccurence(String s)
  {
    StringBuilder sb = new StringBuilder();
    if (s.length() > 0) {
      char prev = s.charAt(0);
      sb.append(prev);
      for (int i = 1; i < s.length(); ++i) {
        char cur = s.charAt(i);
        if (cur != prev) {
          sb.append(cur);
          prev = cur;
        }
      }
    }
    return sb;
  }

}
