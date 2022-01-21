package test01;

public class GetterSetter {

	private static int a;
	private static int b;
	private static int c;
	
	public static int getA() {
		return a;
	}
	public static void setA(int a) {
		Static.a = a;
	}
	public static int getB() {
		return b;
	}
	public static void setB(int b) {
		Static.b = b;
	}
	static int plus(int a,int b)	{
		return  ++a +b;
	}
static int minus(int a, int b) {
	return a-b;
}
		
	}

}
