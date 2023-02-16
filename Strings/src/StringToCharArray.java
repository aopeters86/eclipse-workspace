
public class StringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Monkeys are toxic";
		char array[] = new char[str1.length()];
		
//		for(int i= 0; i < str1.length(); i++) {
//			str1.toCharArray();
//			}
		
		str1.getChars(0,str1.length(), array, 0);
		
		for(int i =0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println("\n");
		
		for(int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i]);
		}

	}

}
