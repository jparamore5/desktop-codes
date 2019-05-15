import java.util.Scanner; 
public class CalcParamore {



	public static void main(String[]args) {

		Scanner scan = new Scanner(System.in);
		
CalcParamoreDemo Calcualtor= new CalcParamoreDemo();

		int decision  = (99);
		do {
			
			decision=Calcualtor.readinput();
		

			if ( decision == 1) 
			{
				System.out.println("the result is"+ Calcualtor.addition());
			} 

			else if (decision ==2 ) 
			{
				System.out.println("the result is "+ Calcualtor.subtraction( ));
			} 
			else if (decision == 3 )
			{
				System.out.println("the result is "+ Calcualtor.multiplication( ));
			}

			else if (decision == 4)
			{
				System.out.println("the result is "+ Calcualtor.division());
			}

			else {}
		}	 while( decision !=0 );				
	}
}


