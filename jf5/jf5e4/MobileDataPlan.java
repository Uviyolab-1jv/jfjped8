/**
 * @author loynaps
 * c5e4 Making Decisions
 * 5518
 * Program:MobileDataPlan.java
 * Description:This is a customer service data plan recomendation java program
 * for Horizon Mobiles, a provider of cellular phone service.
 */

import java.util.Scanner;

public class MobileDataPlan
{

  private static boolean infoValid = true;
  private static final double TALKTIME_THRESH_1 = 0, TALKTIME_THRESH_2 = 500;
  private static final int TXT_THRESH_1 = 0, TXT_THRESH_3 = 100;
  private static final double DATA_THRESH_1 = 0, DATA_THRESH_2 = 2;
  private static final String PLA_STR = "Plan A",
      PLB_STR = "Plan B",
      PLC_STR = "Plan C",
      PLD_STR = "Plan D",
      PLE_STR = "Plan E",
      PLF_STR = "Plan F";
  private static final double PRA = 49, PRB = 55, PRC = 61, PRD = 70, PRE = 79, PRF = 87;

  public static void main(String[] args)
  {
    userScreenPlans();
  }

  public static void userScreenPlans()
  {
    int maxSentTxtMesgs;
    double maxTalkTime, maxDataUsed;
    Scanner input = new Scanner(System.in);

    System.out.println("\t\t--Welcome to Horizons Phones Accounts Menu--");
    System.out.println("\tTo recieve a recomendation of the best plan for your needs");

    System.out.print("\tPlease enter your maximum monthly value for talk minutes used >> ");
    maxTalkTime = input.nextDouble();

    System.out.print("\tPlease enter your maximum monthly number of text messages sent >> ");
    maxSentTxtMesgs = input.nextInt();

    System.out.print("\tPlease enter your maximum monthly value for data used >> ");
    maxDataUsed = input.nextDouble();
    processUserValues(maxTalkTime, maxSentTxtMesgs, maxDataUsed);
  }

public static void processUserValues(
      double maxTalkTime, int maxSentTxtMesgs, double maxDataUsed)
{
   double planPrice;
   String result;

   if (maxDataUsed > DATA_THRESH_1)
      if (maxDataUsed <= DATA_THRESH_2)
      {
        result = PLE_STR;
        planPrice = PRE;
      }
      else
      {
        result = PLF_STR;
        planPrice = PRF;
      }
   else
      if(maxTalkTime < TALKTIME_THRESH_2)
         if(maxSentTxtMesgs == TXT_THRESH_1 && maxDataUsed == DATA_THRESH_1)
         {
            result = PLA_STR;
            planPrice = PRA;
         }
         else
         {
            result = PLB_STR;
            planPrice = PRB;
         }
   else
      if(maxSentTxtMesgs < TXT_THRESH_3)
      {
         result = PLC_STR;
         planPrice = PRC;
      }
      else
      {
         result = PLD_STR;
         planPrice = PRD;
      }
    System.out.println(
        "\n\tYour monthly requirements are: "
            + maxTalkTime
            + " minutes for talk time, "
            + maxSentTxtMesgs
            + " text messages and "
            + maxDataUsed
            + " gigabyte of data");
    System.out.println("\tWe recomend " + result + " at the price of $" + planPrice + " per month");
  }
}
