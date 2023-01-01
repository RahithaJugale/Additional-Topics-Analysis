package com.faith.model;

public class Cuboid extends Geo_objects{

	//instance variables
	public double length;
    public double breadth;
    public double height;
    
    //parameterized constructor
    public Cuboid(double length, double breadth, double height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	//getters and setters
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double get_volume() {
		return this.length * this.breadth  * this.height;
	}

}
