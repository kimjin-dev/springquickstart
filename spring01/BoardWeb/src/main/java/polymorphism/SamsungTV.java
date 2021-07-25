package polymorphism;

public class SamsungTV implements TV {
	
	private Speacker speacker;
	private int price;
	
	public void initMethod() {
		System.out.println("==> ��ü �ʱ�ȭ �۾� ó��");
	}
	public void destroyMethod() {
		System.out.println("==>��ü ���� ���� ó���� ���� ó��...");
	}
	public SamsungTV() {
		System.out.println("====> SamsungTV(1) ��ü�� ����");
	}
	public SamsungTV(Speacker speacker) {
		System.out.println("====> SamsungTV(2) ��ü�� ����");
		this.speacker = speacker;
	}
	public SamsungTV(Speacker speacker, int price) {
		System.out.println("====> SamsungTV(3) ��ü�� ����");
		this.speacker = speacker;
		this.price = price;
	}
	public void powerOn() {
		System.out.println("SamsungTV---���� �Ҵ�. (���� : " + price + ")");
	}

	public void powerOff() {
		System.out.println("SamsungTV---���� ����.");
	}

	public void volumeUp() {
		speacker.volumeUp();
	}

	public void volumeDown() {
		speacker.volumeDown();
	}
}
