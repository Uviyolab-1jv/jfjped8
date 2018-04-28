/**
 * @author loynaps
 * Ch5 EX5 Making Decisions
 * 2018 Apr 26
 * Program:CondoSales2.java
 * Description:This is an java program for the Summerdale Sales office whose
 * function is to help users determine the price of a condominium based on the * user's choice.
 */

import java.util.*;

public class CondoSales2
{
   private static double price;
   private static String result;
   private static final int PARK = 1, GOLF = 2, LAKE = 3;
   private static final double PRICE_PARK = 150000;
   private static final double PRICE_GOLF = 170000;
   private static final double PRICE_LAKE = 210000;
   private static final double PRICE_GAR = 5000;
   private static final double PRICE_PSPACE = 0;
   private static final String STR_PARK = "a Park view condo.";
   private static final String STR_GOLF = "a Golf course view condo.";
   private static final String STR_LAKE = "a Lake view condo.";
   private static final String STR_INVALID = "an Invalid option.";
   private static final String STR_GARAGE = "a Garage";
   private static final String STR_PSPACE = "a Parking space";
   private static final String STR_INVALID_P = "an invalid option - assuming no garage.";
   private static final int GARAGE = 1, PSPACE = 2;

   public static void main(String[] args)
   {
      // Start the inquiry.
      optionsDisplay();
   }

      //Get the user's choice and send it to the processCho.ice method.
   public static void optionsDisplay()
   {
      int choice;
      Scanner input = new Scanner(System.in);

         // Formatting
      System.out.println("\t--Summerdale Condo Sales Office Menu--");
         // User input
      System.out.println("\tTo get a condo price please enter:");
      System.out.println("\n\t\t(" + PARK + ") for " + STR_PARK +
                         "\n\t\t(" + GOLF + ") for " + STR_GOLF +
                         "\n\t\t(" + LAKE + ") for " + STR_LAKE);

      System.out.print("\n\tEnter your choice: >> ");
      choice = input.nextInt();
      processChoice(choice);
   }

      //Get the parking space choice and send it to the processing method.
   public static void showParkingOptions()
   {
      int choiceb;
      Scanner input = new Scanner(System.in);
         //Formatting
      System.out.println("\n\t  -------------------------\n");
         // User input
      System.out.println("\tPlease make a parking selection: ");
      System.out.println("\n\t\t(" + GARAGE + ") for " + STR_GARAGE +
                         "\n\t\t(" + PSPACE + ") for " + STR_PSPACE);
      System.out.print("\n\tEnter your selecton >> ");
      choiceb = input.nextInt();
      processParkingChoice(choiceb);
   }

      //processes the users choice.
   public static void processChoice(int chosen)
   {
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
         if(chosen == LAKE)
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
      if(price != 0)
      {
         showParkingOptions();
      }
   }

      //processes the parking space choice.
   public static void processParkingChoice(int chosen)
   {
      if(chosen == GARAGE)
      {
         result = STR_GARAGE;
         price = price + PRICE_GAR;
      }
      else
         if(chosen == PSPACE)
         {
            result = STR_PSPACE;
            price = price + PRICE_PSPACE;
         }
      else
         {
            result = STR_INVALID_P;
            price = price + PRICE_PSPACE;
         }

      System.out.println("\n\tYou selected " + result);
      System.out.println("\tThe new condo price is " + price + "\n");
    }
}
