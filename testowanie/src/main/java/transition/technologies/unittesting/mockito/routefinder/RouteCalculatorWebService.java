package transition.technologies.unittesting.mockito.routefinder;

import java.net.ConnectException;

import javax.net.ssl.SSLException;
import javax.xml.ws.WebServiceException;

public interface RouteCalculatorWebService {

	public abstract Route findRoute(Adress startAdress, Adress endAdress)
			throws WebServiceException, ConnectException, SSLException;

}