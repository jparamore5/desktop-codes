
import java.util.Scanner;

public class Calc {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println( "What Mathemtic equation would you like to use enter 1 to add 2 to subtract 3 to multiply 4 to divide?");
		 int decision  = scan.nextInt();
		 System.out.println( "enter first number you would like to compute ?");
		 int num1 = scan.nextInt();
		 System.out.println( "enter second number you would like to compute ?");
		 int num2 = scan.nextInt();
		 
		 if ( decision == 1) 
		 {
			System.out.print("the result is"+addition( num1, num2));
		 } 
		 
		 else if (decision ==2 ) 
		 {
			 System.out.print("the result is "+ subtraction( num1, num2));
		 } 
		  else if (decision == 3 )
		  {
			  System.out.print("the result is "+ multiplication( num1, num2));
		}
		
		else if (decision == 4)
		{
		System.out.print("the result is "+ division( num1, num2));
		}

		else {}
							
	}
		
		
			public static int addition(int num1, int num2) {
				return (num1+num2);
				
				
				
			}	public static int subtraction(int num1, int num2) {
					return (num1-num2);
				
				
			} 	public static int multiplication(int num1, int num2) {
				return (num1*num2);

			}public static double division(int num1, int num2) {
				return (num1/num2);

	}
			
	}


