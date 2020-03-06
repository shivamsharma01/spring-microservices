package com.in28minutes.microservices.limitsservice.controller;

public class LimitConfiguration {

	private int maximum;
	private int minimum;

	protected LimitConfiguration() {
	}

	protected LimitConfiguration(int maximum, int minimum) {
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public int getMinimum() {
		return minimum;
	}

}
