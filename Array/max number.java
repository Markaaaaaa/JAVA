class Main {
  public static void main(String[] args) {
    //int [] arr=new int[4];
    int[]arr= new int[]{1, 4, 8, 5};
    //or int[] arr={1, 4, 8, 5};
    System.out.println(arr[1]);
    int max=arr[0];
    for(int i=1; i<arr.length; i++)
    {
      if(arr[i]>max)
      {
        max=arr[i];
      }
    }
    System.out.println(max);
  }
}
