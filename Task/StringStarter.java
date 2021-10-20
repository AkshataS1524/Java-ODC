class StringStarter{
	public static void main(String[] water)
	{
		//constructors from string class
		String tree=new String("Neem");//String(String ref)
		System.out.println(tree);
		char[] myName={'A','K','S','H','A','T','A'};
		String myNameIs=new String(myName);//String(char[] ref)
		System.out.println(myNameIs);
		String calculation=new String(myName,2,3);//String(char[] ref,int offset,int count)
		System.out.println(calculation);
		int[] points={65,66,67,68,69,70};
		String codePoints=new String(points,2,4);//String(int[] ref,int offest,int count)
		System.out.println(codePoints);
		byte[] bytes={72,73,74,75,76,77};
		String conversion=new String(bytes);//String(byte[] ref)
		System.out.println(conversion);
		String con=new String(bytes,2,3);//String(byte[],int offset,int length)
		System.out.println(con);
		StringBuffer sb=new StringBuffer("Hello "); 
		String buffer=new String(sb);//String(StringBuffer ref)
		System.out.println(buffer);
		String plant=new String("Neem");
		if(tree==plant)
		{
			System.out.println("both strings are pointing to same memory location");
		
		}
		else
		{
			System.out.println(" strings are not pointing to same memory location");
		}
		
		//15 methods from string class
		
		char returns=tree.charAt(2);
	    System.out.println(returns);
		
		boolean contains=myNameIs.contains("ki");
		System.out.println(contains);
		
		int codePoint=plant.codePointAt(1);
		System.out.println(codePoint);
		
		int beforeChar=buffer.codePointBefore(2);
		System.out.println(beforeChar);
		
		int countPoint=conversion.codePointCount(1,4);
		System.out.println(countPoint);
		
		int compare=tree.compareTo(plant);
		System.out.println(compare);
		
		int caseCompare=myNameIs.compareToIgnoreCase(buffer);
		System.out.println(caseCompare);
		
		String mobile="Oneplus";
		String cam=" quad cam";
		String concate=mobile.concat(cam);
		System.out.println(concate);
		
		boolean isEqual=tree.contentEquals(sb);
		System.out.println(isEqual);
		
		String value=String.copyValueOf(myName);
		System.out.println(value);
		
		String copy=String.copyValueOf(myName,1,4);
		System.out.println(copy);
		
		boolean end=concate.endsWith("cam");
		System.out.println(end);
		
		boolean equal=plant.equals(tree);
		System.out.println(equal);
		
		String s1="hello";
		CharSequence cs="hello";
		boolean contentEqual=s1.contentEquals(cs);
		System.out.println(contentEqual);
		
		byte[] values=myNameIs.getBytes();
		for(int index=0;index<values.length;index++)
		{
			System.out.println(values[index]);
		}
		
	}
}