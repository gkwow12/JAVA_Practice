package test02;

import java.util.Scanner;

public class EX03_이중for문 {

	public static void main(String[] args) {
		
		//별이 얼마나 찍힐 지 수 입력
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//배열 선언
		int num[][] = new int[a][b];
		
		//메소드 호출
		printMatri(a,b);
	}
	
	//별이 나올 수 있도록 메소드 (앞에서 넣은 a,b의 값을 아래에 aMax, bMax에 던짐)
	public static void printMatri(int aMax, int bMax) {
			//i열은 a만큼, j열은 b만큼 나오게 설정
			for(int i=0; i<aMax; i++) {
			for(int j=0; j<bMax; j++) {
			System.out.print("* ");
			}
			System.out.println();
			}
		}
	}

		