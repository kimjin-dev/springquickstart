package polymorphism;

public class SonySpeaker implements Speacker {
	public SonySpeaker() {
		System.out.println("===> SonySpeaker ��ü ����");
	}

	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker---�Ҹ� �ø���.");
	}

	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker---�Ҹ� ������.");
	}
}
