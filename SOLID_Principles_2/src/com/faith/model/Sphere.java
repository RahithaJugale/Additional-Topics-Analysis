package com.faith.model;

public class Sphere extends Geo_objects{

	//instance variables
	public double radius;
	
	//parameterized constructor
	public Sphere(double radius) {
		super();
		this.radius = radius;
	}

	//getters and setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double get_volume() {
		return (4 / 3) * Math.PI * radius * radius * radius;
	}

}
