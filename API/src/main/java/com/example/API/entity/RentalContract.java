package com.example.API.entity;

public class RentalContract {
    
 private Long id;
  
	private Property property;
   
	private Owner owner ;
    
	private String tenant ;
   
	private Double monthlyRent;


public RentalContract() {
	}



public RentalContract(Long id, Property property, Owner owner, String tenant, Double monthlyRent) {
		this.id = id;
		this.property = property;
		this.owner = owner;
		this.tenant = tenant;
		this.monthlyRent = monthlyRent;
	}
public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

 public Property getProperty() {
		return property;
	}
	public void setProperty(Property property) {
		this.property = property;
	}
public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}



 public String getTenant() {
		return tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

 public Double getMonthlyRent() {
		return monthlyRent;
	}
	public void setMonthlyRent(Double monthlyRent) {
		this.monthlyRent = monthlyRent;
	}
    
}
