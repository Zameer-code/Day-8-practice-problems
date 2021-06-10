package com.employeewage;

	
public class Person {

	  public static void main(String[] args) {
	    System.out.println("Welcome to address book");
	  }
	
	    
	  @Override
public String toString() {
	return "Person [firstname=" + firstName + ", lastname=" + lastName + ", address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", phone=" + phone + ", email=" + email + "]";
}
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private int phone;
	private String email;
	

	
    public String getFirstname() {
		return firstName;
	}

    public void setFirstname(String firstname) {
		this.firstName = firstname;
		
    }
    public String getLastname() {
		return lastName;
	}
    public void setLastname(String lastname) {
		this.lastName = lastname;
   	}

    public String getAddress() {
	return address;
    }
    public void setAddress(String address) {
		this.address = address;
	}
    public String getCity() {
		return city;
	}
    public void setCity(String city) {
		this.city = city;
   	}
    public String getState() {
		return state;
    }
    public void setState(String state) {
		this.state = state;
   	}
    public int getZip() {
    	return zip;
    }
    public void setZip(int zip) {
		this.zip = zip;
   	}
    public int getPhone() {
    	return phone;
    }
    public void setPhone(int phone) {
		this.phone = phone;
   	}
    public String getEmail() {
		return email;
    }
    
    public void setEmail(String email) {
		this.email = email;
 	}
		
}

	

