package LaMesa;

    public class LaMesa {
	
	public static void main(String[] args) {
            
            Restaurant testR = new Restaurant();
            testR.addNewRestaurant();
            testR.addNewRestaurant();
            
            testR.addMenuItems(0, "Test 1");
            testR.addMenuItems(1, "Test 2");
            testR.addMenuPrices(0, 1.1);
            testR.addMenuPrices(0, 2.2);
            testR.addMenuPrices(1, 3.3);

            System.out.println(testR.returnMenuItems(0));
            System.out.println(testR.returnMenuPrices(0));
            System.out.println(testR.returnMenuItems(1));
            System.out.println(testR.returnMenuPrices(1));
        }
	
}
