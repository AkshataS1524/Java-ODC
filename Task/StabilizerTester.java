class StabilizerTester{

	public static void main(String[] cfe)
	{
		Stabilizer stabilizer=new Stabilizer("Philips");
		System.out.println(stabilizer);
		System.out.println(stabilizer.brand);
		
		Stabilizer stabilizer2=new Stabilizer("220");
		System.out.println(stabilizer2);
		System.out.println(stabilizer2.voltage);
		
		Stabilizer stabilizer3=new Stabilizer("price");
		System.out.println(stabilizer3);
		System.out.println(stabilizer3.price);

		Stabilizer stabilizer4=new Stabilizer("Grey");
		System.out.println(stabilizer4);
		System.out.println(stabilizer4.color);
		
		Stabilizer stabilizer5=new Stabilizer("Model 4");
		System.out.println(stabilizer5);
		System.out.println(stabilizer5.model);
		
		Stabilizer stabilizer6=new Stabilizer("90");
		System.out.println(stabilizer6);
		System.out.println(stabilizer6.capacity);
		
		
	}
}