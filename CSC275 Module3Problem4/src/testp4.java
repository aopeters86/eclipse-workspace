
public class testp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student newstudent = new Student("first", "last", "minor", "major",123,3.26);
		System.out.println(newstudent.toString());
		
		Faculty newfaculty = new Faculty("first", "last", "dept", 3265);
		System.out.println(newfaculty.toString());
		
		GraduateStudent newgradstudent = new GraduateStudent("fi", "last", "major", "minor", 3215487, 3.26);
		System.out.println(newgradstudent.toString());
		
		UndergraduateStudent newundergradstudent = new UndergraduateStudent("first", "last", "major", "minor", 653232, 3.25);
		System.out.println(newundergradstudent.toString());
		
		Staff newstaff = new Staff("first", "last","IT", "SWE", 65559);
		System.out.println(newstaff.toString());

	}

}
