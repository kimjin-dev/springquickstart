package polymorphism;

public class SonySpeaker implements Speacker {
	public SonySpeaker() {
		System.out.println("===> SonySpeaker 按眉 积己");
	}

	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker---家府 棵赴促.");
	}

	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker---家府 郴赴促.");
	}
}
