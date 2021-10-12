class Scooter{

	String company;
	int cc;
	long price;
	String colour;
	char model;
	double space;
	float size;
	int types;
	boolean fuel;
	String purchase;

	Scooter(String company)
	{
		System.out.println(" Invoked scooter company ");
		this.company=company;
	}
	Scooter(int cc)
	{
		System.out.println(" Invoked vehicle cc ");
		this.cc=cc;
	}
	Scooter(long price)
	{
		System.out.println("Invoked scooter price ");
		this.price=price;
	}
	Scooter(String colour,char model)
	{
		System.out.println("Invoked scooter colour and model");
		this.colour=colour;
		this.model=model;
	}
	Scooter(boolean fuel)
	{
		System.out.println("Invoked fuel");
		this.fuel=fuel;
	}
	Scooter()
	{
		System.out.println("scooter instance variables");
	}

} 