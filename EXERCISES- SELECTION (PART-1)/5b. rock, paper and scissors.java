import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    String user1, user2;
    System.out.println("choose from rock, paper and scissors for user1");
    user1=input.nextLine();
    System.out.println("choose from rock, paper and scissors for user2");
    user2=input.nextLine();
    if(user1.equals("rock"))
    {
      if(user2.equals("paper"))
      {
        System.out.println("user 2 wins");
      }
      if(user2.equals("rock"))
      {
        System.out.println("tie");
      }
       if(user2.equals("scissors"))
       {
        System.out.println("user 1 wins");
       }
    }
    else if(user1.equals("paper"))
    {
      if(user2.equals("paper"))
      {
        System.out.println("tie");
      }
      if(user2.equals("rock"))
      {
        System.out.println("user 1 wins");
      }
      if(user2.equals("scissors"))
      {
        System.out.println("user 2 wins");
      }
    }
    else if(user1.equals("scissors"))
    {
       if(user2.equals("paper"))
       {
        System.out.println("user 1 wins");
       }
       if(user2.equals("rock"))
       {
        System.out.println("user 2 wins");
       }
       if(user2.equals("scissors"))
       {
        System.out.println("tie");
       }
    } 
    else
    {
      System.out.println("if you guys are not playing the game, GET OUT!");
    }
  }
}
