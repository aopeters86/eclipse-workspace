//jeremy peters csc275

public class SpaceFighter extends SpaceCraft{
	
//unique attributes	
	private String Weapon;
	private Integer Payload;
//	super(buno, fueltype, fuelecon);
	
public SpaceFighter() {
	
}
public SpaceFighter(Integer buno, String fueltype, String weapon, Integer payload) {
//super.setBuno(buno);
//super.setFuelType(fueltype);
super(buno,fueltype);
this.Weapon = weapon;
this.Payload = payload;

}
public String getWeapon() {
	return Weapon;
}
public void setWeapon(String weapon) {
	Weapon = weapon;
}
public Integer getPayload() {
	if(Payload >= getFuelEcon()) {
		return 0;
	}
	return Payload;
}
public void setPayload(Integer payload) {
	Payload = payload;
}
//functionality
public Integer getFighterEcon() {
	if(Payload < getFuelEcon()) {
		return getAttackRange() + (getFuelEcon() - Payload);
	}
	else {
		return 0;
	}
}
@Override
public String toString() {
	return "SpaceFighter [getBuno()=" + getBuno() + ", getFuelType()=" + getFuelType() + ", getFuelEcon()="
			+ getFuelEcon() + ", Weapon=" + Weapon + ", Payload=" + Payload + ", getFighterEcon()=" + getFighterEcon()
			+ "]";
}

}
