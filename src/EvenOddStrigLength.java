import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EvenOddStrigLength {
    public static void main(String[] args) {
        System.out.println(check("amitaa"));
    }
    private static String check(String s)
    {

        //place the string into a map by chars with counter
        Map<Integer,Long> map =
                s.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
        //check map by value - if values are the same then even and map size=1
        int size =
                map.values().stream().collect(Collectors.groupingBy(t -> t)).keySet().size();

        if(size==1 || size==0)
            return "even:"+s;
        return "odd:"+s;
    }
}
