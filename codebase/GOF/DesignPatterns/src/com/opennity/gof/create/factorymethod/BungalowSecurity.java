package com.opennity.gof.create.factorymethod;

public class BungalowSecurity extends Security {

	private boolean securityStatus;

	@Override
	public boolean turnOnSecurity() {

		return securityStatus;
	}

	@Override
	public boolean turnOffSecurity() {
		// TODO Auto-generated method stub
		return securityStatus;
	}

}
