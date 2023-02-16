
public class Pet {
	private String name;
	private Integer age;
	private String color;
	
	public Pet(){
	}
	
	public Pet(String name, Integer age, String color){
		
		this.name = name;
		this.age = age;
		this.color = color;
		
	}

	public String getName() {
		return name;
	}

	public Boolean setName(String name) {
		this.name = name;
		return true;
	}

	public Integer getAge() {
		return age;
	}

	public Boolean setAge(Integer age) {
		this.age = age;
		return true;
	}

	public String getColor() {
		return color;
	}

	public Boolean setColor(String color) {
		this.color = color;
		return true;
	}

	@Override
	public String toString() {
		return "Pet Created: \nName: " + name + "\nAge: " + age + "\nColor: " + color ;
	}
	
	

}
