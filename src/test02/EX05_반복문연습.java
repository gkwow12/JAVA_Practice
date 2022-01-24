package test02;

public class EX05_반복문연습 {

	public static void main(String[] args) {
		
		/*//1  6  11  16 ...
		for(int n=1; n<=5; n++) {
			System.out.print(1+(n-1)*5);
		System.out.println();
		}*/
		
		/*for(int y=0; y<3; y++) {
			for(int x=1; x<=3; x++) 
				System.out.printf("%d",y*3+x);
				System.out.println();
		}*/
	
		//오목판 출력, 오목 두기
		
		for(int y=1; y<11; y++ ) {
			for(int x=1; x<11; x++) {
			
			if(x==4 && y==3) {
				System.out.printf("%c",'o');
			}else {
			//System.out.printf("%c",'+');
			System.out.print('+');
		
			
			}	
		}System.out.println();
		
		
	}

}
}