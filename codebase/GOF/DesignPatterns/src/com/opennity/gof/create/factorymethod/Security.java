package com.opennity.gof.create.factorymethod;

public abstract class Security {

	abstract public boolean turnOnSecurity();
	abstract public boolean turnOffSecurity();

	@Override
	public String toString(){

		return getClass().getSimpleName();

	}
}
