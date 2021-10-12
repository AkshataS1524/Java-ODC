class ScooterStarter{

	public static void main(String[] keys)
	{
		Scooter scooter=new Scooter("Honda");
		System.out.println(scooter.company);

		Scooter scooter1=new Scooter(345);
		System.out.println(scooter1.cc);

		Scooter scooter2=new Scooter(45000);
		System.out.println(scooter2.price);

		Scooter scooter3=new Scooter("White activa");
		System.out.println(scooter3.colour);
		System.out.println(scooter3.model);

		Scooter scooter4=new Scooter(true);
		System.out.println(scooter4.fuel);

		Scooter scooter5=new Scooter();
		scooter5.space=87.0766d;
		System.out.println(scooter5.space);

		Scooter scooter6=new Scooter();
	    scooter6.size=98.8f;
		System.out.println(scooter6.size);

		Scooter scooter7=new Scooter();
	    scooter7.types=7;
		System.out.println(scooter7.types);

		Scooter scooter8=new Scooter();
		scooter8.purchase="showroom";
		System.out.println(scooter8.purchase);

	}
} 