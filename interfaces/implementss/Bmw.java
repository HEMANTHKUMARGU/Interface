package interfaces.implementss;

public class Bmw extends Feature {
	@Override
	public void charr() {
		System.out.println("Here's a more detailed look at the BMW car character:\r\n"
				+ "BMW car design is characterized by a dynamic, elegant silhouette with a long hood,\r\n "
				+ "short overhangs, a recessed greenhouse, and a distinctive Hofmeister kink, all contributing \r\n"
				+ "to a sporty and luxurious aesthetic. ");

	}

	@Override
	public void engine() {
		System.out.println("BMW engines are known for their reliability and performance,\r\n"
				+ " with a variety of engine types, including inline-3, inline-4, inline-6, V8,\r\n "
				+ "and even V12 engines, as well as electric and hybrid options. ");

	}

	@Override
	void baseVerentFetures() {
		System.out.println(
				"The base model BMW car in India is the 2 Series,\r\n" + " with a starting price of ₹ 43.90 Lakh. ");

	}

	@Override
	void topVerentFetures() {
		System.out.println("BMW top variant features typically include premium amenities \r\n"
				+ "like a large touchscreen infotainment system, advanced driver-assistance systems (ADAS),\r\n"
				+ " a panoramic sunroof, high-end sound systems, and luxurious interior elements like massage\r\n "
				+ "seats and multi-zone climate control. ");

	}

}
