package lambda;

public class MainApp {

	public static void main(String[] args) {
		
		// 익명 클래스
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello World");		
			}
		});
		
		// 람다식 적용
		Thread t2 = new Thread(() -> {
			System.out.println("Hello World");
		});
		
		t1.start();
		t2.start();
		
		
		// 1단계
		test(new MyInterface() {
			@Override
			public int add(int x, int y) {
				return x + y;
			}
		});
		
		// 2단계
		test((int x, int y) -> {
			return x + y;
		});
		
		// 3단계 (간단한 처리를 할 때만 쓸 수 있다. 여러 줄은 블록을 써야 한다.
		test((x, y) ->  x + y);	// 표준 람다식
		
		lambdaTest(10, 20, (x, y) -> x + y);
	}
	
	public static void test(MyInterface i) {
	}
	
	public static void lambdaTest(int a, int b, MyInterface i) {
		System.out.println(i.add(a, b));
	}
}
