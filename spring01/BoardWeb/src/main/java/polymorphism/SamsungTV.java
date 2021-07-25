package polymorphism;

public class SamsungTV implements TV {
	
	private SonySpeaker speacker;
	
	public void initMethod() {
		System.out.println("==> ��ü �ʱ�ȭ �۾� ó��");
	}
	public void destroyMethod() {
		System.out.println("==>��ü ���� ���� ó���� ���� ó��...");
	}
	public SamsungTV() {
		System.out.println("====> SamsungTV(1) ��ü�� ����");
	}
	public SamsungTV(SonySpeaker speacker) {
		System.out.println("====> SamsungTV(2) ��ü�� ����");
		this.speacker = speacker;
	}
	public void powerOn() {
		System.out.println("SamsungTV---���� �Ҵ�.");
	}

	public void powerOff() {
		System.out.println("SamsungTV---���� ����.");
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
