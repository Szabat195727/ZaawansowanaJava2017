package transition.technologies.unittesting.mockito.examples;

import java.util.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Person {
	
	private String name;
	
	private String surname;
	
	private String address;
	
	private String city;
	
	private String country;
	
	private int age;
	
	private Date lastReadForReporting;

	public Person(String name, String surname, String address, String city,
			String country, int age, Date lastReadForReporting) {
		super();
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.city = city;
		this.country = country;
		this.age = age;
		this.lastReadForReporting = lastReadForReporting;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getLastReadForReporting() {
		return lastReadForReporting;
	}

	public void setLastReadForReporting(Date lastReadForReporting) {
		this.lastReadForReporting = lastReadForReporting;
	}
	
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}





	/**
	 * Builder for class Person.
	 * @author strobinl
	 */
	public static class PersonBuilder {
		private String name;
		private String surname;
		private String address;	
		private String city;
		private String country;
		private int age;
		private Date lastReadForReporting;
		
		
		public PersonBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public PersonBuilder surname(String surname) {
			this.surname = surname;
			return this;
		}
		
		public PersonBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public PersonBuilder city(String city) {
			this.city = city;
			return this;
		}
		
		public PersonBuilder country(String country) {
			this.country = country;
			return this;
		} 
		
		public PersonBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public PersonBuilder lastReadForReporting(Date lastReadForReporting) {
			this.lastReadForReporting = lastReadForReporting;
			return this;
		}
		
		public Person getPerson() {
			return new Person(name, surname, address, city, country, age, lastReadForReporting);
			
		}
		
	}
	
	

}
