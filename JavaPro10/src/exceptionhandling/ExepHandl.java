package exceptionhandling;

public class ExepHandl {
	public static void main(String[] a) {
		try {
			int ab[] = {1,2,3};
			System.out.println("Element Access   :" + ab[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown  :" + e);
		}
		System.out.println(".......This is an program for exception handling........");
	}
}
