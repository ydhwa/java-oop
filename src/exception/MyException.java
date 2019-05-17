package exception;

public class MyException extends Exception {
	// serial number 추가해주는 것이 좋음
	private static final long serialVersionUID = 1L;
	
	public MyException() {
		super("MyException Occurs.....");
	}
	
	public MyException(String message) {
		super(message);
	}
}
