/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaMesa;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jhunk
 */
public class RestaurantTest {
    
    public RestaurantTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getRestInfoArray method, of class Restaurant.
     */
    @Test
    public void testGetRestInfoArray() {
        System.out.println("getRestInfoArray");
        Restaurant instance = new Restaurant();
        instance.addRestaurantInformation("Example Name", 100, 200);
        String expResult = "[Example Name, 100, 200]";
        String result = instance.getRestInfoArray();
        assertEquals(expResult, result);
    }

    /**
     * Test of addRestaurantInformation method, of class Restaurant.
     */
    @Test
    public void testAddRestaurantInformation() {
        System.out.println("addRestaurantInformation");
        String newRestName = "";
        int newCurrSeats = 0;
        int newMaxSeats = 0;
        Restaurant instance = new Restaurant();
        instance.addRestaurantInformation(newRestName, newCurrSeats, newMaxSeats);
        assertEquals(3, instance.getRestInfoLen());
    }

    /**
     * Test of getRestaurantInfo method, of class Restaurant.
     */
    @Test
    public void testGetRestaurantInfo() {
        System.out.println("getRestaurantInfo");
        int listIndex = 0;
        Restaurant instance = new Restaurant();
        instance.addRestaurantInformation("Example Name", 100, 200);
        String expResult = "Example Name	100	200	";
        String result = instance.getRestaurantInfo(listIndex);
        assertEquals(expResult, result);
    }

    /**
     * Test of getRestaurantName method, of class Restaurant.
     */
    @Test
    public void testGetRestaurantName() {
        System.out.println("getRestaurantName");
        int listIndex = 0;
        Restaurant instance = new Restaurant();
        instance.addRestaurantInformation("Example Name", 100, 200);
        String expResult = "Example Name";
        String result = instance.getRestaurantName(listIndex);
        assertEquals(expResult, result);
    }

    /**
     * Test of getRestaurantCurrSeats method, of class Restaurant.
     */
    @Test
    public void testGetRestaurantCurrSeats() {
        System.out.println("getRestaurantCurrSeats");
        int listIndex = 0;
        Restaurant instance = new Restaurant();
        instance.addRestaurantInformation("Example Name", 100, 200);
        String expResult = "100";
        String result = instance.getRestaurantCurrSeats(listIndex);
        assertEquals(expResult, result);
    }

    /**
     * Test of getRestaurantMaxSeats method, of class Restaurant.
     */
    @Test
    public void testGetRestaurantMaxSeats() {
        System.out.println("getRestaurantMaxSeats");
        Restaurant instance = new Restaurant();
        instance.addRestaurantInformation("Example Name", 100, 200);
        String expResult = "200";
        String result = instance.getRestaurantMaxSeats(0);
        assertEquals(expResult, result);
    }

    /**
     * Test of addNewRestaurant method, of class Restaurant.
     */
    @Test
    public void testAddNewRestaurant() {
        System.out.println("addNewRestaurant");
        Restaurant instance = new Restaurant();
        instance.addNewRestaurant();
        int expResult = 2;
        assertEquals(expResult, instance.getRestMenusLen());
    }

    /**
     * Test of addMenuItems method, of class Restaurant.
     */
    @Test
    public void testAddMenuItems() {
        System.out.println("addMenuItems");
        Restaurant instance = new Restaurant();
        instance.addNewRestaurant();
        instance.addMenuItems(0, "Test 1");
        int expResult = 1;
        assertEquals(expResult, instance.getMenuItemsLen(0));
    }

    /**
     * Test of addMenuPrices method, of class Restaurant.
     */
    @Test
    public void testAddMenuPrices() {
        System.out.println("addMenuPrices");
        Restaurant instance = new Restaurant();
        instance.addNewRestaurant();
        instance.addMenuPrices(0, 1.1);
        int expResult = 1;
        assertEquals(expResult, instance.getMenuPricesLen(0));
    }

    /**
     * Test of returnMenuItems method, of class Restaurant.
     */
    @Test
    public void testReturnMenuItems() {
        System.out.println("returnMenuItems");
        int listIndex = 0;
        Restaurant instance = new Restaurant();
        instance.addNewRestaurant();
        instance.addMenuItems(0, "Test 1");
        String expResult = "Test 1	";
        String result = instance.returnMenuItems(listIndex);
        assertEquals(expResult, result);
    }

    /**
     * Test of returnMenuPrices method, of class Restaurant.
     */
    @Test
    public void testReturnMenuPrices() {
        System.out.println("returnMenuPrices");
        int listIndex = 0;
        Restaurant instance = new Restaurant();
        instance.addNewRestaurant();
        instance.addMenuPrices(0, 1.1);
        String expResult = "1.1	";
        String result = instance.returnMenuPrices(listIndex);
        assertEquals(expResult, result);
    }

    /**
     * Test of getRestInfoLen method, of class Restaurant.
     */
    @Test
    public void testGetRestInfoLen() {
        System.out.println("getRestInfoLen");
        Restaurant instance = new Restaurant();
        instance.addRestaurantInformation("Example Name", 100, 200);
        int expResult = 3;
        int result = instance.getRestInfoLen();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getRestMenusLen
     */
    @Test
    public void testGetRestMenusLen() {
        System.out.println("getRestMenusLen");
        Restaurant instance = new Restaurant();
        instance.addNewRestaurant();
        int expResult = 2;
        int result = instance.getRestMenusLen();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getMenuItemsLen
     */
    @Test
    public void testGetMenuItemsLen() {
        System.out.println("getMenuItemsLen");
        Restaurant instance = new Restaurant();
        instance.addNewRestaurant();
        instance.addMenuItems(0, "Test 1");
        int expResult = 1;
        int result = instance.getMenuItemsLen(0);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getMenuPricesLen
     */
    @Test
    public void testGetMenuPricesLen() {
        System.out.println("getMenuPricesLen");
        Restaurant instance = new Restaurant();
        instance.addNewRestaurant();
        instance.addMenuPrices(0, 1.1);
        int expResult = 1;
        int result = instance.getMenuPricesLen(0);
        assertEquals(expResult, result);
    }
}
