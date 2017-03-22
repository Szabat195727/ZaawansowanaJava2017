package transition.technologies.unittesting.mockito.routefinder;

public class RouteObtainerService {

	private RouteCache routeCache;
	
	private RouteCalculatorWebService finderService;

	public RouteObtainerService(RouteCache routeCache,
			RouteCalculatorWebService finderService) {
		super();
		this.routeCache = routeCache;
		this.finderService = finderService;
	}
	
	
	/**
	 * Metoda dzialania jest nastepujca:
	 * 
	 * 1. jesli cache zawiera adress dla podanych adresow poczatkowych i 
	 * koncowych, zwraca Route ktory jest w cache
	 * 2. jesli cache nie zawiera adresu - czyli zwraca null - pytany jest webservice i zwracana jest droga znaleziona tam
	 * 3. jesli webservice rzuci wyjatek sieciowy - metoda rzuca wyjatek biznesowy CannotFindRouteException
	 * 
	 * @param startAdress
	 * @param endAdress
	 * @return
	 */
	public Route getRoute(Adress startAdress, Adress endAdress) throws CannotFindRouteException {
		
		Route routeFromCache = routeCache.getRouteFromCache(startAdress, endAdress);
		
		if (routeFromCache != null) return routeFromCache;
		
		return null;
	}
	
	
}
