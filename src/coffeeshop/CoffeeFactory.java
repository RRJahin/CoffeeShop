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
public class CoffeeFactory {
    
    public Coffee getCoffee(String type){
        if(type.equalsIgnoreCase("CoffeeA")){
            return new CoffeeA();
        }
        else if(type.equalsIgnoreCase("CoffeeB")){
            return new CoffeeB();
        }
        if(type.equalsIgnoreCase("CoffeeC")){
            return new CoffeeC();
        }
        return null;
    }
    
}
