package polymorphism;

public class AppleSpeacker implements Speacker{
	public AppleSpeacker() {
		System.out.println("===> AppleSpeacker ��ü ����");
	}

	@Override
	public void volumeUp() {
		System.out.println("AppleSpeacker---�Ҹ� �ø���.");
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeacker---�Ҹ� ������.");
	}

}
