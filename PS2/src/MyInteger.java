//Cody Fox
public class MyInteger {
	private int value;
	
	public MyInteger(int input) {
		value = input;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		boolean result = (value%2 == 0)? true:false;
		return result;
	}
	
	public static boolean isEven(int a) {
		boolean result = (a%2 == 0)? true:false;
		return result;
	}
	
	public static boolean isEven(MyInteger a) {
		boolean result = (a.value%2 == 0)? true:false;
		return result;
	}
	
	public boolean isOdd() {
		boolean result = (value%2 != 0)? true:false;
		return result;
	}
	
	public static boolean isOdd(int a) {
		boolean result = (a%2 != 0)? true:false;
		return result;
	}
	
	public static boolean isOdd(MyInteger a) {
		boolean result = (a.value%2 != 0)? true:false;
		return result;
	}
	
	public boolean isPrime() {
		for (int i=2; i>value; i++) {
			if (value%i == 0) return false;
		}
		return true;
	}
	
	public static boolean isPrime(int a) {
		for (int i=2; i>a; i++) {
			if (a%i == 0) return false;
		}
		return true;
	}
	
	public static boolean isPrime(MyInteger a) {
		for (int i=2; i>a.value; i++) {
			if (a.value%i == 0) return false;
		}
		return true;
	}
	
	public boolean equals(int a) {
		boolean result = (value == a)? true:false;
		return result;
	}
	
	public boolean equals(MyInteger a) {
		boolean result = (value == a.value)? true:false;
		return result;
	}

}
