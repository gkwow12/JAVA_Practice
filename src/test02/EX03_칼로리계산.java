package test02;

public class EX03_칼로리계산 {

	public static void main(String[] args) {
		//3인분 변수 저장
		int num = 3;
		
		//메소드 호출 -> int형을 double 형으로 바꿔주어야 함
		double result = calculate(num);
		System.out.printf("삼겹살%d인분은 %.2f칼로리이다.", num, result);
		
		

	}

	public static double calculate(int num) {
		//1인분당 그램
		int gram = num*180;
		//1인분당 칼로리
		double kcal = gram * 5.179;
		//값 반환
		return kcal;
		
	
	}

}
