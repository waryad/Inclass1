
/*
 Name = Deepinder Kaur Warya
  Student Number = 991459788

 */
package cardtrickice1;


import static cardtrickice1.Card.SUITS;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found
 *
 *
 */
public class CardTrickICE1
{

    public static void main(String[] args) 
    {
        Card[] magicHand = new Card[7]; //Array of object
        
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(1+(int)(Math.random()*13));//used a method to generate random *13
            
             Random r = new Random();
             int randomNumber =r.nextInt(SUITS.length);
     
           c1.setSuits((SUITS[randomNumber]));
        
           System.out.println( c1.getValue()+"    " +  c1.getSuits()); 
           
           magicHand[i] = c1;
        
        }
                 
        
            Card c2=new Card();

            Scanner input=new Scanner(System.in);
    
            System.out.println("Enter the number  "); 

            int n = input.nextInt();
            if (n>13||n<0){
            System.out.print("Enter the number again between 1 and 13  "); 
            n= input.nextInt(); 
}

            System.out.print("Enter the suit   "); 
             String s= input.next();

            c2.setValue(n);
            c2.setSuits(s)  ;
            System.out.println( c2.getValue()+"    " +  c2.getSuits());
   
             boolean found = false;
             System.out.println("Searching for: " + c2);
            for (int i = 0; i < magicHand.length; i++) {
            if ((magicHand[i].getValue() == c2.getValue()) && magicHand[i].getSuits().equalsIgnoreCase(c2.getSuits())) {
            System.out.println("Card is found in magic hand at index " + (i+1));
            found = true;
            break;    
            }
        }
        if (!found)
            System.out.println("Card is not found in magic hand.");

}  
   

}   