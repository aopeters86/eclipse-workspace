

public class Student {
	private String FirstName;
	private String LastName;
	private String Major;
	private String Minor;
	private Integer UIN;
	private Double GPA;


public Student() {
}

public Student(String FirstName, String LastName, String Major, String Minor, Integer UIN, Double GPA) {
	
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
	UIN = uIN;
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