package com.techlab.test;

import com.techlab.model.CustomerDB;
import com.techlab.model.DepartmentDB;
import com.techlab.model.iCrudable;
import com.techlab.model.invoiceDB;

public class iCrudableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		doDBoperation(new DepartmentDB());
		doDBoperation(new CustomerDB());
		doDBoperation(new invoiceDB());
	}
	private static void doDBoperation(iCrudable c) {
		c.create();
		c.read();
		c.update();
		c.delete();
	}

}
