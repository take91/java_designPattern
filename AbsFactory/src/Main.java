import com.take91.abst.BikeFactory;
import com.take91.abst.Body;
import com.take91.abst.Wheel;
import com.take91.gt.GtFactory;

public class Main {

	public static void main(String[] args) {

//		BikeFactory factory = new SamFactory();
		BikeFactory factory = new GtFactory();
		
		
		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();

		System.out.println(body.getClass());
		System.out.println(wheel.getClass());

	}
}
