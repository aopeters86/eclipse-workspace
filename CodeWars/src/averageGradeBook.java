
public class averageGradeBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int a = 90;
		int b = 95;
		int c = 73;

		System.out.println(getGrade(a, b, c));
	}
	
    public static char getGrade(int s1, int s2, int s3) {
    	
    	int average = ((s1+s2+s3)/3);
    	
    	if(average >= 90 && average <=100) {
    		return 'A';
    	}
    	if(average >= 80 && average <=89) {
    		return 'B';
    	}
    	if(average >= 70 && average <=79) {
    		return 'C';
    	}
    	if(average >= 60 && average <=69) {
    		return 'D';
    	}

        return 'F';
    }
}


