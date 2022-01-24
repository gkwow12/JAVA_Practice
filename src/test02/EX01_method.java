package test02;

public class EX01_method {

	public static void main(String[] args) {
		
		int z = square(3);
		System.out.println(z);

	}

	public static int square(int i) {
		int result;
		result = i*i;
		return result;
	}

}
