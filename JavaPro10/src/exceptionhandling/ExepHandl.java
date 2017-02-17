package exceptionhandling;

public class ExepHandl {
	public static void main(String[] a) {
		try {
			int ab[] = new int[2];
			System.out.println("Element Access   :" + ab[2]);
		} catch (Exception e) {
			System.out.println("Exception thrown  :" + e);
		}
		System.out.println(".......This is an program for exception handling........");
	}
}
