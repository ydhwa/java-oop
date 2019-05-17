package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			int a = 0;
			System.out.println("Some Codes.....");
			int k = 10000000 / a;
			System.out.println("More Codes.....1");
			System.out.println("More Codes.....2");
		} catch (ArithmeticException e) {
			// 1. 로그 남기기... (파일)
			System.out.println("error: " + e);
			
			// 2. 사과
			System.out.println("죄송합니다.");
			
			// 3. 정상종료(에러 페이지로 리다이렉트)
			return ;
			
			// 4. 1~3 이거라도 안되면
			// e.printStackTrace(); 라도 찍어둬야 한다.
		} finally {
			System.out.println("자원정리");
		}
	}

}
