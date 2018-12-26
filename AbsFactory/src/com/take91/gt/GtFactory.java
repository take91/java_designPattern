package com.take91.gt;

import com.take91.abst.BikeFactory;
import com.take91.abst.Body;
import com.take91.abst.Wheel;

public class GtFactory implements BikeFactory{

	@Override
	public Body createBody() {
		return new GtBody();
	}

	@Override
	public Wheel createWheel() {
		return new GtWheel();
	}

}
