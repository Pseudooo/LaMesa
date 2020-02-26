package lamesa.jack;

public class Restaurant {
    
    private String restName;
    private int maxSeats;
    private int currSeats;
    private Menu menu;
    
    public Restaurant(String restName, int maxSeats, int currSeats, Menu menu){
        
    }
    
    
    
    //Below are the gets for the main variables
    public String getName(){
        return restName;
    }
    
    public int getMaxSeats(){
        return maxSeats;
    }
    
    public int getCurrSeats(){
        return currSeats;
    }
    
    
    
    //Below are the sets for the main variables
    public void setName(String newName){
        this.restName = newName;
    }
    
    public void setMaxSeats(int newMaxSeats){
        this.maxSeats = newMaxSeats;
    }
    
    public void setCurrSeats(int newCurrSeats){
        this.currSeats = newCurrSeats;
    }
}
