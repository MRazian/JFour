public class OnlineTaxiCost {
	public static void main(String[] args){
		int distanceInMeter = 7800;
		double distanceInKiloMeter = distanceInMeter / 1000;
		int price = 0;
		if (distanceInKiloMeter <= 1){
		 price = 3000;
		 } else if (distanceInKiloMeter <= 5){
		price = 5000;
		} else if (distanceInKiloMeter <= 10){
		 price = 10_000;
		 } else if (distanceInKiloMeter <= 20){
		price = 15_000;
		 } else {
		System.out.println("Distance must be less than 20 kilo
			meters.");
		 }
		System.out.println("Price: " + price);
	 }
}
