import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //create a object of scanner
    Scanner input=new Scanner(System.in);
    
    System.out.print("Enter your num ");

    // takes input from the keyboard
    int num1 = input.nextInt();
    int num2 = input.nextInt();

    // prints the name
    System.out.println("The number is " + (num1+num2));

    // closes the scanner
    input.close();
  }
}
