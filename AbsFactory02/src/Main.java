import abst.Button;
import abst.GuiFac;
import abst.TextArea;
import concrete.FactoryInstance;

public class Main {

	static public void main(String[] args) {
		
		GuiFac fac = FactoryInstance.getGuiFac();
		Button button = fac.createButton();
		TextArea area = fac.createTextArea();
		
		button.click();
		System.out.println(area.getText());
		
	}

}
	