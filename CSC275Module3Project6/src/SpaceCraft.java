
public class SpaceCraft {

	private Integer Buno;
	private String FuelType;
	private final Integer FuelEcon = 1000;


public SpaceCraft() {
}

public SpaceCraft(Integer buno, String fuelType) {
	this.Buno = buno;
	this.FuelType = fuelType;
//	this.FuelEcon = fuelecon;
}

public Integer getBuno() {
	return Buno;
}

public void setBuno(Integer buno) {
	Buno = buno;
}

public String getFuelType() {
	return FuelType;
}

public void setFuelType(String fuelType) {
	FuelType = fuelType;
}

public Integer getFuelEcon() {
	if(FuelEcon <= 0)
		return 0;
	else
	return FuelEcon;
}



@Override
public String toString() {
	return "SpaceCraft [Buno=" + Buno + ", FuelType=" + FuelType + ", FuelEcon=" + FuelEcon + "]";
}




//attributes: buno, fuel type

}