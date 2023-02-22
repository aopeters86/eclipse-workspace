
public class GraduateStudent extends Student{
	
//	private String FirstName;
//	private String LastName;
	private String Major;
	private String Minor;
//	private Integer UIN;
	private Double GPA;

public GraduateStudent() {
}

public GraduateStudent(String firstName, String lastName, String major, String minor, Integer uIN, Double gPA) {	
	super.FirstName = firstName;
	super.LastName = lastName;
	Major = major;
	Minor = minor;
	super.UIN = uIN;
	GPA = gPA;
}

public Double calculateFinalGrade(Double exam1, Double exam2, Double exam3) {
	Double grade1 = exam1 *.25;
	Double grade2 = exam2 * .25;
	Double grade3 = exam3 * .5;
	Double finalgrade = grade1 + grade2 + grade3;
	return finalgrade;
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
	return "GraduateStudent [FirstName=" + FirstName + ", LastName=" + LastName + ", Major=" + Major + ", Minor="
			+ Minor + ", UIN=" + UIN + ", GPA=" + GPA + "]";
}



}
