package oop;

public class KoreaUniversity extends University implements UniversityOtherInfo{
	String tel = "연락처 : 02-3290-1114";
	
	public KoreaUniversity(String name, int born, int studentCount) {
		super(name, born, studentCount);
	}

	@Override
	public void printInfoMessage() {
		super.printInfoMessage();
	}

	@Override
	public String printOtherInfo() {
		return tel;
	}
	
}
