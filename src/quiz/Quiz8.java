package quiz;

public class Quiz8 {

	public static void main(String[] args) {
		
		// 50 < x < 100 범위에 포함되는지 확인하시오
		int x = 80;
		boolean result1 = (x > 50) && (x < 100);
		System.out.println(result1); // true
		// x는 범위에 포함이 된다
		
		// y가 10보다 작거나 30보다 큰지 확인하시오
		int y = 5;
		boolean result2 = (y < 10) || (y > 30);
		System.out.println(result2); // true
		
	}

}
