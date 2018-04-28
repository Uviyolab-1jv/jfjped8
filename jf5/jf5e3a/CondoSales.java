/**
 * @author loynaps
 * Ch5 EX5 Making Decisions
 * 2018 Apr 26
 * Program:CondoSales.java
 * Description:This is an java program for the Summerdale Sales office whose
 * function is to help users determine the price of a condominium based on the * user's choice.
 */

import java.util.*;

public class CondoSales
{
   private static final int PARK = 1, GOLF = 2, LAKE = 3;
   private static final double PRICE_PARK = 150000;
   private static final double PRICE_GOLF = 170000;
   private static final double PRICE_LAKE = 210000;
   private static final String STR_PARK = "a Park view condo.";
   private static final String STR_GOLF = "a Golf course view condo.";
   private static final String STR_LAKE = "a Lake view condo.";
   private static final String STR_INVALID = "an Invalid option.";

   public static void main(String[] args)
   {
      // Start the inquiry.
      optionsDisplay();
   }

      //Get the user's choice and send it to the processChoice method.
   public static void optionsDisplay()
   {
      int choice;
      Scanner input = new Scanner(System.in);

         // Formatting
      System.out.println("\t--Summerdale Condo Sales Office Menu--");
      System.out.println("\tTo get a condo price please enter:");
      System.out.println("\n\t\t(" + PARK + ") for " + STR_PARK +
                        "\n\t\t(" + GOLF + ") for " + STR_GOLF +
                        "\n\t\t(" + LAKE + ") for " + STR_LAKE);
      System.out.print("\n\tEnter your choice: >> ");
      choice = input.nextInt();
      processChoice(choice);
   }

      //processes the users choice.
   public static void processChoice(int chosen)
   {
      String result;
      double price;
      if(chosen == PARK)
      {
         result = STR_PARK;
         price = PRICE_PARK;
      }
      else
         if(chosen == GOLF)
         {
            result = STR_GOLF;
            price = PRICE_GOLF;
         }
      else
         if (chosen == LAKE)
            {
                result = STR_LAKE;
                price = PRICE_LAKE;
            }
      else
         {
            result = STR_INVALID;
            price = 0;
         }
      System.out.println("\n\tYou selected " + result +
         "\n\tThe price is $" + price);
    }
}
