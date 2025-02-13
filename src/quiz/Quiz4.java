package quiz;

public class Quiz4 {

	public static void main(String[] args) {
		
		int math = 90;
		int eng = 70;
		int kr = 100;
		
		// 총점
		int sum = math + eng + kr; // 260
		
		// 평균: 총점/과목수
		System.out.println(sum/3); // 86, 값이 손실됨
		
		// 구하고 싶은 값은 실수
		// 계산과정도 실수로 계산해야 함
		System.out.println((float)sum/3); // 86.666664
		System.out.println(sum/3.0); // 86.66666666666667
		
	}

}
