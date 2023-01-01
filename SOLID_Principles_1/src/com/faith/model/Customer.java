package com.faith.model;

public class Customer {
	
	//instance variables
	private String name;
    private String address;
    
    //parameterized constructor
    public Customer(String name, String address) {
    	super();
    	this.name = name;
    	this.address = address;
    }    
    
    //getters and setters
    public String getName() {
    	return name; 
    }
    

	public void setName(String name) {
    	this.name = name; 
    }
    
    public String getAddress() {
    	return address; 
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
}
