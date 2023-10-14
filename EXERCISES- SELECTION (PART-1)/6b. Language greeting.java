import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    String region;
    System.out.println("what language do you speak?");
    System.out.print("'E' for English, 'F' for French, 'G' for German：");
    region=input.nextLine();
    if(region.equals("G"))
    {
      System.out.print("Hallo, wie geht es dir");
    }
    else if(region.equals("E"))
    {
      System.out.print("Hello, how are you");
    }
    else if(region.equals("F"))
    {
      System.out.print("Bonjour comment allez-vous");
    } 
    else
    {
      System.out.println("Sorry, I don't know how to speak this language");
    }
  }
}
