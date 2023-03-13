import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.Static;
import java.util.regex.Pattern;

public class CountWords {

  public static void main(String[] args) {
    String s="amit kumar 21 22 a p";
     Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");



    String arr[]=s.split(" ");


    for (int i = 0; i < arr.length; i++) {
      int  count=0;
   count= count+ isNumeric(s);
     /* if(!pattern.matcher(arr[i]).matches()){
        count++;

      }*/

    }
    //System.out.println(count);
  }
  public static int isNumeric(String str) {

    try {
      Double.parseDouble(str);
      return 1;
    } catch(NumberFormatException e){
      return 0;
    }
  }

}
