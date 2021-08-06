package com.techlab;

public class AutomobileFactory {

	private static BMW bmw;
	private static AUDI audi;
	private static TESLA tesla;


	public static IAuto make(AutoType type) {

		switch(type) {
		case BMW:
			if(bmw == null) {
				bmw =  new BMW();
			}
			return bmw;
		case AUDI:
			if(audi == null) {
				audi =  new AUDI();
			}
			return audi;


		case TESLA:
			if(tesla == null) {
				tesla =  new TESLA();
			}
			return audi;

		default:
			return null;
		}
	}
}
