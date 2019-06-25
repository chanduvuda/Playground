import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int s=n*n;
    return s;
  }
	public static void main (String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
      int result=square(m);
      m=result;
      System.out.println(m);
	 // Type your code here   
	} 
}