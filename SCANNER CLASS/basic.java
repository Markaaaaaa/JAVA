import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //create a object of scanner
    Scanner input=new Scanner(System.in);
    
    System.out.print("Enter your name: ");

    // takes input from the keyboard
    String name = input.nextLine();

    // prints the name
    System.out.println("My name is " + name);

    // closes the scanner
    input.close();


    // read input from the input stream
    Scanner sc1 = new Scanner(InputStream input);

    // read input from files
    Scanner sc2 = new Scanner(File file);

    // read input from a string
    Scanner sc3 = new Scanner(String str);

  }
}
