import java.util.Scanner;

public class CarlysEventPrice

{
	public static void main(String[] args)
	{
    displayCost();
	}

	public static void displayCost()
   {
      final int PRICE_PER_GUEST = 35;
      int numberOfGuest, total;
      boolean isBigEvent;
      String numberOfGuestStr;
      Scanner input = new Scanner(System.in);
      
      
      System.out.println("Please enter the number of guests attending the event: ");
      numberOfGuestStr = input.nextLine();
      numberOfGuest = Integer.parseInt(numberOfGuestStr);
      
      
      total = numberOfGuest * PRICE_PER_GUEST;
      
       
      if (numberOfGuest >= 50)
      {
         isBigEvent = true;
      }
      
      else
      {
         isBigEvent = false;
      }
      
      System.out.println("*************************************************");
      System.out.println("* Carly’s makes the food that makes it a party. *");
      System.out.println("*************************************************");
      System.out.println("Number of Guests: " + numberOfGuest +
                         "\nPrice per guest: $" + PRICE_PER_GUEST +
                         "\nTotal price: $" + total +
                         "\nIs this this a big event? " + isBigEvent);
      
   }
   
}