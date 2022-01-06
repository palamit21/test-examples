import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ArraySortBasedOther {

	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		int a1[] = { 2, 1, 2, 5, 7, 1, 9, 3,3, 6, 8, 8 };
		int a2[] = {5, 3,2,1 };
		int n = 0;
		int len = a2.length;
		int[] a3 = new int[a1.length];
		Map<Integer, Integer> m = new HashMap<>();
		for (int i : a1) {
			if (m.containsKey(i)) {

				m.put(i, m.get(i) + 1);

			} else {
				m.put(i, 1);

			}

		}
		for (int i : a2) {
			if (m.containsKey(i)) {
				for (int j = 0; j < m.get(i); j++) {
					a3[n] = i;
					n++;
				}
				m.remove(i);

			}
		}

		Iterator iterator = m.keySet().iterator();
		while (iterator.hasNext()) {
			int key = (int) iterator.next();
			a3[n] = key;
			n++;

		}
		for (int i : a3) {
			System.out.print(" " + i);

		}

	}
	

}
