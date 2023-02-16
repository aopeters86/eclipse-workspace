
public class UndergraduateStudent {
	private String FirstName;
	private String LastName;
	private String Major;
	private String Minor;
	private Integer UIN;
	private Double GPA;
	
	public UndergraduateStudent() {
		
		
	}
	
	public UndergraduateStudent(String FirstName, String LastName, String Major, String Minor, Integer UIN, Double GPA) {
		
	}
/*
 * Note: The calculate final grade takes 3 doubles, each of which will be an exam grade out of 100. Each exam is 
 * worth 33% of their final grade. This method returns a double, which is the average of the three test grades.
 */
	public double calculateFinalGrade(Double exam1, Double exam2, Double exam3) {
		Double fUndergradAvg = ((exam1 + exam2 + exam3) / 3);
		return fUndergradAvg;
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
	
//	does below need to return the final grade? 

	@Override
	public String toString() {
		return "UndergraduateStudent [FirstName=" + FirstName + ", LastName=" + LastName + ", Major=" + Major
				+ ", Minor=" + Minor + ", UIN=" + UIN + ", GPA=" + GPA + "]";
	}
	
	

	
	
}
