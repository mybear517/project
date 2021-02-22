package functionpack;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
        //Math.random()
		Supplier<String> helloStr = () -> new String("Hello ");
		System.out.println(" String = " + helloStr.get());
		
		Supplier<Date> currDate = SupplierDemo::getDate;
		System.out.println(" Date = " + currDate.get());
	}
	
	public static Date getDate() {
		  return new Date();
	}

}
