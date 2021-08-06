package com.techlab.test;

import com.techlab.model.CarInspection;
import com.techlab.model.IService;
import com.techlab.model.wrappers.OilChange;
import com.techlab.model.wrappers.TyreRotation;

public class Test {
	public static void main(String[] args) {

		IService service = new OilChange(new TyreRotation(new CarInspection()));
		System.out.println(service.totalCost());
		System.out.println(service.getDetatils());
	}
}
