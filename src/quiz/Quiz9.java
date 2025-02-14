package quiz;

public class Quiz9 {

	public static void main(String[] args) {
		
		// 5가 3보다 크면, 문자 '오'를 출력하고, 아니면 문자 '삼'을 출력하세요
		// 조건식 ? 참일때 값 : 거짓일때 값;
		char ch = (5>3) ? '오' : '삼';
		System.out.println(ch);

		// 다음 코드를 보고 풀이과정과 예상 결과값을 주석으로 작성하시오
		int x = 10;
		int y = 20;
		int result = (x>10) ? y+10 : y-10; // (10>10) ? 20+10 : 20-10, 10은 10보다 크지 않으므로 거짓이므로 result에 대입되는 값은 10이다
		// false > y+10 : y-10
		// y-10 => 20-10 = 10
		System.out.println(result); // 10
		
	}

}
