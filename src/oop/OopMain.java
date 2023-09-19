package oop;

public class OopMain {

	public static void main(String[] args) {
		SeoulUniversity seoul = new SeoulUniversity("서울", 1946, 24135);
		
		seoul.printInfoMessage();
		otherPrint(seoul.address);
		
		YeonseiUniversity yeonsei = new YeonseiUniversity("연세", 1885, 38213);
		
		yeonsei.printInfoMessage();
		otherPrint(yeonsei.boss);
		
		KoreaUniversity korea = new KoreaUniversity("고려", 1905, 37493);
		
		korea.printInfoMessage();
		otherPrint(korea.tel);
	}

	private static void otherPrint(String other) {
		System.out.println(other);
	}
}
