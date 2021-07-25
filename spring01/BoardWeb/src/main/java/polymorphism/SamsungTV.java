package polymorphism;

public class SamsungTV implements TV {
	
	private SonySpeaker speacker;
	
	public void initMethod() {
		System.out.println("==> 객체 초기화 작업 처리");
	}
	public void destroyMethod() {
		System.out.println("==>객체 삭제 전에 처리할 로직 처리...");
	}
	public SamsungTV() {
		System.out.println("====> SamsungTV(1) 객체를 생성");
	}
	public SamsungTV(SonySpeaker speacker) {
		System.out.println("====> SamsungTV(2) 객체를 생성");
		this.speacker = speacker;
	}
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}

	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	public void volumeUp() {
		speacker = new SonySpeaker();
		speacker.volumeUp();
	}

	public void volumeDown() {
		speacker = new SonySpeaker();
		speacker.volumeDown();
	}
}
