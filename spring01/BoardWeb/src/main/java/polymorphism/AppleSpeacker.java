package polymorphism;

public class AppleSpeacker implements Speacker{
	public AppleSpeacker() {
		System.out.println("===> AppleSpeacker 按眉 积己");
	}

	@Override
	public void volumeUp() {
		System.out.println("AppleSpeacker---家府 棵赴促.");
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeacker---家府 郴赴促.");
	}

}
