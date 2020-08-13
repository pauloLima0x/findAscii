import java.util.Scanner;


public class FindAsciiChar {

  public static void main(String[] args) {

      System.out.println("Choice a option");
      System.out.println("1 - Show a ascii value of a character");
      System.out.println("2 - show all ascii value of all lowercase letters");
      System.out.println("3 - show all ascii value of all uppercase letters");
      System.out.println("Enter a character to see its ascii value: ");
      Scanner scan = new Scanner(System.in);
      int choice = scan.nextInt();
      if(choice == 1) {
         System.out.println("Enter a character");
         char numbToConv = scan.next().charAt(0);
         System.out.println("The ASCII value of " + numbToConv + " is: " + (int) numbToConv);
      } else if(choice == 2) {
          Converter.showLowerChar();
      } else if(choice == 3) {
          Converter.showUpperchar();
      } else {
          System.out.println("Error! Invalid input");
      }

  }

}
