import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

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
    }
}