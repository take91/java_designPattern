
public abstract class Calculator {

	private Calculator calc;

	public void setNextCalculator(Calculator calc) {
		this.calc = calc;
	}

	public boolean process(Request req) {
		if (operator(req)) {
			return true;
		} else {
			if (calc != null) {
				return calc.process(req);
			} else {
				return false;
			}
		}
	}

	abstract protected boolean operator(Request req);

}
