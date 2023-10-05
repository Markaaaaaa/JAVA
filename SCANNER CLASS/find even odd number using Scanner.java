import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //create a object of scanner
    Scanner input=new Scanner(System.in);
    System.out.print("Enter your num: ");
    int nub = input.nextInt();
    if(nub%2==0)
    {
      System.out.println(nub+ " is a even number");
    }
    else 
    {
      System.out.println(nub+ " is a odd number");  
    }

    // closes the scanner
    input.close();
  }
}
