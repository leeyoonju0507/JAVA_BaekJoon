package oop;

public class SeoulUniversity extends University implements UniversityOtherInfo{
	String address = "주소 : 관악구";
	
	public SeoulUniversity(String name, int born, int studentCount) {
		super(name, born, studentCount);
	}
	
	@Override
	public void printInfoMessage() {
		super.printInfoMessage();
	}

	@Override
	public String printOtherInfo() {
		return this.address;
	}
	
}
