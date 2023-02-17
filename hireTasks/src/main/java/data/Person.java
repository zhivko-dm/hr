package data;

public class Person{

	String firstName;
	String lastname;
	String gender;
	
	public Person(String firstName, String lastName) {
		this.firstName= firstName;
		this.lastname=lastName;
	}
	String getFirstName() {
		return firstName;
	}
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	String getLastName() {
		return lastname;
	}
	void setLastName(String lastName) {
		this.lastname = lastName;
	}
	
	String getGender() {
		return gender;
	}
	void setGender(String gender) {
		this.gender = gender;
	}

	public String toString() {
		return super.toString();
	}
}
