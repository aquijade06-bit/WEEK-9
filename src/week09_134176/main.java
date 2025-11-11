package week09_134176;

public class main {

	public static void main(String[] args) {
		// Membuat instance dari Car
		Car myCar = new Car("Honda Civic");
		
		// Menampilkan informasi kenadaraan
		myCar.showVehicleInfo();
		
		// Memulai kendaraan
		myCar.start();
		
		// Menghentikan kendaraan
		myCar.stop();
	}

}
