package exception;

public class MyClassTest {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		try {
			myClass.dangerMethod();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}
