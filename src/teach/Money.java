package teach;

public class Money implements Father{

	@Override
	public Double wonExchange(double won) {
		double exchange = wonToYen(won);
		
		return exchange;
	}
	
	public Double wonToDollor(double won) {
		double basicDolor = 1360;
		double yen = won/basicDolor;
		
		return yen;
	}
	
	private Double wonToYen(double won) {
		double basicYen = 911;
		double yen = won/basicYen;
		
		return yen;
	}
	
	Double wonToEuro(double won) {
		double basicEuro = 1412;
		double euro = won/basicEuro;
		
		return euro;
	}
	
	protected Double wonToYuan(double won) {
		double basicYuan = 177;
		double yuan = won/basicYuan;
		
		return yuan;
	}

	
}
