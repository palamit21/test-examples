import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
  class CustomComparator implements Comparator<Integer>
  {
    private Map<Integer, Integer> map;
    public CustomComparator(Map<Integer, Integer> map) {
      this.map = map;
    }

    public int compare(Integer x, Integer y)
    {
      if (map.containsKey(x) && map.containsKey(y)) {
        return map.get(x) - map.get(y);
      }
      else if (map.containsKey(y)) {
        return 1;
      }
      else if (map.containsKey(x)) {
        return -1;
      }
      else {
        return x - y;
      }
    }
  }

  class Main
  {
    public static void main(String[] args)
    {
      // Use Wrapper class
      List<Integer> first = Arrays.asList(5, 8, 9, 3, 5, 7, 1, 3, 4, 9, 3, 5, 1, 8, 4);
      List<Integer> second = Arrays.asList(3, 5, 7, 2);

      Map<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < second.size(); i++) {
        map.put(second.get(i), i);
      }
      System.out.println(map);

      first.sort(new CustomComparator(map));
      System.out.println(first);
    }
  }

