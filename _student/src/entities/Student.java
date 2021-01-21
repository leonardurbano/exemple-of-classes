package entities;

public class Student {

	public String name;
	public double gradePointA;
	public double gradePointB;
	public double gradePointC;

	public double sum() {
		return gradePointA + gradePointB + gradePointC;
	}

	public double missing() {
		return 60.00 - sum();
	}

}
