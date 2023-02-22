

public class Student extends Person{
	
//	private String FirstName;
//	private String LastName;
	private String Major;
	private String Minor;
//	private Integer UIN;
	private Double GPA;


public Student() {
}
//overloaded 
public Student(String firstName, String lastName, String major, String minor, Integer uIN, Double gPA) {
super.FirstName = firstName;
super.LastName = lastName;
Major = major; 
Minor = minor; 
UIN = uIN;
GPA = gPA;
}

public String getFirstName() {
	return FirstName;
}


public void setFirstName(String firstName) {
	super.FirstName = firstName;
}

public String getLastName() {
	return LastName;
}

public void setLastName(String lastName) {
	super.FirstName = lastName;
}

public String getMajor() {
	return Major;
}

public void setMajor(String major) {
	Major = major;
}

public String getMinor() {
	return Minor;
}

public void setMinor(String minor) {
	Minor = minor;
}

public Integer getUIN() {
	return UIN;
}

public void setUIN(Integer uIN) {
	this.UIN = uIN;
}

public Double getGPA() {
	return GPA;
}

public void setGPA(Double gPA) {
	GPA = gPA;
}

@Override
public String toString() {
	return "Student [FirstName=" + FirstName + ", LastName=" + LastName + ", Major=" + Major + ", Minor=" + Minor
			+ ", UIN=" + UIN + ", GPA=" + GPA + "]";
}



}