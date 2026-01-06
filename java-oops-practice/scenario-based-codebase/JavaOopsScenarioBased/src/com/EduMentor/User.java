package com.EduMentor;

public abstract class User implements ICertifiable{
	
	private String name;
	private String email;
	private int userId;
	
	User(String name, String email, int userId){
		this.setName(name);
		this.email = email;
		this.setUserId(userId);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == " ") {
			System.out.println("Invalid user name");
		}else {
		this.name = name;
		}
	}
	public String getEmail() {
		return email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		if(userId < 1) {
			System.out.println("Invalid user Id");	
		}else {
		this.userId = userId;
		}
	}

	@Override
	abstract public String generateCertificate(double d) ;
		
	
	
	
}
