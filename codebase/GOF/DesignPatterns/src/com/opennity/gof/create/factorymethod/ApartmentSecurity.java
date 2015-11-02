package com.opennity.gof.create.factorymethod;

public class ApartmentSecurity extends Security {



	@Override
	public boolean turnOnSecurity() {
		return checkSocietySecurityStatus();
	}

	@Override
	public boolean turnOffSecurity() {
		return false;
	}

	/**
	 * just a mean to diff implmentation between bungalow and apartment
	 * @return
	 */
	private boolean checkSocietySecurityStatus(){

		return true;

	}

}
