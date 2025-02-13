package quiz;

public class Quiz2 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20; 
		int result = (x++) + (--y); // 29 = 10 + 19
		
		System.out.println(x); // 11
		System.out.println(y); // 19
		System.out.println(result);

	}

}
