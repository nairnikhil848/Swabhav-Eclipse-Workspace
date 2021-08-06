package com.techlab.model;

public class AtmMachine implements IAtm {
	
	
	private int cashInMachine;
	
	public AtmMachine(int amount) {
		this.cashInMachine = amount;
	}
	@Override
	public int getCashInMachine() {
		return cashInMachine;
	}
	
	public void setCashInMachine(int cash) {
		cashInMachine = cash;
	}

	@Override
	public int removeCashFromMachine(int amount) {
		this.cashInMachine-=amount;
		return this.cashInMachine;
	}

}
