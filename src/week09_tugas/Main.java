package week09_tugas;

public class Main {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("Samsung" , "A 71");
		phone.displayInfo();
		phone.turnOn();
		phone.increaseVolume(5);
		phone.decreaseVolume(3);
		phone.connectToWiFi("HomeNetwork");
		phone.disconnectFromWiFi();
		phone.turnOff();
	}
}
