package transition.technologies.unittesting.mockito.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonReportFormatter {

	private PersonDao personDao;

	public PersonReportFormatter(PersonDao personDao) {
		super();
		this.personDao = personDao;
	}
	
	public String createFormattedPersonsInAgeRange(int minAge, int maxAge) throws PersonDaoException {
		
		StringBuilder personReport = new StringBuilder();
		
		List<Person> allPersons = null;
	
		allPersons = personDao.getAllPersons();
		
		if (allPersons == null) allPersons = new ArrayList<Person>();
		
		for (Person person : allPersons) {
			if (person.getAge() < maxAge || person.getAge() > minAge) {
				personReport.append(person.getName());
				personReport.append("-");
				personReport.append(person.getSurname());
				personReport.append("\n");
			}
		}
		
		return personReport.toString();
	}
	
	public String formatPerson(int pesel) throws PersonDaoException {
		
		Person person = personDao.getPerson(pesel);
		
		StringBuilder personReport = new StringBuilder();
		personReport.append(person.getName());
		personReport.append("-");
		personReport.append(person.getSurname());
		personReport.append("\n");
		
		person.setLastReadForReporting(new Date());
		
		return personReport.toString();
	}
	
	public String createFormattedPersonsFromCities(Collection<String> cities) throws PersonDaoException {
		StringBuilder personReport = new StringBuilder();
		
		Set<String> citiesSet = new HashSet<String>(cities);
		
		List<Person> allPersons = null;
		try {
			allPersons = personDao.getAllPersons();
		} catch (PersonDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Person person : allPersons) {
			if (citiesSet.contains(person.getCity())) {
				personReport.append(person.getName());
				personReport.append("-");
				personReport.append(person.getSurname());
				personReport.append("\n");
				
				person.setLastReadForReporting(new Date());
				personDao.updatePerson(person);
			}
		}
		
		return personReport.toString();
	}
	
	
}









