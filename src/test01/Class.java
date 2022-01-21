package test01;

public class Class {

	public static void main(String[] args) {
	
		//클래스 생성 및 객체 생성, 상속, 오버라이드, 메소드 호출
		/*Parent pa = new Parent(23, 45);
		Child ch = new Child(1,2,3,4,5,6);
		
		pa.calculate();
		System.out.println();
		ch.calculate();
		ch.output();*/
		
	int result1 = Static.plus(1, 2);
	int result2 = Static.minus(10, 2);
	System.out.println(result1 + " " + result2);
	
	int result3	= Static.plus(1, 2);
	System.out.println(result3);
	
	
	
	}
}
