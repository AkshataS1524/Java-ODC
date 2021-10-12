class Movie{
	
	public static void entertain(int ticketPrice,float movieLength,String movieName,float rating,String[] actors)
	{
	System.out.println("Invoked entertainment");
	System.out.println("ticketPrice:"+ticketPrice);
	System.out.println("movieLength:"+movieLength);
	System.out.println("movieName:"+movieName);
	System.out.println("rating:"+rating);
	System.out.println("Actors in the movie:");
	for(int actorsIndex=0;actorsIndex<actors.length;actorsIndex++)
	{
		String actor=actors[actorsIndex];
		System.out.println(actor);
	}
   }
}
	
 