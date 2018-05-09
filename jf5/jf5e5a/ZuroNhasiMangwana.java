/**
 * @author loynaps
 * c5e5
 * 7518
 * Program:ZuroNhasiMangwana.java
 * Description:This is an java program writtten for a module for an
 * event booking application for Shona speaking users
 */

import java.util.*;
import java.time.*;

public class ZuroNhasiMangwana
{
   public static void main(String[] args)
   {
      LocalDate nhasi = LocalDate.now();
      LocalDate musiWanyorwa;
      int mwedzi, zuva, gore;
      int mwedziNhasi, zuvaNhasi, goreNhasi;
      String zvanyogwa;
      final String GORE_PAST = " hausi mugore rino";
      final String MWEDZI_PAST = " uri mumwedzi wapfuura wegore rino";
      final String MWEDZI_FUT = " uri mumwedzi wepamberi mugore rino";
      final String MWEDZI_PRES = " uri mumwedzi uno";
      Scanner input = new Scanner(System.in);
      mwedziNhasi = nhasi.getMonthValue();
      zuvaNhasi = nhasi.getDayOfMonth();
      goreNhasi = nhasi.getYear();

      System.out.print("\tNyora mwedzi >> ");
      mwedzi = input.nextInt();
      System.out.print("\tNyora zuva >> ");
      zuva = input.nextInt();
      System.out.print("\tNyora gore (manhamba mana) >> ");
      gore = input.nextInt();
      musiWanyorwa = LocalDate.of(gore, mwedzi, zuva);

      if(gore != goreNhasi)
         zvanyogwa = GORE_PAST;
      else
         if(mwedzi < mwedziNhasi)
            zvanyogwa = MWEDZI_PAST;
         else
            if(mwedzi > mwedziNhasi)
               zvanyogwa = MWEDZI_FUT;
            else
               zvanyogwa = MWEDZI_PRES;
      System.out.println("\tMusi wanyorwa wokuti: " + musiWanyorwa + zvanyogwa);

   }

}
