package com.technologies.transition.codesmells.instanceofs;

public class Employee {

	private String companyName;

	private double salary;
	
	private int numberOfYearsInCompany;
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getNumberOfYearsInCompany() {
		return numberOfYearsInCompany;
	}

	public void setNumberOfYearsInCompany(int numberOfYearsInCompany) {
		this.numberOfYearsInCompany = numberOfYearsInCompany;
	}

}
