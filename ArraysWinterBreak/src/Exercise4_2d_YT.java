
public class Exercise4_2d_YT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Jan = 34
		 * Feb = 44
		 * Mar = 23
		 * Apr = 76
		 * May = 65
		 * Jun = 98
		 * Jul = 123
		 * Aug = 102
		 * Sep = 87
		 * Oct = 43
		 * Nov = 34
		 * Dec = 12
		 * 
		 */
		
		int revenueArray[][] = new int[12][2];
		
		//put num of months of year in the array
		//in first column
		
		revenueArray[0][0] = 1;
		revenueArray[1][0] = 2;
		revenueArray[2][0] = 3;
		revenueArray[3][0] = 4;
		revenueArray[4][0] = 5;
		revenueArray[5][0] = 6;
		revenueArray[6][0] = 7;
		revenueArray[7][0] = 8;
		revenueArray[8][0] = 9;
		revenueArray[9][0] = 10;
		revenueArray[10][0] = 11;
		revenueArray[11][0] = 12;
		
		revenueArray[0][1] = 34;
		revenueArray[1][1] = 44;
		revenueArray[2][1] = 23;
		revenueArray[3][1] = 76;
		revenueArray[4][1] = 65;
		revenueArray[5][1] = 98;
		revenueArray[6][1] = 123;
		revenueArray[7][1] = 102;
		revenueArray[8][1] = 87;
		revenueArray[9][1] = 43;
		revenueArray[10][1] = 34;
		revenueArray[11][1] = 12;
		
		for(int i = 0; i <= 11; i++) {//loop thru months of year 
			//examines every row of array
			//prints month starts with 0 with corresponding piece of money 1
			System.out.println("for month number " + revenueArray[i][0] 
					+ ", revenue was $" + revenueArray[i][1]);
		}
		
		
		
		

	}

}
