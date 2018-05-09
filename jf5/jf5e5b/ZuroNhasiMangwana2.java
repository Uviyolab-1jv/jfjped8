/**
 * @author loynaps
 * c5e5
 * 7518
 * Program:ZuroNhasiMangwana2.java
 * Description:This is an java program writtten for a module for an
 * event booking application for Shona speaking users
 */

import java.util.*;
import java.time.*;

public class ZuroNhasiMangwana2
{
   public static void main(String[] args)
   {
      LocalDate nhasi = LocalDate.now();
      LocalDate musiWanyorwa;
      int mwedzi, zuva, gore;
      int mwedziNhasi, zuvaNhasi, goreNhasi;
      String zvanyogwa;
      final String MUSI_PAST = " rakato darika";
      final String MUSI_PRES = " ndera nhasi";
      final String MUSI_FUT = " harisati rasvika";
      final String ERROR_TXT = " raresvewa kunyogwa";

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

      if(musiWanyorwa.isBefore(nhasi))
         zvanyogwa = MUSI_PAST;
      else
         if(musiWanyorwa.equals(nhasi))
            zvanyogwa = MUSI_PRES;
         else
            if(musiWanyorwa.isAfter(nhasi))
            zvanyogwa = MUSI_FUT;
         else
            zvanyogwa = ERROR_TXT;

      System.out.println("\tZuva remusi wa: " + musiWanyorwa + zvanyogwa);

   }

}
