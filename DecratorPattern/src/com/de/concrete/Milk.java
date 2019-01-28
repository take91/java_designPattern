package com.de.concrete;

import com.de.abst.AbstAdding;
import com.de.abst.IBeverage;

public class Milk extends AbstAdding {

	public Milk(IBeverage meterial) {
		super(meterial);
	}
	
	@Override
	public int getTotalPrice() {
		return super.getTotalPrice()+50;
	}
}
