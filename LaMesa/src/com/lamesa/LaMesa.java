package LaMesa;

    public class LaMesa {
	
	public static void main(String[] args) {
            
            //All Menu items and prices are stored in separate ArrayLists (Items, Prices, Items, Prices) etc.
            
            Restaurant testR = new Restaurant();
            
            //addNewRestaurant adds two blank ArrayLists to the end of the restMenus ArrayList, which is where bith Prices and Items are stored
            testR.addNewRestaurant();
            testR.addNewRestaurant();
            
            //addMenuItems and addMenuPrices are used to add items to both the menu and prices ArrayLists.
            //An index number must be supplied but it is coded to accept 0 as first and 1 is second etc. (EACH RESTAURANT USES THE SAME NUMBER FOR BOTH MENUS AND PRICES) 
            testR.addMenuItems(0, "Test 1");
            testR.addMenuItems(1, "Test 2");
            testR.addMenuPrices(0, 1.1);
            testR.addMenuPrices(0, 2.2);
            testR.addMenuPrices(1, 3.3);

            //Print statements to demonstrate code
            System.out.println("---Menu Price and Item Return Example--- \n" + testR.returnMenuItems(0));
            System.out.println(testR.returnMenuPrices(0));
            System.out.println(testR.returnMenuItems(1));
            System.out.println(testR.returnMenuPrices(1));
            
            //addRestaurantInfo adds Restaurant Name, current seats and maximum seats to their own arraylist in the set order
            testR.addRestaurantInformation("Example Name", 100, 200);
            testR.addRestaurantInformation("Example Name 2", 10, 1000);

            //Demonstration of the code used to retrieve elements from the ArrayList where, like before, each restaurant in order uses the index 0,1,2 etc.
            System.out.println("---Restaurant Info Example--- \n" + testR.getRestaurantInfo(0));
            System.out.println(testR.getRestaurantName(0));
            System.out.println(testR.getRestaurantCurrSeats(0));
            System.out.println(testR.getRestaurantMaxSeats(0));
            System.out.println(testR.getRestaurantName(1));
            System.out.println(testR.getRestaurantCurrSeats(1));
            System.out.println(testR.getRestaurantMaxSeats(1));
        }
	
}
