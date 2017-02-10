package pack;

public class NewProgram {

	public static void main(String[] args) {
		Conditions a = new Conditions();
		a.setRollno(1);
		a.setName("RAMAMNAN");
		a.setMark(30);
		a.setMark1();
		System.out.println("Roll no = " + a.getRollno());
		System.out.println("Name = " + a.getName());
		System.out.println("Mark =" + a.getMark());
		System.out.println("Status =" + a.getMark1());
	}
}
