
public class Cat extends Pet{
	
	
	String hair;
	Boolean claws;
	String foodtype;

	
	public Cat() {
		
	}
	
	public Cat(String name, Integer age, String color, String hair, Boolean claws, String foodtype){
		
		super.setName(name);
		super.setAge(age);
		super.setColor(color);
		this.hair = hair;
		this.claws = claws;
		this.foodtype = foodtype;
	}

	public String getHair() {
		return hair;
	}

	public Boolean setHair(String hair) {
		if(hair.equalsIgnoreCase("long")|| hair.equalsIgnoreCase("short") || hair.equalsIgnoreCase("hairless")) {
		this.hair = hair;
		return true;
		}else
			System.out.println("Enter long, short or hairless");
		return false;
	}

	public Boolean getClaws() {
		return claws;
	}

	public Boolean setClaws(Boolean claws) {
		this.claws = claws;
		return true;
		
	}
	
	public String getFoodtype() {
		return foodtype;
	}

	public Boolean setFoodtype(String foodtype) {
		this.foodtype = foodtype;
		return true;
	}

	@Override
	public String toString() {
		return "Cat [getName()=" + getName() + ", getAge()=" + getAge() + ", getColor()=" + getColor() + ", hair="
				+ hair + ", claws=" + getClaws() + ", foodtype=" + foodtype + "]";
	}

	
	
//	public String printCat() {//give an option for these?
//		return "Shorthair, long hair, or hairless Cat? " +hair + "\nClawed or declawed? " + claws + "\nSoft or hard food? " + foodtype;
//	}

	
}
