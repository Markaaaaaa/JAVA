import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter your age:"); 
    int age=input.nextInt();
    if(age<13)
    {
      System.out.println("You are a child");
    }
    else if (age>=13&&age<=19)
    {
      System.out.println("You are a teen");  
    }
    else if (age>=20&&age<=65)
    {
      System.out.println("You are an adult");  
    }
    else if (age>65)
    {
      System.out.println("You are a senior citizen");  
    }
  }
}
