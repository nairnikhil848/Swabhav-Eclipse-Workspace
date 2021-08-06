package com.techlab;

public class AUDIFactory implements IAutoFactory {

	private static AUDIFactory factory;
	
	public static AUDIFactory getInstance() {
		if(factory == null) {
			synchronized(AUDIFactory.class) {
				if(factory == null) {
					factory = new AUDIFactory();
				}
			}
		}
		return factory;
	}
	
	@Override
	public IAuto make() {
		// TODO Auto-generated method stub
		return new AUDI();
	}

}
