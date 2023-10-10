
//Program #1
class Main {
  public static void main(String[] args) {
    System.out.println("          ");
        System.out.println("o000()");
        System.out.println(" /  _)");
        System.out.println(" |  (");
        System.out.println(" \\__)    ()000o");
        System.out.println("          (_  \\");
        System.out.println("           )  |");
        System.out.println(" oOOO()    (__/");
        System.out.println(" /  _)");
        System.out.println(" |  (");
        System.out.println(" \\__)    ()000o");
        System.out.println("          (_  \\");
        System.out.println("           )  |");
        System.out.println("           (__/"); 
  }
}



//Program #2
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the grade:"); 
    int grade=input.nextInt();
    if(grade>=80)
    {
      System.out.println("More than 80%");
    }
    else if (grade>=60)
    {
      System.out.println("More than 60%");  
    }
    else if (grade>=40)
    {
      System.out.println("Average");  
    }
    else
    {
      System.out.println("Failed");
    }
  }
}

//Program #3
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    final double pi=3.14;
    System.out.print("Enter the radius:"); 
    double radius=input.nextDouble();
    double area;
    if(radius>0){
     area=radius*radius*pi;
      System.out.print("The area of circle is "+ area); 
      // A = π × r^2
    } 
     else{ 
      System.out.print("Negative input ");
    }
  }
}
