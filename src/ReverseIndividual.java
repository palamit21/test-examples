import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseIndividual {

  public static void main(String[] args) {
    String s="amit kumar";
    String arr[]=s.split(" ");
    StringBuilder finalString= new StringBuilder();
    for (int i = 0; i < arr.length ; i++) {

      String newArray=arr[i];
      for (int j = newArray.length()-1; j >=0; j--) {
        finalString= finalString.append((newArray.charAt(j)));

      }
      finalString.append(" ");

    }
    System.out.println(finalString);
    String result = Arrays.asList(s.split(" "))
        .stream()
        .map(str -> new StringBuilder(str).reverse())
        .collect(Collectors.joining(" "));

    System.out.println(result);
  }



}
