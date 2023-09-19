package teach;

import otherPackage.OtherClass;

public class Test {

	public static void main(String[] args) {
//		System.out.println(wonToDollor(1000));
		// static(정적) 메서드는 static 메서드만 사용할 수 있다.
		// 사용하는 메모리 영역이 다르기 때문이다.
		// 프로그램이 종료될 때까지 사용할 수 있다
		
		Test test = new Test();
		// 자기 자신인 클래스 객체를 생성하여 사용하면 static이 아니어도 접근이 가능하다.
		
		System.out.println(test.wonToDollor(1000));
		System.out.println(test.wonToYen(1000));
		System.out.println(test.wonToEuro(1000));
		System.out.println(test.wonToYuan(1000));
		
		Money money = new Money();
		
		System.out.println(money.wonToDollor(1000));
//		System.out.println(money.wonToYen(1000));
		// private는 클래스 내에서만 사용할 수 있기 때문에 외부에서는 사용이 불가능하다.
		System.out.println(money.wonToEuro(1000));
		System.out.println(money.wonToYuan(1000));
		
		OtherClass other = new OtherClass();
		// 다른 패키지에서 불러오는 객체이기 때문에 import 해주어야 한다.
		System.out.println(other.wonToDollor(0));
//		System.out.println(other.wonToYen(1000));
//		System.out.println(other.wonToEuro(1000));
//		System.out.println(other.wonToYuan(1000));
		// 다른 패키지에 있는 메서드이기 때문에 사용이 불가능하다.
		
		System.out.println(money.wonExchange(1000));
		System.out.println(other.wonExchange(1000));
	}
	
	public Double wonToDollor(double won) {
		double basicDollor = 1350;
		double dollor = won/basicDollor;
		
		return dollor;
	}
	
	private Double wonToYen(double won) {
		double basicYen = 921;
		double yen = won/basicYen;
		
		return yen;
	}
	
	Double wonToEuro(double won) {
		double basicEuro = 1422;
		double euro = won/basicEuro;
		
		return euro;
	}
	
	protected Double wonToYuan(double won) {
		double basicYuan = 177;
		double yuan = won/basicYuan;
		
		return yuan;
	}
}
