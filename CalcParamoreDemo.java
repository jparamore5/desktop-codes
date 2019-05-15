import java.util.Scanner; 
public class CalcParamoreDemo {
	Scanner scan = new Scanner(System.in);
int num1; 
int num2; 

	public int addition() {
		return (num1+num2);



	}	
	public int subtraction() {
		return (num1-num2);


	} 	
	public int multiplication() {
		return (num1*num2);

	}
	public double division() {
		return (num1/num2);

	}
	public  int readinput() {

		System.out.println( "What Mathemtic equation would you like to use enter 1 to add 2 to subtract 3 to multiply 4 to divide?");
		int decision  = scan.nextInt();
		System.out.println( "enter first number you would like to compute ?");
		 num1 = scan.nextInt();
		System.out.println( "enter second number you would like to compute ?"); 
		 num2 = scan.nextInt();
		return decision;
		}
	}



