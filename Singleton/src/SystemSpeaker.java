
public class SystemSpeaker {
	private static SystemSpeaker instance;
	private int volume;

	private SystemSpeaker() {
		volume = 5;
	}

	public static SystemSpeaker getInstance() {
		if (instance == null) {
			// 시스템 스피커
			instance = new SystemSpeaker();
			System.out.println("새로 생성");
		} else {
			System.out.println("기존 인스턴스 호출");
		}
		return instance;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
}
