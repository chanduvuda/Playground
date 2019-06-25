import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int num=0;
      for(int rowno=1;rowno<=n;rowno++)
      {
        for(int space=1;space<=(n-rowno);space++)
        {
          System.out.print(" ");
        }
        for(int colno=1;colno<=rowno;colno++)
        {
          num=num+1;
          System.out.print(num+" ");
          
        }
        System.out.print("\n");
	}
}
}