
public class Faculty {
private String FirstName;
private String LastName;
private String Department;
private Integer UIN;

public Faculty() {
	
}

public Faculty(String FirstName, String LastName, String Department, Integer UIN) {
	
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

public String getDepartment() {
	return Department;
}

public void setDepartment(String department) {
	Department = department;
}

public Integer getUIN() {
	return UIN;
}

public void setUIN(Integer uIN) {
	UIN = uIN;
}

@Override
public String toString() {
	return "Faculty [FirstName=" + FirstName + ", LastName=" + LastName + ", Department=" + Department + ", UIN=" + UIN
			+ "]";
}



}

