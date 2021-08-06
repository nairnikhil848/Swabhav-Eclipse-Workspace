package com.techlab.test;

import com.techlab.model.AlarmChecker;
import com.techlab.model.HomeStatusDto;
import com.techlab.model.LightChecker;
import com.techlab.model.LocksChecker;

public class Test {
	public static void main(String[] args) {
		
		LightChecker light = new LightChecker();
		AlarmChecker alarm = new AlarmChecker();
		LocksChecker locks = new LocksChecker();
		light.setNext(alarm);
		alarm.setNext(locks);
		HomeStatusDto dto = new HomeStatusDto();
		
		dto.lightsoff = false;
		dto.alarmOn = true;
		dto.LocksOn = true;
		
		try {
			light.check(dto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		}
		
	}
}
