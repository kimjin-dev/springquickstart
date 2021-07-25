package polymorphism;

public class SamsungTV implements TV {
	
	private Speacker speacker;
	private int price;
	
	public void initMethod() {
		System.out.println("==> 객체 초기화 작업 처리");
	}
	public void destroyMethod() {
		System.out.println("==>객체 삭제 전에 처리할 로직 처리...");
	}
	public SamsungTV() {
		System.out.println("====> SamsungTV(1) 객체를 생성");
	}
	public SamsungTV(Speacker speacker) {
		System.out.println("====> SamsungTV(2) 객체를 생성");
		this.speacker = speacker;
	}
	public SamsungTV(Speacker speacker, int price) {
		System.out.println("====> SamsungTV(3) 객체를 생성");
		this.speacker = speacker;
		this.price = price;
	}
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다. (가격 : " + price + ")");
	}

	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	public void volumeUp() {
		speacker.volumeUp();
	}

	public void volumeDown() {
		speacker.volumeDown();
	}
}
