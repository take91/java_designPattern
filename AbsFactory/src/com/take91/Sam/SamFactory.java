package com.take91.Sam;

import com.take91.abst.BikeFactory;
import com.take91.abst.Body;
import com.take91.abst.Wheel;

public class SamFactory implements BikeFactory{

	@Override
	public Body createBody() {
		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		return new SamWheel();
	}
	
}
