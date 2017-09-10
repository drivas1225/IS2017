package strategy;

public class Divicion implements StrategyOperation{
	
	@Override
	public int operate(int a , int b) {
		return a/b;
	}

}
