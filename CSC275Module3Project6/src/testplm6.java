
public class testplm6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 
		 * issues, super() changes fuelecon, do not want it to be set lower than 1000
		 * final integer fuelecon how to not let it change and still use it as a super?
		 * 
		 * 
		 * */
		SpaceFighter newspacefighter = new SpaceFighter(123,"fuel",1000, "bombs", 200);
		System.out.println(newspacefighter.toString());		
		
		Tanker newtanker = new Tanker(123, "plutonium",1000, "oil", 500);
		System.out.println(newtanker.toString());

	}

}
