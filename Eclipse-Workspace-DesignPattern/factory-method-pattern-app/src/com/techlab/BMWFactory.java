package com.techlab;

public class BMWFactory implements IAutoFactory {

	private static BMWFactory factory;
	
	public static BMWFactory getInstance() {
		if(factory == null) {
			synchronized(BMWFactory.class) {
				if(factory == null) {
					factory = new BMWFactory();
				}
			}
		}
		return factory;
	}
	@Override
	public IAuto make() {
		// TODO Auto-generated method stub
		return new BMW();
	}

}
