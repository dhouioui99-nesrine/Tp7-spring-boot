package com.example.API.entity;

public class Owner {
    

    private Long id;
   
	private String name;
   
	private String contactInformation;



     public Owner(Long id, String name, String contactInformation) {
		this.id = id;
		this.name = name;
		this.contactInformation = contactInformation;
	}

	public Owner() {
	}

	public Integer getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
     public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactInformation() {
		return contactInformation;
	}
	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}
}
