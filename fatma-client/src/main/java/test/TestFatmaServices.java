package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.FatmaServicesRemote;

public class TestFatmaServices {

	public static void main(String[] args) {

		try {
			Context context = new InitialContext();
			FatmaServicesRemote proxy = (FatmaServicesRemote) context
					.lookup("/fatma/FatmaServices!"
							+ FatmaServicesRemote.class.getCanonicalName());
			
			proxy.wled5mayes();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
