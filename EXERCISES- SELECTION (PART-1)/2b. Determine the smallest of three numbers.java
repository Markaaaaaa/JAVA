import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter your first num:"); 
    double num1=input.nextDouble();
    System.out.print("Enter your second num:");
    double num2=input.nextDouble();
    System.out.print("Enter your third num:");
    double num3=input.nextDouble();
    if(num1<num2&&num1<num3)
    {
      System.out.println(num1+" is the smallest number");
    }
    else if(num2<num3&&num2<num1)
    {
      System.out.println(num2+" is the smallest number");
    }
    else if(num3<num1&&num3<num2)
    {
      System.out.println(num3+" is the smallest number");
    }
    else
    {
      System.out.println("There are at least two smallest numbers");
    }
  }
}
