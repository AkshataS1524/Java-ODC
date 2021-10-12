class Stabilizer{

	 String brand="V guard";
	 int voltage=450;
	 float price=2500.4f;
	 byte model=5;
	 String color;
	 short capacity;
	 

	 Stabilizer(String brand)
	 {
		 System.out.println("invoked stabilizer no arg constructor");
		 System.out.println(this);
		 System.out.println(this.brand);
		 this.brand=brand;
		 System.out.println("End of constructor");
	 }
	 Stabilizer(int voltage)
	 {
		 System.out.println("invoked stabilizer no arg constructor");
		 System.out.println(this);
		 System.out.println(this.voltage);
		 this.voltage=voltage;
		 System.out.println("End of constructor");

	 }
	 Stabilizer(float price)
	 {
		 System.out.println("invoked stabilizer no arg constructor");
		 System.out.println(this);
		 System.out.println(this.price);
		 this.price=price;
		 System.out.println("End of constructor");
	 }
	 Stabilizer(byte model)
	 {
		 System.out.println("invoked stabilizer no arg constructor");
		 System.out.println(this);
		 System.out.println(this.model);
		 this.model=model;
		 System.out.println("End of constructor");
	 }
	 Stabilizer(short capacity)
	 {
		 System.out.println("invoked stabilizer no arg constructor");
		 System.out.println(this);
		 System.out.println(this.capacity);
		 this.capacity=capacity;
		 System.out.println("End of constructor");
	 }
}