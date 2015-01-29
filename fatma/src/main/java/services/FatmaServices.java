package services;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class FatmaServices
 */
@Stateless
public class FatmaServices implements FatmaServicesRemote, FatmaServicesLocal {

	/**
	 * Default constructor.
	 */
	public FatmaServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void wled5mayes(String name) {
		System.out.println("3asléma ya: " + name);

	}

}
