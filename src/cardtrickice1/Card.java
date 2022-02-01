/*
 *  Name = Deepinder Kaur Warya
  Student Number = 991459788

 */

        
package cardtrickice1;

import java.util.Random;
/** define card value and suits
 * 
 *
 * @author Deepinder
 */
public class Card 
{
    private int value;
    private String suits; //encapsulation
    //constant
    public static final String [] SUITS = { "diamonds","clubs","spades","hearts"};

    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }

    public String getSuits() {
        return suits;
    }
   
      public void setSuits(String suits) {
        this.suits = suits;
    }
      public String toString(){
      return getValue()+ " "+getSuits();
      }
 

    
}
