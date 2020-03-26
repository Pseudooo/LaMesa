package LaMesa;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Restaurant {
    
    ArrayList<String> menuItems;
    ArrayList<Double> menuPrices;
    ArrayList<ArrayList> restMenus;
    ArrayList<Object> restInfo;
    String restName;
    int currSeats;
    int maxSeats;
    
    public Restaurant(){
        menuItems = new ArrayList<String>();
        menuPrices = new ArrayList<Double>();
        restMenus = new ArrayList<ArrayList>();
        restInfo = new ArrayList<Object>();
    }
    
    public String getRestInfoArray(){
        return restInfo.toString();
    }
    
    //Below is the Restaurant Information
    
    /**
     * Allows input of restaurant Name, current Seats and Maximum Seats and adds them to an ArrayList
     * @param newRestName
     * @param newCurrSeats
     * @param newMaxSeats 
     */
    public void addRestaurantInformation(String newRestName, int newCurrSeats, int newMaxSeats){
        restName = newRestName;
        currSeats = newCurrSeats;
        maxSeats = newMaxSeats;
        restInfo.add(restName);
        restInfo.add(currSeats);
        restInfo.add(maxSeats);
    }
    
    /**
     * Retrieves the entire ArrayList with all values in a string
     * @param listIndex
     * @return 
     */
    public String getRestaurantInfo(int listIndex){
        
        String stringList = "";
        
        for(Object s : restInfo){
            stringList += s + "\t";
        }
        
        return stringList;
    }
    
    /**
     * Returns a string of a Restaurant Name dependant upon the index number placed in
     * @param listIndex
     * @return 
     */
    public String getRestaurantName(int listIndex){
        int index = 3*listIndex;
        String stringList = "";
        
        if(listIndex <= 0){
            index = 0;
        }
                
        stringList = "" + restInfo.get(index);
        
        return stringList;
    }
        
    /**
     * Returns a string of the Current Number of Seats dependant upon the index number placed in
     * @param listIndex
     * @return 
     */
    public String getRestaurantCurrSeats(int listIndex){
        int index = 3*listIndex + 1;
        String stringList = "";
        
        if(listIndex <= 0){
            index = 1;
        }
        
        stringList = "" + restInfo.get(index);
        
        return stringList;
    }
        
    /**
     * Returns a string of the Maximum Number of Seats dependant upon the index number placed in
     * @param listIndex
     * @return 
     */
    public String getRestaurantMaxSeats(int listIndex){
        int index = 3*listIndex + 2;
        String stringList = "";
        
        if(listIndex <= 0){
            index = 2;
        }
        
        stringList = "" + restInfo.get(index);

        return stringList;
    }
    
    
    //Below is the Menu Gets and Sets
    
    /**
     * Adds two blank ArrayLists to the main ArrayList (restMenus)
     * 
     * SHOULD RUN EVERYTIME A RESTAURANT IS ADDED TO SET UP THE ARRAYLISTS
     */
    public void addNewRestaurant(){
        
        ArrayList<String> newMenuItems = new ArrayList<String>();
        ArrayList<Double> newMenuPrices = new ArrayList<Double>();
        
        restMenus.add(newMenuItems);
        restMenus.add(newMenuPrices);
    }
    
    /**
     * Adds a String of a Menu Item to the menuItems ArrayList
     * @param listIndex
     * @param newMenuItem 
     */
    public void addMenuItems(int listIndex, String newMenuItem){
        
        int index = 2*listIndex;
        
        if (index<=0){
            index = 0;
        }
        
        restMenus.get(index).add(newMenuItem);
        
    }

    /**
     * Adds a Double of a Menu Item Price to the menuPrices ArrayList
     * @param listIndex
     * @param newMenuPrice 
     */
    public void addMenuPrices(int listIndex, double newMenuPrice){
                
        int index = 2*listIndex + 1;
        
        if(index<=0){
            index = 0;
        }
        
        restMenus.get(index).add(newMenuPrice);
    }
    
    
    /**
     * Returns a String of all Items within an Indexed ArrayList
     * @param listIndex
     * @return 
     */
    public String returnMenuItems(int listIndex){
        
        int index = 2*listIndex;
        String listString = "";

        if(listIndex<=0){
            index = 0;
        }
        
        for (Object s : restMenus.get(index)){
            
            listString += s + "\t";
        }
        return listString;
    }
    
    /**
     * Returns a String of all Prices within an Indexed ArrayList
     * @param listIndex
     * @return 
     */
    public String returnMenuPrices(int listIndex){
        
        int index = 2*listIndex + 1;
        String listString = "";
        
        for (Object s : restMenus.get(index)){
            
            listString += s + "\t";
        }
        return listString;
    }
    
    public int getRestInfoLen(){
        return restInfo.size();
    }
    
    public int getRestMenusLen(){
        return restMenus.size();
    }
    
    public int getMenuItemsLen(int listIndex){
        
        int index = 2*listIndex;
        
        if (index<=0){
            index = 0;
        }
        return restMenus.get(index).size();
    }
    
    public int getMenuPricesLen(int listIndex){
        int index = 2*listIndex + 1;
        
        if (index<=0){
            index = 0;
        }
        
        return restMenus.get(index).size();
    }
}