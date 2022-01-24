package test02;

import java.util.Scanner;

public class EX02_윤년계산 {

	public static void main(String[] args) {
		
		// 입력값 받기
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		// 윤년 계산하는 메소드 호출
		boolean output = isLeapYear(year);
		
		System.out.printf("%d는 윤년입니까? %s", year, output	);
	}

	public static boolean isLeapYear(int year) {
		
		// 결과값은 false 로 지장(기본이라서)
		boolean result = false;
		//윤년이 맞으면 true / 아니면 false
		if((year%4) == 0) {
			result = true;
			if((year%100)==0) {
				result = false;
				if((year%1000)==0) {
					result = true;
				}
			}
		}
		//결과값 반환
		return result;
	}
	
	
}

