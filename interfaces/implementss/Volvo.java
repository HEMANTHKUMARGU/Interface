package interfaces.implementss;

public class Volvo extends Feature {

	@Override
	public void charr() {
		System.out.println("Volvo Cars, a Swedish automaker, is known for its safety features,\r\n"
				+ " reliability, and minimalist luxury design, with models like the XC90, XC60, S90, \r\n"
				+ "and C40 Recharge being popular choices. ");

	}

	@Override
	public void engine() {
		System.out.println("Volvo primarily uses 2.0-liter, inline 4-cylinder gasoline engines,\r\n "
				+ "turbocharged and intercooled with direct injection, offering a range of power outputs,\r\n"
				+ " including the B5 (247 hp) and B6 (295 hp).\r\n");

	}

	@Override
	void baseVerentFetures() {
		System.out.println("Volvo cars generally offer a range of features even in their base variants,\r\n"
				+ " prioritizing safety and comfort, with models like the XC40, XC60, and S90 featuring features\r\n"
				+ " like LED headlights, digital instrument clusters, and infotainment systems. ");

	}

	@Override
	void topVerentFetures() {
		System.out.println("Volvo's top-variant features, often denoted as \"Ultimate\" or \"Ultra\",\r\n"
				+ " typically include advanced safety systems, a premium sound system (like Bowers & Wilkins),\r\n"
				+ " panoramic sunroof, leather upholstery, and features like a 360-degree camera, air purifier,\r\n"
				+ " and powered front seats with massage functions. ");

	}

}
