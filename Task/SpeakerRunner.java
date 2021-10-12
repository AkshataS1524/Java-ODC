class SpeakerRunner{
	
	public static void main(String[] values){
		int level=4;
		Speaker.volume(level);
		String spk=Speaker.volume(level);
		System.out.println(spk);
		
		boolean value=Speaker.turnOn();
		System.out.println(value);
		//System.out.println(Speaker.turnOn());
		boolean val=Speaker.turnOff();
		System.out.println(val);
		//System.out.println(Speaker.turnOff());
	}
}