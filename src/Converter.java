public class Converter {

   // Converting a single character.

  public static String converterToAscii(char character) {
      return "Value " + character + " is " + (int) character + " in ascii.";
  }

  // Showing all the lowercase letters.

  public static void showLowerChar() {
      System.out.println("Showing all the lower case letters ascii value");
      for(int i = 97; i <= 122; i++ )
         System.out.println("Value " + (char) i + " is " + i + " in ascii");

  }

 // Showing all the uppercase letters.

  public static void showUpperchar() {
      System.out.println("Showing all the upper case letters ascii value");
      for(int i = 65; i <= 90; i++)
         System.out.println("Value " + (char) i + " is " + i + " in ascii");
  }

}
