package week09_tugas;


public class SmartPhone extends Device implements Power, VolumeControl, Device.Connectivity {
	private int currentVolume;
	private String connectedNetwork;
	
	public SmartPhone(String brand, String model) {
		super(brand, model);
		this.currentVolume = 0;
		this.connectedNetwork = null;
	}
	
	@Override
	public void turnOn() {
		System.out.println("Smartphone is turned ON.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Smartphone is turnes OFF.");
	}
	
	public void increaseVolume(int level) {
		currentVolume += level;
		System.out.println("Volume increased. Current volume: " + currentVolume);
	}
	
	public void decreaseVolume(int level) {
		currentVolume -= level;
		if (currentVolume < 0) currentVolume = 0;
		System.out.println("Volume dicreased. Current volume:" + currentVolume);
	}
	
	@Override
	public void connectToWiFi(String netWorkName) {
		connectedNetwork = netWorkName;
		System.out.println("Connected to WiFI: " + connectedNetwork);
	}
	
	@Override
	public void disconnectFromWiFi() {
		System.out.println("Disconnected from WiFi: " + connectedNetwork);
		connectedNetwork = null;
	}
	
}