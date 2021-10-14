class GroceryShopStarter{
	
	public static void main(String[] items){
		
		GroceryShop groceryShop = new GroceryShop();
		GroceryShop relianceMartItems = new GroceryShop(1,GroceryShopItems.VEGETABLES,526.56);
		
        System.out.println("2nd order");
		
		int totalItems = relianceMartItems.noOfItems;
		totalItems = 10;
		System.out.println("Total Items : "+totalItems);
		
		GroceryShopItems item = relianceMartItems.items;
		item = GroceryShopItems.VEGETABLES;
		System.out.println("Item ordered : " +item);
		
		double price = relianceMartItems.totalAmount;
		price = 486.2;
		System.out.println("Item Price : "+price);
		}
}