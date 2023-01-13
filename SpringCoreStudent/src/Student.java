
public class Student {

	private int roll;
	private String name;
	private int marks;
	private String branch;
	private Address add;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public Student(int roll, String name, int marks, String branch, Address add) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.branch = branch;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", branch=" + branch + ", add=" + add
				+ "]";
	}

	
	public Student() {
		// TODO Auto-generated constructor stub
	}
}