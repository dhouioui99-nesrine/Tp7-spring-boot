package com.example.API.entity;

public class Property {
    
private long id ;
   
    private String address ;
    
	private double price;



 
public Property(long id, String address, double price) {
		this.id = id;
		this.address = address;
		this.price = price;
	}



public Property() {
	}


    
public Integer getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}