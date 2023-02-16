
public class Staff {
private String FirstName;
private String LastName;
private String Department;
private String Title;
private Integer UIN;
	
public Staff(){
	
}

public Staff(String FirstName, String LastName, String Department, String Title, Integer UIN) {
	
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

public String getTitle() {
	return Title;
}

public void setTitle(String title) {
	Title = title;
}

public Integer getUIN() {
	return UIN;
}

public void setUIN(Integer uIN) {
	UIN = uIN;
}

@Override
public String toString() {
	return "Staff [FirstName=" + FirstName + ", LastName=" + LastName + ", Department=" + Department + ", Title="
			+ Title + ", UIN=" + UIN + "]";
}



}
