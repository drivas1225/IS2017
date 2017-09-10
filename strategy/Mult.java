package strategy;

public class Mult implements StrategyOperation{
	
	@Override
	public int operate(int a , int b) {
		return a*b;
	}
	

}
