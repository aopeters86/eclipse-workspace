
public class Person {
	
	String FirstName;
	String LastName;
	Integer UIN;



public Person() {

}

public Person(String firstName, String lastName, Integer uIN) {
	FirstName = firstName;
	LastName = lastName;
	UIN = uIN;
}

public String getFirstName() {
	return FirstName;
}

public void setFirstName(String firstName) {
	FirstName = firstName;
}

public String getLastName() {
	return LastName;
}

public void setLastName(String lastName) {
	LastName = lastName;
}

public Integer getUIN() {
	return UIN;
}

public void setUIN(Integer uIN) {
	UIN = uIN;
}

@Override
public String toString() {
	return "Person [FirstName=" + FirstName + ", LastName=" + LastName + ", UIN=" + UIN + "]";
}



}