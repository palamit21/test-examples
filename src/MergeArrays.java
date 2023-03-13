import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeArrays {

    private static final List<String> FIRST = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J"));
    private static final List<String> SECOND = new ArrayList<>(Arrays.asList("A", "C", "D"));
    private static final List<String> THIRD = new ArrayList<>(Arrays.asList("F", "E"));
    private static final List<String> FOURTH = new ArrayList<>(Arrays.asList("J", "H", "I"));

    public static List<String> merge(List<String> source, List<String>... lists) {
        List<String> result = new ArrayList<>();
        for (List<String> list : lists) {
            for (String value : list) {
                source.remove(value);
            }
        }

        for (List<String> list : lists) {
            String value = null;
            if (source.size() > 0) {
                value = source.get(0);
                source.remove(0);
            }
            result.addAll(merge(value, list));
        }
        return result;
    }

    public static List<String> merge(String value, List<String> list) {
        List<String> result = new ArrayList<>(list);
        if (value != null) {
            result.add(value);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> result = merge(FIRST, SECOND, THIRD, FOURTH);
        System.out.println(result);

        Integer[] a = new Integer[]{1,2,3};
        Integer[] b = new Integer[]{4,5,6,1};
        Set<Integer>array= Stream.concat(Arrays.stream(a),Arrays.stream(b)).collect(Collectors.toSet());
        List<Integer>array1=    Stream.concat(Arrays.stream(a),Arrays.stream(b)).sorted(Comparator.reverseOrder()).distinct().collect(
            Collectors.toList());
        System.out.println(Arrays.toString(array.toArray()));
        System.out.println(" list "+array1);
        List<Integer>list= new ArrayList<>(Arrays.asList(4,3,5,8));
     Optional<Integer> first=   list.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst();
        System.out.println(first.get());
        //Collections.sort(array.toArray(),Collections.reverseOrder());

        merge(a,b);
        System.out.println();
    }

    private static void merge(Integer[] a, Integer[] b) {
        int res[]= new int[a.length+b.length];
        int k=0,i=0,j=0;
        while (i<a.length&&j<b.length){
            if(a[i]<b[j]){
                res[k]=a[i];
                k++;
                i++;


            }else {
                res[k]=b[j];
                k++;
                j++;

            }

        }
        while (i < a.length)
            res[k++] = a[i++];

        // Store remaining elements of second array
        while (j < b.length)
            res[k++] = b[j++];

        System.out.println(" result"+ Arrays.toString(res));

    }




}