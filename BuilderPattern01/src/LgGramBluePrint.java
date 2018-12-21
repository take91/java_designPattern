
public class LgGramBluePrint extends BluePrint {
//	private Computer computer;
	private String cpu;
	private String ram;
	private String storage;

//	public LgGramBluePrint() {
//		computer = new Computer("default", "default", "default");
//	}

	@Override
	public void setCpu() {
//		computer.setCpu("i7");
		cpu = "i7";
	}

	@Override
	public void setRam() {
//		computer.setRam("8g");
		ram = "8g";
	}

	@Override
	public void setStorage() {
//		computer.setStorage("500g");
		storage = "500g";
	}

	@Override
	Computer getComputer() {
		return new Computer(cpu, ram, storage);
//		return computer;
	}

}
