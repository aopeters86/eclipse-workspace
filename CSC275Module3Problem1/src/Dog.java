//og setbreed, setname, setage, sercolor, setweight = bool
public class Dog extends Pet{

//String name;
//Integer age;
//String color;
String breed;
Double weight;

public Dog() {
}

public Dog(String name, String breed, Double weight) {
	super.setName(name);
	this.breed = breed;
	this.weight = weight;
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

public String printDog() {
	return "Dog Breed: " + breed + "\nWeight: " + weight;
}


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