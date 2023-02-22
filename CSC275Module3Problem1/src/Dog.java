//og setbreed, setname, setage, sercolor, setweight = bool
public class Dog extends Pet{

//String name;
//Integer age;
//String color;
String breed;
Double weight;
Boolean barks;

public Dog() {
}

public Dog(String name, Integer age, String color, String breed, Double weight, Boolean barks ) {
	super.setName(name);
	super.setAge(age);
	super.setColor(color);
	this.breed = breed;
	this.weight = weight;
	this.barks = barks;
}

public String getBreed() {
	return breed;
}

public Boolean setBreed(String breed) {
	this.breed = breed;
	return true;
}

public Double getWeight() {
	return weight;
}

public Boolean setWeight(Double weight) {
	this.weight = weight;
	return true;
}

public Boolean getBarks() {
return barks;
}

public Boolean setBarks(Boolean barks) {
	this.barks = barks;
	return true;
}

@Override
public String toString() {
	return "Dog [getName()=" + getName() + ", getAge()=" + getAge() + ", getColor()=" + getColor() + ", breed=" + breed
			+ ", weight=" + weight + ", barks=" + getBarks() + "]";
}




//@Override
//public String toString() {
//	return "Dog [getName()=" + getName() + ", getAge()=" + getAge() + ", getColor()=" + getColor() + ", breed=" + breed
//			+ ", weight=" + weight + "]";
//}



//@Override
//public String toString() {
//	return "Dog [breed=" + breed + ", weight=" + weight + "]";
//}

//public String printDog() {
//	return "Dog Breed: " + breed + "\nWeight: " + weight;
//}



}

//public String getName() {
//	return name;
//}
//
//public void setName(String name) {
//	this.name = name;
//}
//
//public Integer getAge() {
//	return age;
//}
//
//public void setAge(Integer age) {
//	this.age = age;
//}
//
//public String getColor() {
//	return color;
//}
//
//public void setColor(String color) {
//	this.color = color;
//}
//	this.name = name;
//	this.age = age;
//	this.color = color;