//jeremy peters csc275 online
public class Carrier extends SpaceCraft{
	private Integer range;
	private String firepower;
	
	
	public Carrier() {
	}
	
	public Carrier(Integer buno, String fuelType, Integer range, String firepower){
		
		super(buno, fuelType);
		this.range = range;
		this.firepower =firepower;
		
	}

	public Integer getRange() {
		return range;
	}

	public void setRange(Integer range) {
		this.range = range;
	}

	public String getFirepower() {
		return firepower;
	}

	public void setFirepower(String firepower) {
		this.firepower = firepower;
	}
	// functionality goes to spacefighter
	public Integer getAttackRange() {
		return getFuelEcon() + 100;
	}

	@Override
	public String toString() {
		return "Carrier [getBuno()=" + getBuno() + ", getFuelType()=" + getFuelType() + ", getFuelEcon()="
				+ getFuelEcon() + ", range=" + range + ", firepower=" + firepower + ", getAttackRange()="
				+ getAttackRange() + "]";
	}
	
	
	
	
	
	
/*functionality, 
 * range to other ?
 * 
 * fwd deploy
 * 
 * firepower
 * 
 * attributes
 * attack range 
 * 
 * 
 * 
 * 
 * 
 * */
}
