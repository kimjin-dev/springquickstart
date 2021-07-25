package polymorphism;

public class TVUser {

	public static void main(String[] args) {
//		SamsungTV tv = new SamsungTV();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
//		
//		LgTV lgtv = new LgTV();
//		lgtv.turnOn();
//		lgtv.soundUp();
//		lgtv.soundDown();
//		lgtv.turnOff();
		
//		TV tv = new SamsungTV();
//		TV tv = new LgTV();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
		BeanFactroy factory = new BeanFactroy();
		TV tv = (TV)factory.getBean(args[0]);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
	}

}
