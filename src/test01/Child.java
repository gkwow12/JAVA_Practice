package test01;

<<<<<<< HEAD
public class Child extends Parent{

int y;
int x;
int z;
 
//오바라이드
public void calculate() {
	System.out.println(a + "+" + b + "+" + c + "+" + y +"+" + x + "+" + z);
}
public void output() {
	System.out.println("총합은 : "+ a + "+" + b + "+" + c + "+" + y +"+" + x + "+" + z);
}
	
public Child()  {
	
}

public Child(int a, int b, int c, int y, int x, int z) {
	super(a,b,10);
	
	this.y = y;
	this.x = x;
	this.z = z;
}
}
=======
class  Parent {

	   public void method( ) {   }

	}

	class Child extends Parent {

		public void method( int i ) { }
	}
>>>>>>> refs/remotes/origin/master
