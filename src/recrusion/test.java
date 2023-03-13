package recrusion;



public class test {

 static int findLength(int[]a){
    int count=1;
    int value=a[0];
    while (value!=-1){
      value =a[value];
      count++;

    }
    return count;

  }
  static String smallest(String s) {
    int l = s.length();
    String output = "";

    // iterate the String
    for (int i = 0; i < l-1; i++) {

      // first point where s[i]>s[i+1]
      if (s.charAt(i) > s.charAt(i + 1)) {

        // append the String without
        // i-th character in it
        for (int j = 0; j < l; j++) {
          if (i != j) {
            output += s.charAt(j);
          }
        }
        return output;
      }
    }

    // leave the last character
    output = s.substring(0, l - 1);
    return output;
  }



  public static void main(String[] args) {

   int arr[]={1,4,-1,3,2,5};
    System.out.println( findLength(arr));
    System.out.println(smallest("codility"));

  }



}
