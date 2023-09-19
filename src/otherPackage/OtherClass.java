package otherPackage;

import teach.Father;

public class OtherClass implements Father{

	public Double wonToDollor(double won) {
		double basicDollor = 1360;
		return devide(won, basicDollor);
	}
	
	private Double wonToYen(double won) {
		double basicYen = 911;
		return devide(won, basicYen);
	}
	
	Double wonToEuro(double won) {
		double basicEuro = 1412;
		return devide(won, basicEuro);
	}
	
	protected Double wonToYuan(double won) {
		double basicYuan = 177;
		return devide(won, basicYuan);
	}

	private Double devide(double won, double basic) {
		return won/basic;
	}
	
	@Override
	public Double wonExchange(double won) {
		double exchange = wonToDollor(won);
		
		return exchange;
	}
}
