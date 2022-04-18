/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;


import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class SHOPPING {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         Scanner keyedInput = new Scanner(System.in);
         
           final double usb = 19.99;
           final double keyboard = 49.99;
              final double mouse = 25.99;
               final double tax = 0.13;
               
               
        
        int sumusb;
        int sumkeyboard;
        int summouse;
        double price;
                 
        System.out.println("How many USB's would you like to purchase");
        sumusb = keyedInput.nextInt();
        System.out.println("How many keyboards would you like to purchase");
        sumkeyboard = keyedInput.nextInt();
        System.out.println("How many Mice would you like to purchase");
        summouse = keyedInput.nextInt();
        
        price = ((usb * sumusb) + (keyboard * sumkeyboard) + (mouse * summouse)) * tax;
        
         System.out.println("Your total cost with tax is: $"+ price +"");
        
        // TODO code application logic here
    }
    
}
