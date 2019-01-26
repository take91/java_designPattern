
public class PrintMorseCode extends MorseCode {

	public PrintMorseCode(MorseCodeFunction function) {
		super(function);
	}

	public PrintMorseCode s() {
		dot();
		dot();
		dot();
		space();
		return this;
	}

	public PrintMorseCode d() {
		dash();
		dot();
		dot();
		space();
		return this;
	}

	public PrintMorseCode g() {
		dash();
		dash();
		dot();
		space();
		return this;
	}

	public PrintMorseCode a() {
		dot();
		dash();
		space();
		return this;
	}

}
