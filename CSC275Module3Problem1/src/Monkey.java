
public class Monkey extends Pet{
	String type;
	Integer size;
	String throwspoop;
	
	public Monkey() {
		
	}
	
	public Monkey(String type, Integer size, String throwspoop) {
		this.type = type;
		this.size = size;
		this.throwspoop = throwspoop;
	}

	public String getType() {
		return type;
	}

	public Boolean setType(String type) {
		this.type = type;
		return true;
	}

	public Integer getSize() {
		return size;
	}

	public Boolean setSize(Integer size) {
		this.size = size;
		return true;
	}

	public String getThrowspoop() {
		return throwspoop;
	}

	public Boolean setThrowspoop(String throwspoop) {
		this.throwspoop = throwspoop;
		return true;
	}
	
	public String monkeyPrint() {
		return "Type of monkey? " +type+ "\nSize of Monkey(in inches)" +size+ "\nThrows Poo? " +throwspoop;
	}

}
