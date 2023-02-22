
public class Monkey extends Pet{
	String type;
	Integer size;
	Boolean throwspoop;
	
	public Monkey() {
		
	}
	
	public Monkey(String name, Integer age, String color, String type, Integer size, Boolean throwspoop) {
		super.setName(name);
		super.setAge(age);
		super.setColor(color);		
		this.type = type;
		this.size = size;
		this.throwspoop = throwspoop;
	}

	public String getType() {
		return type;
	}

	public Boolean setType(String type) {
		this.type = type;
		return true;
	}

	public Integer getSize() {
		return size;
	}

	public Boolean setSize(Integer size) {
		this.size = size;
		return true;
	}

	public Boolean getThrowspoop() {
		return throwspoop;
	}

	public Boolean setThrowspoop(Boolean throwspoop) {
		this.throwspoop = throwspoop;
		return true;
	}

	@Override
	public String toString() {
		return "Monkey [getName()=" + getName() + ", getAge()=" + getAge() + ", getColor()=" + getColor() + ", type="
				+ type + ", size=" + size + ", throwspoop=" + throwspoop + "]";
	}

	
	
//	public String monkeyPrint() {
//		return "Type of monkey? " +type+ "\nSize of Monkey(in inches)" +size+ "\nThrows Poo? " +throwspoop;
//	}

}
