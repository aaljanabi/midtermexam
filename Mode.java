import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Mode {
	public static void main(String[] args) {

		List list = (List) new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		System.out.println(new Mode().maxOccurrences(list));


		}

		public int maxOccurrences(List<Integer> list) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int returnVal = 0;
		if (list.size() == 0) {
		return returnVal;
		} else {
		for (int i = 0; i < list.size(); i++) {
		if (map.containsKey(list.get(i))) {
		int temp = map.get(list.get(i));
		temp++;
		map.put(list.get(i), temp);
		} else {
		map.put(list.get(i), 1);
		}
		}
		Set set = new TreeSet(map.values());
		Iterator i = set.iterator();
		while (i.hasNext()) {
		returnVal = (int) i.next();

		}
		}
		  
		return returnVal;
		}

}

