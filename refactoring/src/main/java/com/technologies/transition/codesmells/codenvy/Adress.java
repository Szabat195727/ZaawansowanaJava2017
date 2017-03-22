package com.technologies.transition.codesmells.codenvy;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Adress {
	
	private String country;
	
	private String city;
	
	private String postalCode;
	
	private String streetName;
	
	private int streetNumber;
	
	private int apartmentNumber;

	public Adress(String country, String city, String postalCode,
			String streetName, int streetNumber, int apartmentNumber) {
		super();
		this.country = country;
		this.city = city;
		this.postalCode = postalCode;
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.apartmentNumber = apartmentNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public int getApartmentNumber() {
		return apartmentNumber;
	}

	public void setApartmentNumber(int apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}
	

	@Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }

    
public String createPostalOfficeMailAddress() {
		
		StringBuilder sb = new StringBuilder ();
	    sb.append(streetName);
	    sb.append("\n");
	    sb.append(this.getCity() + ", " + this.getCountry());
	    sb.append("\n");
	    sb.append(this.getPostalCode());
	    
	    return sb.toString();
	}
}
