package com.techlab.model;

public enum Designation {
	MANAGER, CLERK,SALESMAN,ANALYST,PRESIDENT;

	public String toString() {
	 switch(this) {
	 	case MANAGER: return "MANAGER";
	 	case CLERK: return "CLERK";
	 	case SALESMAN: return "SALESMAN";
	 	case ANALYST: return "ANALYST";
	 	case PRESIDENT: return "PRESIDENT";
	 }
	 return null;
	}
}
