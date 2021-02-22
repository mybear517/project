/* 
 * FunctionalInterfaces ===============
 * 
 * Predicate -> It checks a condition and returns boolean
 *              boolean test(T t) - abstract method.
 *              
 * Consumer -> Accepts an agrument does not return anything
 *             void accept(T t)
 *             
 * Supplier -> Does not accept any argument but returns a value
 *             T get();
 *             
 *  Function -> Accepts argument and returns a value 
 *             usually to convert value into another format.
 *              R apply(T t);
 *              
 *  There is one more void m(); does not accept or return.  Don't use
 */
package functionpack;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		List<Integer> allNos = Arrays.asList(
				new Integer(1),	new Integer(10), new Integer(20),
				new Integer(-3), new Integer(-10), new Integer(0),
				new Integer(200), new Integer(23), new Integer(-25)
				);
		Consumer<Integer> consumer = i -> System.out.print("Data -" + i);
		printList(allNos, consumer.andThen(i -> System.out.println("  Square-" + i*i)));

	}
	public static void printList(List<Integer> allNos, Consumer<Integer> consumer) {
		for(Integer no : allNos) {
			consumer.accept(no);
		}
	}

}
