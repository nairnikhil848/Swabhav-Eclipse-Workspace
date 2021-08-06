package com.techlab.model;

public class AtmProxy implements IAtm{

	AtmMachine realAtmMachine;
	public AtmProxy() {
		realAtmMachine = new AtmMachine(2000);
	}
	@Override
	public int getCashInMachine() {
		
		return this.realAtmMachine.getCashInMachine();
	}
	@Override
	public int removeCashFromMachine(int amount) {
		this.realAtmMachine.setCashInMachine(this.realAtmMachine.getCashInMachine() - amount);
		return this.getCashInMachine();
	}

}
