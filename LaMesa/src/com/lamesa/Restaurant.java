package LaMesa;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Restaurant {
    
    public String restaurantName;
    ArrayList<String> menuItems;
    ArrayList<Double> menuPrices;
    ArrayList<ArrayList> restMenus;
    
    public Restaurant(){
        menuItems = new ArrayList<String>();
        menuPrices = new ArrayList<Double>();
        restMenus = new ArrayList<ArrayList>();
    }
    
    public void addNewRestaurant(){
        
        ArrayList<String> newMenuItems = new ArrayList<String>();
        ArrayList<Double> newMenuPrices = new ArrayList<Double>();
        
        restMenus.add(newMenuItems);
        restMenus.add(newMenuPrices);
    }
    
    public void addMenuItems(int listIndex, String newMenuItem){
        
        int index = 2*listIndex;
        
        if (index<=0){
            index = 0;
        }
        
        restMenus.get(index).add(newMenuItem);
        
    }
    
    public void addMenuPrices(int listIndex, double newMenuPrice){
                
        int index = 2*listIndex + 1;
        
        if(index<=0){
            index = 0;
        }
        
        restMenus.get(index).add(newMenuPrice);
    }
    
    
    
    
    
    
    // Need to add ability to search through main list
    
    
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
    
    public String returnMenuPrices(int listIndex){
        
        int index = 2*listIndex + 1;
        String listString = "";
        
        for (Object s : restMenus.get(index)){
            
            listString += s + "\t";
        }
        return listString;
    }
    
    public int getListLen(){
        return restMenus.size();
    }
}