import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    final String programmer="Mark";
    System.out.print("Enter your name:"); 
    String user=input.nextLine();
    if(programmer.equals(user))
    {
      System.out.println("Your name is same as the programmer's name");
    }
    else
    {
      System.out.println("Your name is different from the programmer's name");
    }
  }
}
