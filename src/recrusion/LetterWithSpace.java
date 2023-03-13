package recrusion;

public class LetterWithSpace {

  public static void permutationWithSpaces(String ip,String op){
    if(ip.length() == 0){
      System.out.println(op);
      return;
    }
    permutationWithSpaces(ip.substring(1),op + ip.charAt(0));
    permutationWithSpaces(ip.substring(1),op + " " + ip.charAt(0));
  }
  private static void permutationFind(String input, String output) {
    if(input.length()==0){
      System.out.println(output);
      return;
    }
    String out1 = output;
    String out2 = output;
    out2 += input.charAt(0);
    input = input.substring(1);
    permutationFind(input,out1);
    permutationFind(input,out2);


  }

  public static void main(String[] args) {
    String ip = "ABCD";
    String op = "";
    permutationFind(ip," ");
    System.out.println("...............");
    op += ip.charAt(0);
    ip = ip.substring(1);

    permutationWithSpaces(ip,op);

  }

}
