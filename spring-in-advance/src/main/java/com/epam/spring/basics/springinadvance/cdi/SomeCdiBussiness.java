package com.epam.spring.basics.springinadvance.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBussiness {

	@Inject
	private SomeCdiDao someCDIDAO;

	public SomeCdiDao getSomeCDIDAO() {
		return someCDIDAO;
	}

	public void setSomeCDIDAO(SomeCdiDao someCDIDAO) {
		this.someCDIDAO = someCDIDAO;
	}

}
