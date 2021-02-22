package functionpack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer> positive = i -> i > 0;
		Predicate<Integer> negative = i -> i < 0;
		Predicate<Integer> moreThan100 = i -> i> 100;
		Predicate<Integer> between10and100 = i -> (i >= 10) && (i <= 100);
		Predicate<Integer> moreThan20 = i -> i > 20;
		List<Integer> allNos = Arrays.asList(
				new Integer(1),	new Integer(10), new Integer(20),
				new Integer(-3), new Integer(-10), new Integer(0),
				new Integer(200), new Integer(23), new Integer(-25)
				);
		//List<Integer> filteredList = filterList(allNos, positive);
		List<Integer> filteredList = filterList(allNos, between10and100.and(moreThan20));
		filteredList.forEach(System.out::println);
	}

	public static List<Integer> filterList(List<Integer> allNos, Predicate<Integer> predicate) {
		List<Integer> filterList = new ArrayList<Integer>();
		for(Integer no : allNos) {
			if(predicate.test(no)) {
				filterList.add(no);
			}
		}
		return filterList;
	}
}
