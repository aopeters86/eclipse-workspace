
public class testplm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//comment
		Dog mavis = new Dog("mavis", "lab", 152.25);
//		mavis.setName("Mavis");
		mavis.setAge(6);
		mavis.setColor("black");
		mavis.setBreed("Labrador mix");
		mavis.setWeight(95.5);
		System.out.println(mavis.toString());
		System.out.println(mavis.printDog());
		
		
		Cat fuckcats = new Cat();//how can this be identified in tostring?
		fuckcats.setName("asshole");
		fuckcats.setAge(69);
		fuckcats.setColor("shit");
		fuckcats.setClaws("claws");
		fuckcats.setFoodtype("soft");
		fuckcats.setHair("hairless");
		System.out.println(fuckcats.toString());
		System.out.println(fuckcats.printCat());
	
		
		Monkey newmonkey = new Monkey();
		newmonkey.setName("slappy");
		newmonkey.setAge(22);
		newmonkey.setColor("red");
		newmonkey.setType("Orangutan");
		newmonkey.setSize(65);
		newmonkey.setThrowspoop("yes");
		System.out.println(newmonkey.toString());
		System.out.println(newmonkey.monkeyPrint());
//		System.out.println();
	
	
	
	
	
	
	
	
	}

}
