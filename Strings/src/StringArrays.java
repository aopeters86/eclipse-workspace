
public class StringArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence[] = {"I", "love", "to", "travel", "to", "far", "away", "places"};
		
		
		String array2[] = new String[3];
		
		array2[0] = "buttercups are awesome";
		array2[1] = "I love walks";
		array2[2] = "I love spaghetti";
		
		for(int i = 0; i < sentence.length; i++) {
		System.out.print(sentence[i] + " ");
		}
		System.out.println("\n");
		
		sentence[7] = "continents";
		
		for(int i = sentence.length-1; i >= 0; i--) {
			System.out.print(sentence[i] + " ");
			}
		
		System.out.println("\n");
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[2]);
		
		
	}

}
