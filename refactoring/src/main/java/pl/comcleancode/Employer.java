package pl.comcleancode;

public class Employer {

	private String name;
	private int salary;
	private String sex;

	public Employer(String name, int salary, String sex) {
		super();
		this.name = name;
		this.salary = salary;
		this.sex = sex.toUpperCase();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
