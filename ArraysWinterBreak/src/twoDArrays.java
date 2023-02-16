
public class twoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2 dimensional array in java 3 rows, 4 columns
		//java has conserved 12 locations to hold value of integer
		int table [][] = new int[3][4];		
		//access these locations, keep trzckl of row and column
		table[0][0] = 2;//row 0 column 0 
		table[0][1] = 4;//top row column 1
		table[0][2] = 8;
		table[0][3] = 4;
		table[1][0] = 11;//row 0 column 0 
		table[1][1] = 12;//top row column 1
		table[1][2] = 9;
		table[1][3] = 5;
		table[2][0] = 10;//row 0 column 0 
		table[2][1] = 3;//top row column 1
		table[2][2] = 2;
		table[2][3] = -2;
		System.out.println(table[0][0] + " " + table[0][1]
				+ " " + table[0][2]  + " " + table[0][3]);
		System.out.println(table[1][0] + " " + table[1][1]
				+ " " + table[1][2]  + " " + table[1][3]);
		System.out.println(table[2][0] + " " + table[2][1]
				+ " " + table[2][2]  + " " + table[2][3]);
//		System.out.println(table[3][0] + " " + table[3][1]
//				+ " " + table[3][2]  + " " + table[3][3]);
		
	}

}

/*
 * 22,43,32,77
 * 
 * 2	4	8	4
 * 11	12	9	5	
 * 10	3	2	-2
 * 
 */