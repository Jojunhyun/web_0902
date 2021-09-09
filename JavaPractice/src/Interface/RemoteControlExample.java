package Interface;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		
		rc.setMute(true);
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(15);
		rc.setVolume(-15);
		System.out.println("------------");
		
		rc = new Audio();
		
		rc.setMute(true);
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(15);
		rc.setVolume(-15);
		
	}

}
