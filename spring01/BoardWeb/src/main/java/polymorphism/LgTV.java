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
		System.out.println("=====> LgTV °´Ã¼ »ý¼º");
	}
	@Override
	public void powerOn() {
		System.out.println("LgTV---Àü¿ø ÄÒ´Ù.");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV---Àü¿ø ²ö´Ù.");
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
