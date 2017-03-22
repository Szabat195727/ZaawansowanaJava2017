package transition.technologies.unittesting.mockito.routefinder;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Route {
	
	private Adress startAdress;
	
	private Adress endAdress;
	
	private List<Adress> routePoints;

	public Route(Adress startAdress, Adress endAdress, List<Adress> routePoints) {
		super();
		this.startAdress = startAdress;
		this.endAdress = endAdress;
		this.routePoints = routePoints;
	}

	public Adress getStartAdress() {
		return startAdress;
	}

	public void setStartAdress(Adress startAdress) {
		this.startAdress = startAdress;
	}

	public Adress getEndAdress() {
		return endAdress;
	}

	public void setEndAdress(Adress endAdress) {
		this.endAdress = endAdress;
	}

	public List<Adress> getRoutePoints() {
		return routePoints;
	}

	public void setRoutePoints(List<Adress> routePoints) {
		this.routePoints = routePoints;
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
}
