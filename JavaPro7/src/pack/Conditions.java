package pack;

import java.awt.List;

class Conditions {
	private int rollno;
	private String name, mark1;
	private int mark;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		if (rollno > 0 && rollno <= 5)
			this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() > 0 && name.length() <= 20)
			this.name = name;
	}

	public float getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getMark1() {
		return mark1;
	}

	public void setMark1() {
		if (this.mark < 40)
			this.mark1 ="fail";
		else
			this.mark1 = "Pass";
	}

}
