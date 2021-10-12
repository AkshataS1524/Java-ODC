class Monitor{

	int  size=12;
	byte types;
	float bandwidth=9.5f;
	int  weight;
	float length;
	long price=95000;
	short display;
	String color;
	String brand="HP";
    String position;
	String shape;
	int value;
	String company;
	double width;
	

	Monitor(int size)
	{
		System.out.println("invoked monitor with no argument constructorructor");
		System.out.println(this);
		System.out.println(this.size);
		this.size=size;
		System.out.println("end of constructor");
	}
	Monitor(byte types)
	{
		System.out.println("invoked monitor types with no argument constructorructor");
		System.out.println(this);
		System.out.println(this.types);
		this.types=types;
		System.out.println("end of constructor");
	}
	Monitor(float bandwidth)
	{
		System.out.println("invoked monitor with no argument constructorructor");
		System.out.println(this);
		System.out.println(this.bandwidth);
		this.bandwidth=bandwidth;
		System.out.println("end of constructor");
	}
	Monitor(long price)
	{
		System.out.println("invoked monitor with no argument constructorructor");
		System.out.println(this);
		System.out.println(this.price);
		this.price=price;
		System.out.println("end of constructor");
	}
	
	Monitor(String brand)
	{
		System.out.println("invoked monitor with no argument constructorructor");
		System.out.println(this);
		System.out.println(this.brand);
		this.brand=brand;
		System.out.println("end of constructorructor3");
	}
	Monitor(short display)
	{
		System.out.println("invoked monitor with no argument constructorructor");
		System.out.println(this);
		System.out.println(this.display);
		this.display=display;
		System.out.println("end of constructor");
	}
	Monitor()
	{
		System.out.println("monitor instance variables");
	}
}   