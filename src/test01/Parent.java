package test01;

public class Parent {
	//필드 선언

 int a;
 int b;
 int c;

public void calculate() {
	System.out.println(a + "+" + b + "+" + c);
}

public Parent() {
}

public Parent(int a , int b) {
	this(a,b,10);
}

public Parent(int a, int b, int c) {
	this.a = a;
	this.b = b;
	this.c = c;
}

//static -> getter / setter

}