import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      while(true)
        {
      int numberofdays;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the month number");
      int monthNumber=s.nextInt();
      if(monthNumber>=1 && monthNumber<=12)
      {
     switch(monthNumber)
       {
     case 1:
     case 3:
     case 5:
     case 7:
     case 8:
     case 10:
     case 12:
     numberofdays=31;
     System.out.println("number of days are "+numberofdays);
     break;
     case 2:
     System.out.println("its non leap year then 28 days or its leap year then 29 days");
     break;
     case 4:
     case 6:
     case 9:
     case 11:
     numberofdays=30;
     System.out.println("number of days are "+ numberofdays);
     break;
       }
      }
      else{
        System.out.println("Invalid Details");
      }
        }
    }
}

  