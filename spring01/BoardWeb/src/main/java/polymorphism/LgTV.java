package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	@Resource(name="sony")
	private Speaker speacker;
	
	public LgTV() {
		System.out.println("=====> LgTV ��ü ����");
	}
	@Override
	public void powerOn() {
		System.out.println("LgTV---���� �Ҵ�.");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV---���� ����.");
	}

	@Override
	public void volumeUp() {
		speacker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speacker.volumeDown();
	}
}
