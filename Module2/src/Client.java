
public class Client {
private String FirstName;
private String LastName;
private Integer SocialSecurityNumber;


public Client() {
	
}
public Client(String FirstName, String LastName, Integer SocialSecurityNumber) {
	
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
public Integer getSocialSecurityNumber() {
	return SocialSecurityNumber;
}
public void setSocialSecurityNumber(Integer socialSecurityNumber) {
	SocialSecurityNumber = socialSecurityNumber;
}
@Override
public String toString() {
	return "Client [FirstName=" + FirstName + ", LastName=" + LastName + ", SocialSecurityNumber="
			+ SocialSecurityNumber + "]";
}



}
