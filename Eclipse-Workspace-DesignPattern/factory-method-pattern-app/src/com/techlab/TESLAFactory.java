package com.techlab;

public class TESLAFactory implements IAutoFactory{
	
	private static TESLAFactory factory;
	
	public static TESLAFactory getInstance() {
		if(factory == null) {
			synchronized(TESLAFactory.class) {
				if(factory == null) {
					factory = new TESLAFactory();
				}
			}
		}
		return factory;
	}
	
	@Override
	public IAuto make() {
		// TODO Auto-generated method stub
		return new TESLA();
	}

}
