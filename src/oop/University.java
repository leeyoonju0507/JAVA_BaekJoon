package oop;

public class University {
	String name = "";
	int born;
	int studentCount;
	String infoMessage;

	public University(String name, int born, int studentCount) {
		super();
		this.name = name;
		this.born = born;
		this.studentCount = studentCount;

	}

	
	
	public void printInfoMessage() {
		infoMessage = name + "대학교는 " + born + "년도에 창립된 학교로, 현재 학생 수는 " + studentCount + "명 입니다.";
		System.out.println(infoMessage);
	}
}
