class Speaker{
	
	public static String volume(int level){
		if(level<=0)
		{
			System.out.println("Level is Zero");
			String msg="Turn ON Speaker";
			return msg;
		}
		else if(level<=3)
		{
			System.out.println("Level is less than 3");
			String msg1="The Speaker level is Okayyy";
			return msg1;
		}
		else if(level>3 && level<5)
		{
			System.out.println("Level is greater than 3 and less than5 5");
			String msg2="Speaker is Loud";
			return msg2;
		}
		else if(level>5 && level<9)
		{
			System.out.println("Level is greater than 5 and less than 9");
			String msg3="Speaker is tooo Loud";
			return msg3;
		}
		else 
		{
			System.out.println("Level is greater than 9");
			String msg4="Call the POLICE!!!!!";
			return msg4;
		}
		
	}
	public static boolean turnOn(){
			System.out.println("Invoked turnOn");
			boolean turnOn=true;
			return turnOn;
		}
		public static boolean turnOff(){
			System.out.println("Invoked turnOff");
			return false;
		}
}