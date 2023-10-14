import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    String region;
    System.out.println("where they you from?");
    System.out.print("Canada, China, Germany or somewhere else:");
    region=input.nextLine();
    if(region.equals("Canada"))
    {
      System.out.print("Canada is a country in North America. Its ten provinces and three territories extend from the Atlantic Ocean to the Pacific Ocean and northward into the Arctic Ocean, making it the world's second-largest country by total area, with the world's longest coastline. ");
    }
    else if(region.equals("China"))
    {
      System.out.print("China (Chinese: 中国; pinyin: Zhōngguó), officially the People's Republic of China (PRC), is a country in East Asia. It is the world's second-most populous country with a population exceeding 1.4 billion.");
    }
    else if(region.equals("Germany"))
    {
      System.out.print("Germany, officially the Federal Republic of Germany, is a country in the western region of Central Europe. It is the second-most populous country in Europe after Russia, and the most populous member state of the European Union.");
    } 
    else
    {
      System.out.println("I don't know anything about " + region);
    }
  }
}
