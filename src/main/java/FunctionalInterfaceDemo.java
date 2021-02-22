//@FunctionalInterface // Interface MUST contain one and ONLY ONE abstract method

interface Calc {
	int no = 99;
	public int add(int a, int b);
	public default int subtract(int a, int b) {	return a-b; }
	public static int multiply(int a, int b) { return a*b; }

}

class CalcClass implements Calc {
	@Override
	public int add(int a, int b) {
		return 0;
	}
}
public class FunctionalInterfaceDemo {
	public static void main(String[] args) {


		// Anonymous Class
		Calc calcObj = new Calc() {
			public int add(int x, int y) { return x+y; }
			public int substract (int x, int y) { return 0;}
		};
		//Lambda expression - works on interface with one abstract
		Calc newObj = (x, y) -> {return (x+y); };
		System.out.println("Result = "+ newObj.add(3,4));
		System.out.println("Multiply = " + Calc.multiply(3, 4));
	}	
}
