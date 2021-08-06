package com.techlab.model;

public enum Builder {
	FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

	public String toString() {
		switch(this) {
			case FENDER: return "Fender";
			case MARTIN: return "Martin";
			case GIBSON: return "Gibson";
			case COLLINGS: return "Collings";
			case OLSON: return "Olson";
			case PRS: return "Prs";
			case ANY: return "Any";
			case RYAN: return "Ryan";
	 }
		return null;
	}
}
