
public class SubCalculator extends Calculator {

	@Override
	protected boolean operator(Request req) {
		if (req.getOper().equals("-")) {

			int x = req.getX();
			int y = req.getY();
			int result = x-y;

			System.out.println(x + " - " + y + " = " + result);
		}
		return false;
	}

}
