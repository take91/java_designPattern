
public class Main {

	public static void main(String[] args) {

		Computer computer = ComputerBuilder.startWithCpu("i7").setRam("8g").setStorage("256g ssd").build();

		System.out.println(computer);
	}

}
