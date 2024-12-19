// A simple program demonstrating String objects.

public class Main
{
   public static void main(String[] args)
   {
      String greeting = "Good morning, ";
      String name = "Herman";

      System.out.println(greeting + name);
   
      int stringSize;

      stringSize = name.length();
      System.out.println(name + " has " + stringSize +
                         " characters.");
                        
      String message = "Java is Great Fun!";
      String upper = message.toUpperCase();
      String lower = message.toLowerCase();
      char letter = message.charAt(2);
      stringSize = message.length();

      System.out.println(message);
      System.out.println(upper);
      System.out.println(lower);
      System.out.println(letter);
      System.out.println(stringSize);
                         
   }
}
