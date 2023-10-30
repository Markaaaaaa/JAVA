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
Iteration    variable    condition: i<arr.length   action
  1st        i=1, max=1       ture                arr[1]>max, max=arr[1]=4,i is increased to 2
  2nd        i=2, max=4        ture               arr[2]>max, max=arr[2]=8,i is increased to 3
  3rd        i=3, max=8        ture               arr[3]<max, max=arr[2]=8,i is increased to 4
  4th        i=4, max=8        false               The loop is terminated
