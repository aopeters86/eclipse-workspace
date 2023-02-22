//jeremy peters csc275 
public class Tanker extends SpaceCraft{
//	2 unique attriutes
	private String contents;
	private Integer capacity;
		
	
	public Tanker() {
		
	}
	
	public Tanker(Integer buno, String fueltype,Integer fuelecon, String contents, Integer capacity) {
//		super.setBuno(buno);
//		super.setFuelType(fueltype);
		super(buno, fueltype, fuelecon);
		this.contents = contents;
		this.capacity = capacity;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Integer getCapacity() {
		if(capacity >= getFuelEcon()) {
			return 0;
		}
		else
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

//	functionality
 public Integer getTankerEcon() {
	 if(capacity > 200 && capacity < getFuelEcon()) {
		 return (getFuelEcon() - capacity);
	 }
	 else {
		 return 0;
	 }
	 
 }

@Override
public String toString() {
	return "Tanker [getBuno()=" + getBuno() + ", getFuelType()=" + getFuelType() + ", getFuelEcon()=" + getFuelEcon()
			+ ", contents=" + contents + ", capacity=" + capacity + ", getTankerEcon()=" + getTankerEcon() + "]";
}


	

	
	
	

}
