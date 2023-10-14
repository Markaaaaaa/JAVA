import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter your first num:"); 
    int num1=input.nextInt();
    System.out.print("Enter your second num:");
    int num2=input.nextInt();
    System.out.print("1.Calculate "+num1+"+"+num2+"=");
    int answer1=input.nextInt();
    int a1=num1+num2;
    if(answer1==a1)
    {
      System.out.println("your answer is correct");
    } 
    else
    {
      System.out.println("The correct answer is "+a1);
    }

    System.out.print("2. Calculate "+num1+"*2+"+num2+"=");
    int answer2=input.nextInt();
    int a2=num1*2+num2;
    if(answer2==a2)
    {
      System.out.println("your answer is correct");
    } 
    else
    {
      System.out.println("The correct answer is "+a2);
    }

    System.out.print("2. Calculate "+num1+"*"+num2+"=");
    int answer3=input.nextInt();
    int a3=num1*num2;
    if(answer3==a3)
    {
      System.out.println("your answer is correct");
    } 
    else
    {
      System.out.println("The correct answer is "+a3);
    }
  }
}
