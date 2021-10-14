class Bicycle{
	
	String brand = "Bianchi";
	double price = 31745.1;
	String color = "Blue";
	BicycleTypes types = BicycleTypes.RACING;
	
	 void brake()
	{
	   System.out.println("invoked brake method");	
	}
	
	void move()
	{
	    System.out.println("invoked move method");	
	}
	
	void displayDetails()
	{
		System.out.println("Bicycle brand:" + this.brand);
		System.out.println("Bicycle price:" + this.price);
		System.out.println("Bicycle color:" + this.color);
		System.out.println("Bicycle types:" + this.types);	   
	}
}