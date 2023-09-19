package oop;

public class YeonseiUniversity extends University implements UniversityOtherInfo{
	String boss = "총장 : 서승환";
	
	public YeonseiUniversity(String name, int born, int studentCount) {
		super(name, born, studentCount);
	}

	@Override
	public void printInfoMessage() {
		super.printInfoMessage();
	}

	@Override
	public String printOtherInfo() {
		return this.boss;
	}
	
}
