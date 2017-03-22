package pl.comcleancode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Klasa licząca pensje pracowników
 */
public class EmployeeSalaryCalculator {

	private List<Employer> employee;
	
	public EmployeeSalaryCalculator(){
		this.employee = generateEmployee();
	}

    public List<Employer> generateEmployee() {
        List<Employer> employee;
        employee = new LinkedList<>();
        employee.add(new Employer("Marek", 2301, "M"));
        employee.add(new Employer("Grazyna", 1703, "K"));
        employee.add(new Employer("John", 12330, "m"));
        employee.add(new Employer("Helena", 300, "k"));
        return employee;
    }

    public Integer getSumOfSalaryForSex(String sex) {
    	
    	int sum = 0;
    	for (Employer p : this.employee) {
            if (p.getSex().equals(sex)) {
                sum += p.getSalary();
            }
        }
    	
    	return sum;
    }
    
    public Integer getCountEmployeesForSex(String sex) {

    	int count = 0;
    	for (Employer p : this.employee) {
            if (p.getSex().equals(sex)) {
            	count ++;
            }
        }
    	
    	return count;
    }

    
    public Integer getAvgSalaryForSex(String sex){
    	
    	// Filtrowanie pracownikow po plci z lamda
    	List<Employer> employeeWithSex = this.employee.stream().filter(e -> e.getSex().equals(sex)).collect(Collectors.toList());
    	
    	int sum = getSumOfSalaryForSex(sex);
    	int count = getCountEmployeesForSex(sex);
    	
    	if (count != 0){
    		return sum/count;
    	} else {
    		return 0;
    	}
    }

    public static void main(String[] args) {

        try {
        EmployeeSalaryCalculator sth = new EmployeeSalaryCalculator();
        System.out.println("Srednia pensja dla mezczyzn to: ");
        Integer pobsrpen = sth.getAvgSalaryForSex("M");
        
        System.out.println(pobsrpen == 0 ? "Brak mezczyzn" : pobsrpen);

        System.out.println("A dla kobiet to: ");
        Integer pobsrpen1 = sth.getAvgSalaryForSex("K");
        
        System.out.println(pobsrpen1 == 0 ? "Brak kobiet" : pobsrpen1);

        //Zapiszmy do pliku
            File file = new File("something.txt");
            FileWriter fw = new FileWriter(file);
            // jeśli średnia dla mężczyzn jest większa zapisujemy do pliku
            if(pobsrpen>pobsrpen1){
                fw.write(pobsrpen.toString());}
                // a jak nie to kobiety
            if(pobsrpen1>pobsrpen){
                fw.write(pobsrpen1.toString());
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
