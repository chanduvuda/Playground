import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner sc=new Scanner(System.in);
     
      int option=sc.nextInt();
      switch(option)
      {
        case 1:
          System.out.println("one");
          break;
      
        case 2:
          System.out.println("two");
          break;
           case 3:
          System.out.println("Three");
          break; 
            case 4:
          System.out.println("four");
          break;
            case 5:
          System.out.println("five");
          break;
        default:
          System.out.println("Invalid");
      }
    }
}

          
          
	