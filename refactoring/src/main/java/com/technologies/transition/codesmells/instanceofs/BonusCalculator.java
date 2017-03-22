package com.technologies.transition.codesmells.instanceofs;

public class BonusCalculator {

	private String companyName;

	public BonusCalculator(String companyName) {
		super();
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public double calculateBonus(Employee employee) {
		double bonus = 0.0;
		
		if (employee instanceof Engineer) {
			if (employee.getNumberOfYearsInCompany() > 3) {
				bonus = employee.getSalary() * 2;
			} else {
				bonus = employee.getSalary() * 1.5;
			}
			
		} else if (employee instanceof Manager) {
			bonus = employee.getSalary() * 0.5;
			
		} else if (employee instanceof Secretary) {
			Secretary secretary = (Secretary) employee;
			if (secretary.getComputerSkillLevel() > 5) {
				bonus = secretary.getSalary() * 2;
			} else {
				bonus = secretary.getSalary();
			}
			
		} else {
			throw new RuntimeException("type not supported: " + employee.getClass().getName());
		}
		
		return bonus;
		
	}
	
}
