package transition.technologies.unittesting.mockito.examples;

import java.util.List;

public interface PersonDao {

	public List<Person> getAllPersons() throws PersonDaoException;

	public Person getPerson(int pesel) throws PersonDaoException;

	public void updatePerson(Person person) throws PersonDaoException;

	public void deletePerson(Person student) throws PersonDaoException;
	
	public Person findByName(String name) throws PersonDaoException;
	
}
