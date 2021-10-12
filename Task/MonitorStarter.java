class MonitorStarter{

	public static void main(String[] mouse)
	{
		Monitor monitor=new Monitor(34);
		System.out.println(monitor);
		System.out.println(monitor.size);

	    Monitor monitor1=new Monitor(7);
		System.out.println(monitor1);
		System.out.println(monitor1.types);

		Monitor monitor2=new Monitor(8.45f);
		System.out.println(monitor2);
		System.out.println(monitor2.bandwidth);

		Monitor monitor3=new Monitor(2900);
		System.out.println(monitor3);
		System.out.println(monitor3.price);


		Monitor monitor4=new Monitor("HP");
		System.out.println(monitor4);
		System.out.println(monitor4.brand);
		
		Monitor monitor5=new Monitor(45);
		System.out.println(monitor5);
		System.out.println(monitor5.display);
		
		Monitor monitor6=new Monitor();
		monitor6.width=87.0766d;
		System.out.println(monitor6.width);
		
		Monitor monitor7=new Monitor();
		monitor7.color="white";
		System.out.println(monitor7.color);
		
		Monitor monitor8=new Monitor();
		monitor8.position="left";
		System.out.println(monitor8.position);
		
		Monitor monitor9=new Monitor();
		monitor9.company="hp";
		System.out.println(monitor9.company);
		
		Monitor monitor10=new Monitor();
		monitor10.length=90.8f;
		System.out.println(monitor10.length);
	}

} 