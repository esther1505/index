package demo1;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*String food;
        System.out.println("tell your food: ");
        food=in.nextLine();
        //condition
      switch (food){
          case "pepsi":
          {
              System.out.println("Price 200"); 
              break;
          }
          case "coca cola":
          {
              System.out.println("Price 400 ");
              break;
          }
          case "noodles":
          {
              System.out.println("Price 600");
              break;
          }
          default:{
              System.out.println("This food is not available");
          }
      }*/

        String week;
        System.out.print("Enter the Number: ");
        week = in.nextLine();
        switch (week) {
            case "1": {
                System.out.println("Sunday");
                break;
            }
            case "2":
            {
                System.out.println("Monday");
                break;
            }
            case "3":
            {
                System.out.println("Tuesday");
                break;
            }
            case "4":
            {
                System.out.println("Wednessday");
                break;
            }
            case "5":
            {
                System.out.println("Thursday");
                break;
            }
            case "6":
            {
                System.out.println("Friday");
                break;
            }
            case "7":
            {
                System.out.println("Saturday");
                break;
            }
            default:
            {
                System.out.println("not a write number");
            }
            
        }

    }

}
