
public class Main {

	public static void main(String[] args) {
		ComputerFactory factory = new ComputerFactory();
		factory.setBluePrint(new LgGramBluePrint());
//		factory.setBluePrint(new MacBluePrint());
//		factory.setBluePrint(new SonyBluePrint());
//		Computer computer = factory.makeAndGet();
		factory.make();
		Computer computer = factory.get();

//		Computer computer = new Computer("i7", "16g", "256g ssd");
		System.out.println(computer);
	}

}
