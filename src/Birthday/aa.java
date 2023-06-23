package Birthday;

import java.time.LocalDate;
import java.time.Month;

public class aa 
{
   public static void main(String args[]) {

   
    int birthDate = 27;
    Month birthMonth = Month.JUNE;

   
    LocalDate currentDate = LocalDate.now();
    System.out.println("Todays Date: " + currentDate);

    
    int date = currentDate.getDayOfMonth();
    Month month = currentDate.getMonth();

    if(date == birthDate && month == birthMonth) {
      System.out.println("HAPPY BIRTHDAY TO YOU SHUBHAM bhoiiiiii!!");
    }
    else {
      System.out.println("Today is not my birthday.");
    }
   }
}
