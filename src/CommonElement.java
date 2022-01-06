import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CommonElement {
    public static void main(String a[]) {
        String word = "Ajjjjd";
        Map<String, Long> charCount = word.codePoints().mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCount);
        Map<String, Long> charCount1=  word.chars().mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> charCount2=   Arrays.stream(word.split("''+")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()
        ));
        System.out.println(charCount1);
        System.out.println("new count "+charCount2);

        int[] input1 = {2,7,17,19,20,45,56,159,239};
        int[] intput2 = {7,12,15,19,22,34,55,150,159,239,17,20};
        int index1 = 0;
        int index2 = 0;
        while(true) {
            if(index1 >= input1.length || index2 >= intput2.length) {
                break;
            }
            if(input1[index1] == intput2[index2]) {
                System.out.print(input1[index1]);
                System.out.print("  ");
                index1 += 1;
            } else if(input1[index1] < intput2[index2]) {
                index1 += 1;
            } else {
                index2 += 1;
            }
        }

    }

}
