import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.Static;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Practice {
    public static void main(String a[]) {
        duplicate2DArray();

        String word = "Ajjjjd";
        Map<String, Long> charCount = word.codePoints().mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCount);
        Map<String, Long> charCount1=  word.chars().mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> charCount2=   Arrays.stream(word.split("''+")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()
        ));
        Map<String, Long> map=word.chars().mapToObj(i->Character.toString((char)i)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("map  " +map);
        System.out.println(charCount1);
        System.out.println("new count "+charCount2);

        IntStream.of(3, 2, 2, 3, 7, 3, 5)
            .distinct()
            .forEach(n -> System.out.println(n + "\t" +Math.pow(n, 2)));

        List<Integer> list = Arrays.asList(2, 4, 5, 6);
        int sum = list.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);

        ///////

        Integer[] aa = new Integer[]{1,2,3};
        Integer[] b = new Integer[]{4,5,6,1};
        Set<Integer> array= Stream.concat(Arrays.stream(aa),Arrays.stream(b)).collect(Collectors.toSet());
        List<Integer>array1=    Stream.concat(Arrays.stream(aa),Arrays.stream(b)).sorted(Comparator.reverseOrder()).distinct().collect(
            Collectors.toList());
        System.out.println(Arrays.toString(array.toArray()));
        System.out.println(" list "+array1);
        List<Integer>list1= new ArrayList<>(Arrays.asList(4,3,5,8));
        Optional<Integer> first=   list1.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst();
        System.out.println(first.get());
        //Collections.sort(array.toArray(),Collection
        int[] input2 = {2,7,17,19,20,45,56,159,239};
        int[] intput1 = {7,12,15,19,22,34,45,55,150,159,239,17,20};
        int index1 = 0;
        int index2 = 0;
        while(true) {
            if(index1 >= intput1.length || index2 >= input2.length) {
                break;
            }
            if(intput1[index1] == input2[index2]) {
                System.out.print(intput1[index1]);
                System.out.print("  ");
                index1 += 1;
            } else if(intput1[index1] < input2[index2]) {
                index1 += 1;
            } else {
                index2 += 1;
            }
        }

    }

    static void  duplicate2DArray(){
        int[][] _2dArray = {
            { 1, 2, 4 },
            { 1, 5, 7 },
            { 2, 4, 8 }
        };

        // Convert to a flat 1d array
        int[] flatArray = Arrays.stream(_2dArray)
            .flatMapToInt(Arrays::stream)
            .toArray();

        //Count duplicates
        Object[] duplicates = Arrays.stream(flatArray).boxed()
            // Group all integers together
            .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
            // Keep key/value pairs whose value > 1
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() > 1)
            .toArray();


        System.out.println(duplicates.length);
        System.out.println(Arrays.toString(duplicates));
        System.out.println("-------------");

        List<Integer>al= new ArrayList<>(Arrays.asList(1,2,5,5));
       Object[] output=   al.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()))
         .entrySet()
         .stream().filter(j->j.getKey()>1).toArray();
     Long max=  al.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).values().stream().max(Comparator.comparing(Function.identity())).get();
        System.out.println(Arrays.toString(output));
        System.out.println("-------------"+max);

    }

}
