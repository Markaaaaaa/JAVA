import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter your first num:"); 
    double num1=input.nextDouble();
    System.out.print("Enter your second num:");
    double num2=input.nextDouble();
    if(num1>num2)
    {
      System.out.println(num1+" is the greater number");
    }
    else if(num1<num2)
    {
      System.out.println(num2+" is the greater number");
    }
    else
    {
      System.out.println("The two numbers are equal");
    }
  }
}
