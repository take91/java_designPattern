
public class AObj {
	Ainterface ainterface;

	public AObj() {
		ainterface = new AinterfaceImpl();
	}

	public void funcAA() {

		ainterface.funcA();
		ainterface.funcA();

//		System.out.println("AAA");
//		System.out.println("AAA");

		// ~ 기능이 필요합니다.
	}
}
