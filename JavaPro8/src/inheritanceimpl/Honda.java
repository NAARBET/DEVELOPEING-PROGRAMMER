package inheritanceimpl;

public class Honda extends HeroHonda {
	String newdesign = "alloy wheels";
	String newbike = "Honda";
	String newmodalName = "Hunk";
	int newReleasedon = 2011;
	int newprice = 80000;

	public static void main(String[] args) {
		Honda a = new Honda();

		System.out.println("Brand name    :" + a.name);
		System.out.println("Modal name    :" + a.modalName);
		System.out.println("Bike price    :" + a.price);
		System.out.println("Bike launched :" + a.Releasedon);
		System.out.println("Bike design   :" + a.design);
		System.out.println();
		System.out.println("Brand name    :" + a.newbike);
		System.out.println("Modal name    :" + a.newmodalName);
		System.out.println("Bike price    :" + a.newprice);
		System.out.println("Bike launched :" + a.newReleasedon);
		System.out.println("Bike design   :" + a.newdesign);
	}

}
