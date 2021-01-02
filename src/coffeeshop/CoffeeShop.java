/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeeshop;

/**
 *
 * @author Jahin
 */
public class CoffeeShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Coffee coffee = ;
        CoffeeFactory cfact = new CoffeeFactory();
        
        coffee = instance.getCoffee("CoffeeA");
        coffee.makeCoffee();
        coffee = cfact.getCoffee("CoffeeB");
        coffee.makeCoffee();
        coffee = cfact.getCoffee("CoffeeC");
        coffee.makeCoffee();
        
    }
    
}
